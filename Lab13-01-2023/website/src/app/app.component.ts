import { Component, HostListener, ViewChild } from '@angular/core';
import { MatToolbarModule } from '@angular/material/toolbar'; 
import { MatIconModule } from '@angular/material/icon'; 
import { MatCardModule } from '@angular/material/card';
 import { MatButtonModule } from '@angular/material/button';
 
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  template: '<h1>Hello! Welcome</h1>'
})
export class AppComponent {
  title = 'Soham';
  public num1!:number;
  public num2!: number;
  public num3!:number;

  add(){
    this.num3=this.num1+this.num2;
  }
  sub(){
    this.num3=this.num1-this.num2;
  }
  div(){
    this.num3=this.num1/this.num2;
  }
  mult(){
    this.num3=this.num1*this.num2;
  }
}

