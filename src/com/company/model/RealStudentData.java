package com.company.model;

import com.company.studentinterface.StudentData;

public class RealStudentData implements StudentData {
    int id;
    String name;
    double fee;

    public RealStudentData() {

    }

    public RealStudentData(int id, String name, double fee) {
        this.id = id;
        this.name = name;
        this.fee = fee;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getFee() {
        return fee;
    }

    @Override
    public void getBookAccess() {
        System.out.println("Can get Access");
    }
}
