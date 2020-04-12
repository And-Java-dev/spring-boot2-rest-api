package com.example.springboot2restapi;

import java.util.ArrayList;
import java.util.List;

public class Employees {

    private List<Employe> employeList;

    public List<Employe> getEmployeList(){
        if (employeList == null){
            employeList = new ArrayList<>();
        }
        return employeList;
    }

    public void setEmployeList(List<Employe> employeList) {
        this.employeList = employeList;
    }
}
