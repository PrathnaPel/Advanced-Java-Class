import { Component, OnInit } from '@angular/core';
import { CourseService } from '../services/CourseService';

@Component({
  selector: 'app-course-navigator',
  templateUrl: './course-navigator.component.html',
  styleUrls: ['./course-navigator.component.css']
})
export class CourseNavigatorComponent implements OnInit {

  constructor(private courseService : CourseService) { }
  courses:[];
  ngOnInit(): void {
    this.courseService.findAllCourse().then(crs => this.courses = crs)
  }

}
