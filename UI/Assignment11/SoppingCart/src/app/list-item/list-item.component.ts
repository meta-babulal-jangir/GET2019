import { Component, OnInit ,Input} from '@angular/core';
import { Item } from '../item';
import { CartService } from '../shared/cart.service';

@Component({
  selector: 'app-list-item',
  templateUrl: './list-item.component.html',
  styleUrls: ['./list-item.component.css']
})
export class ListItemComponent implements OnInit {

  constructor(private _cartService:CartService) { }
  @Input() item :Item;
  ngOnInit() {
  }
  itemInCart=[];
  numberOfItemInCart:number
  addToCart(item){
    this.itemInCart.push(item);
    this._cartService.itemInCart.subscribe((data:any)=>{
    this.itemInCart = data;
      
    });
    console.log(this.itemInCart);
  }

}
