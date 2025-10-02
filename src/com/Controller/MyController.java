package com.Controller;

import com.DTO.EmployeeDTO;
import com.Service.MyService;

public class MyController {
    private MyService myService;

    public MyController() {
        myService = new MyService();
    }

    public String getData(EmployeeDTO data){
        String result = myService.getData(data);
        return result;
    }

    public EmployeeDTO[] readData() {
        EmployeeDTO[] data = myService.readData();
        return data;

    }
}
