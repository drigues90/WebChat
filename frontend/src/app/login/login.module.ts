import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { LoginRoutingModule } from './login-routing.module';
import { LoginAnonimoComponent } from './login-anonimo/login-anonimo.component';
import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    LoginAnonimoComponent
  ],
  imports: [
    CommonModule,
    LoginRoutingModule,
    FormsModule
  ]
})
export class LoginModule { }
