package com.company.model;

import com.company.studentinterface.StudentData;

public class ProxyStudentData implements StudentData {
    RealStudentData realStudentData;
    int id;
    String name;
    double feee;

    public ProxyStudentData(){

    }

    public ProxyStudentData( int id, String name, double feee) {
        this.id = id;
        this.name = name;
        this.feee = feee;
    }

    @Override
    public void getBookAccess() {
        RealStudentData realStudentData = new RealStudentData(id,name,feee);
        if (realStudentData.getFee()>1000){
            realStudentData.getBookAccess();
        }else {
            System.out.println("Can not get Access");
        }

    }
}
