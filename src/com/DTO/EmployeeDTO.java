package com.DTO;

public class EmployeeDTO {
    private int EId;
    private String Ename;
    private String EAddress;
    private int ESalary;

    public EmployeeDTO(int EId, String ename, int ESalary, String EAddress) {
        this.EId = EId;
        this.Ename = ename;
        this.ESalary = ESalary;
        this.EAddress = EAddress;
    }

    public int getEId() {
        return EId;
    }

    public void setEId(int EId) {
        this.EId = EId;
    }

    public String getEname() {
        return Ename;
    }

    public void setEname(String ename) {
        Ename = ename;
    }

    public String getEAddress() {
        return EAddress;
    }

    public void setEAddress(String EAddress) {
        this.EAddress = EAddress;
    }

    public int getESalary() {
        return ESalary;
    }

    public void setESalary(int ESalary) {
        this.ESalary = ESalary;
    }
}
