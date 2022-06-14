import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login-anonimo',
  templateUrl: './login-anonimo.component.html',
  styleUrls: ['./login-anonimo.component.css']
})
export class LoginAnonimoComponent implements OnInit {

  nickname = '';

  constructor(private router: Router) {
  }

  ngOnInit(): void {
  }

  entrar(){
    console.log('nickname ...', this.nickname);
    this.router.navigateByUrl('chat');
  }

}
