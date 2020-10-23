import { Injectable } from "@angular/core";

@Injectable()
export class EmployeeService{
    getAllEmployee = () => fetch('http://localhost:8080/api/v1/employees').then(res => res.json());
}
