
package com.tw.apistackbase.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeResource {
	 List<Employee> employees= new ArrayList<Employee>();
	 @GetMapping(path = "/")
	 public ResponseEntity<List<Employee>> getMapping(){

		 employees.add(new Employee("001","lily",12,"female"));
		 return ResponseEntity.ok(employees);
	 }
	 
	@PostMapping(path = "/")
	@ResponseStatus(HttpStatus.CREATED)
	public List<Employee> createEmployee(@RequestBody Employee employee) {
		employees.add(employee);
		return employees;
	}
	
}
