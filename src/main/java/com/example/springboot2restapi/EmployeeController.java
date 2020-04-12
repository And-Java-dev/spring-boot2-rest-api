package com.example.springboot2restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    @Autowired
    private EmployeeDAO employeeDAO;

    @GetMapping
    public Employees getEmployees(){
        return employeeDAO.getAllEmployees();
    }

    @PostMapping
    public ResponseEntity addEmployee(@RequestBody Employe employe){
        int id = employeeDAO.getAllEmployees().getEmployeList().size() + 1;
        employe.setId(id);
        employeeDAO.addEmployee(employe);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(employe.getId())
                .toUri();

        return ResponseEntity.status(200).build();
    }
}
