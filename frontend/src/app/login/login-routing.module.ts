import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginAnonimoComponent } from './login-anonimo/login-anonimo.component';

const routes: Routes = [
  {
    path: '',
    component: LoginAnonimoComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class LoginRoutingModule { }
