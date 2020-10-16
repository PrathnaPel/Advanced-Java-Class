import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { ProfileComponent } from './profile/profile.component';
import { RegisterComponent } from './register/register.component';
import { routing } from './app-routing.module'
import { FormsModule } from '@angular/forms';
import { UserService } from './services/user.service.client';
import { CourseNavigatorComponent } from './course-navigator/course-navigator.component';
import { CourseService } from './services/CourseService';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    ProfileComponent,
    RegisterComponent,
    CourseNavigatorComponent
  ],
  imports: [
    routing,
    BrowserModule,
    FormsModule,
    AppRoutingModule
  ],
  providers: [UserService,CourseService],
  bootstrap: [AppComponent]
})
export class AppModule { }
