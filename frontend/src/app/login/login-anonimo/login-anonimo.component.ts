import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginService } from '../login.service';
import { Usuario } from '../../models/usuario';

@Component({
  selector: 'app-login-anonimo',
  templateUrl: './login-anonimo.component.html',
  styleUrls: ['./login-anonimo.component.css']
})
export class LoginAnonimoComponent implements OnInit {

  nickname = '';
  usuarios: Usuario[] = [];

  constructor(private loginService: LoginService, private router: Router) {
  }

  ngOnInit(): void {
  }

  entrar(){
    console.log('nickname ...', this.nickname);
    console.log('usuarios ...',this.usuarios);

    const resposta = this.loginService.loginAnonimo().subscribe((usuarios: Usuario[]) => {
      this.usuarios = usuarios;
    });
    console.log('usuarios ...',this.usuarios);
    this.validaNickaname();
  }


  validaNickaname(){
    const result = this.usuarios.find(user => user.nickname === this.nickname);

    if(result != null){
      alert('usuario ja existe')
    }else{
     // this.router.navigateByUrl('chat');
    }
  }

}
