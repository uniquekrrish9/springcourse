package com.company;

import com.company.model.ProxyStudentData;
import com.company.studentinterface.StudentData;

public class Main {
    public static void main(String[] args){
        StudentData studentData = new ProxyStudentData(10,"Hari",20.00);
        studentData.getBookAccess();
    }
}
