import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ChatGroupComponent } from './chat-group/chat-group.component';
import { ChatComponent } from './chat/chat.component';

const routes: Routes = [
  {
    path: '',
    component: ChatComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ChatRoutingModule { }
