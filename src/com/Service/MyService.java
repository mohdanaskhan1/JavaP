package com.Service;

import com.DAO.MyDAO;
import com.DTO.EmployeeDTO;

public class MyService {
    private String result;

    private MyDAO myDAO;

    public MyService() {
        myDAO = new MyDAO();
    }

    public String getData(EmployeeDTO data){
        String result = validateMyData(data);
        if(result.equals("Valid")){
            result = myDAO.insert(data);
            return result;
        }
        else{
            return result;
        }
    }

    public EmployeeDTO[] readData(){
        EmployeeDTO[] read = myDAO.read();
        return read;

    }


    private String validateMyData(EmployeeDTO data) {
        int eId = data.getEId(); // 0<id<100
        String eName = data.getEname(); //2<n<=30
        String eAddress = data.getEAddress();//5<a<=30
        int eSalary = data.getESalary();//1000<=s<=1000

        if (eId<0 || eId>99){
            result = "Invalid Id";
        } else if (eName.length()<2 || eName.length()>30) {
            result = "Invalid Name";
        } else if (eAddress.length()<5 || eAddress.length()>30) {
            result = "Invalid Address";
        } else if (eSalary<1000 || eSalary>10000) {
            result = "Invalid Salary";
        } else {
            result = "Valid";
        }


        return result;
    }
}
