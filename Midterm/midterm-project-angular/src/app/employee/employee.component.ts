import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../services/EmployeeService';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  constructor(private employeeServices:EmployeeService) { }

  employees:[];

  ngOnInit(): void {
    this.employeeServices.getAllEmployee().then(emp => this.employees = emp);
  }
}
