import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  username = 'nestor'
  password =''
  errorMessage='Invalid Credentials'
  invalidLogin = false

  //Router
  //Dependency Injection
  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  handleLogin(){
    if(this.username === "nestor" && this.password === '123'){
      //Redirect to Welcome Page
      this.invalidLogin = false
      this.router.navigate(['welcome', this.username])
    }else{
      this.invalidLogin = true
    }
    console.log(this.username)

  }
}
