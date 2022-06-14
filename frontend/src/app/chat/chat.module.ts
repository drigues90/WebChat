import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ChatRoutingModule } from './chat-routing.module';
import { ChatGroupComponent } from './chat-group/chat-group.component';
import { ChatComponent } from './chat/chat.component';
import { ChatHeaderComponent } from './chat-header/chat-header.component';


@NgModule({
  declarations: [
    ChatGroupComponent,
    ChatComponent,
    ChatHeaderComponent
  ],
  imports: [
    CommonModule,
    ChatRoutingModule
  ]
})
export class ChatModule { }
