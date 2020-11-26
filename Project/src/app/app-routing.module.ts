import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CourseComponent } from './course/course.component';
import { ErrorComponent } from './error/error.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { StudentComponent } from './student/student.component';

const routes: Routes = [
  /*{path:'',component:LoginComponent},
  {path:'student',component:StudentComponent},
  {path:'course',component:CourseComponent},
  {path:'home',component:HomeComponent},
  {path:'**',component:ErrorComponent}*/

  {path:'',component:LoginComponent},
  {
    path:'home',component:HomeComponent,
    children:[
      {path:'student',component:StudentComponent},
      {path:'course',component:CourseComponent}
    ]
  },
  {path:'**',component:ErrorComponent}
]
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
