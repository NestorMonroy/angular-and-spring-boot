import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class HardcodedAuthenticationService {

  constructor() { }

  authenticate(username : any, password : any) {
    //console.log('before ' + this.isUserLoggedIn());
    if(username==="nestor" && password === '123') {
      sessionStorage.setItem('authenticaterUser', username);
      //console.log('after ' + this.isUserLoggedIn());
      return true;
    }
    return false;
  }

  isUserLoggedIn() {
    let user = sessionStorage.getItem('authenticaterUser')
    return !(user === null)
  }

  logout(){
    sessionStorage.removeItem('authenticaterUser')
  }
}
