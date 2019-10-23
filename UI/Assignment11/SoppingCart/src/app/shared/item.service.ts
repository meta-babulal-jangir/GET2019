import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Item } from '../item';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ItemService {

  constructor(private http:HttpClient) { }
  getItem():Observable<Item[]>{
    return this.http.get<Item[]>('http://localhost:3000');
  }
  getItemByCategory(value):Observable<Item[]>{
    return this.http.get<Item[]>('http://localhost:3000/'+value);
  }

}

