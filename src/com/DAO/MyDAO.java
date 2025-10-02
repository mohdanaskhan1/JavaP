package com.DAO;

import com.DTO.EmployeeDTO;

import java.sql.Array;

public class MyDAO {

    private EmployeeDTO err[]= new EmployeeDTO[10];

    public String insert(EmployeeDTO data){
        err[0] = data;
        return "Data Inserted Successfully";
    }

    public EmployeeDTO[] read(){
        return err;
    }
}
