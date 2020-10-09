import { Injectable } from '@angular/core';

@Injectable()
export class CourseService{
    findAllCourse = () => fetch('http://localhost:8080/api/v1/course').then(res => res.json());
}