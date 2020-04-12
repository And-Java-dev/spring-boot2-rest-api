package com.example.springboot2restapi;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {
    private static Employees list = new Employees();

    static
    {
    list.getEmployeList().add(new Employe(1,"jojo","jojo@mail.com"));
    list.getEmployeList().add(new Employe(1,"John","John@mail.com"));
    list.getEmployeList().add(new Employe(1,"az","az@mail.com"));
    }

    public Employees getAllEmployees(){
        return list;
    }

    public void addEmployee(Employe employe) {
        list.getEmployeList().add(employe);
    }

}
