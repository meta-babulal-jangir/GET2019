import { Component ,ViewChild} from '@angular/core';
import { CartService } from './shared/cart.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent {
  title = 'SoppingCart';
  private _cartService:CartService
  constructor(){}
  
}
