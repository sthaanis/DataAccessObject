/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.DataAcessObject.ConcreteClass;

import com.leapfrog.DataAcessObject.ObjectInterface.StudentDAO;
import com.leapfrog.DataAcessObject.ValueObject.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class StudentDAOImpl implements StudentDAO {

    List<Student> students;

    public StudentDAOImpl() {
        students = new ArrayList<Student>();
        Student student1 = new Student("Anish", 1);
        Student student2 = new Student("Ram", 2);
        students.add(student1);
        students.add(student2);

    }

    @Override
    public List<Student> getAllStudent() {
        return students;

    }

    @Override
    public Student getStudent(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student Roll No" + student.getRollNo() + "Student Updated");
    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student.getRollNo());
        System.out.println("Student RollNo:" + student.getRollNo() + "deleted from database");
    }

}
