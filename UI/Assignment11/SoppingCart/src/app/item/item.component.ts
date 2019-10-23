import { Component, OnInit } from '@angular/core';
import { ItemService } from '../shared/item.service';

@Component({
  selector: 'app-item',
  templateUrl: './item.component.html',
  styleUrls: ['./item.component.css'],
})

export class ItemComponent implements OnInit {

  constructor(private itemService:ItemService) { }
  items=[];
  ngOnInit() {
    console.log(this.items);
    this.itemService.getItem().subscribe((data:any)=>{
      this.items = data;
      console.log(this.items);
    });
  }

  onChange(value) {
    this.itemService.getItemByCategory(value).subscribe((data:any)=>{
      this.items = data;
      console.log(this.items);
    });
    }

}
