import { Component, OnInit } from '@angular/core';
//import { AppComponent } from '../app.component';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent implements OnInit {

  message : string = 'Some welcome Message'

  constructor() { }
  ngOnInit(): void {
    this.message = 'modify message'
    console.log(this.message)
  }

}

export class Class1 {

}

export class Class2 {
  
}