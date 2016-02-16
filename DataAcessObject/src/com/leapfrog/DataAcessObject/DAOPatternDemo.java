/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.DataAcessObject;

import com.leapfrog.DataAcessObject.ConcreteClass.StudentDAOImpl;
import com.leapfrog.DataAcessObject.ObjectInterface.StudentDAO;
import com.leapfrog.DataAcessObject.ValueObject.Student;

/**
 *
 * @author User
 */
public class DAOPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentDAO studentDao = new StudentDAOImpl();

        //print all student
        for (Student student : studentDao.getAllStudent()) {
            System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
        }

        //update student
        Student student = studentDao.getAllStudent().get(0);
        student.setName("Michale");
        studentDao.updateStudent(student);

        //get student
        studentDao.getStudent(0);
        System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
    }

}
