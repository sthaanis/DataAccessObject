/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.DataAcessObject.ObjectInterface;

import com.leapfrog.DataAcessObject.ValueObject.Student;
import java.util.List;

/**
 *
 * @author User
 */
public interface StudentDAO {

    public List<Student> getAllStudent();

    public Student getStudent(int rollNo);

    public void updateStudent(Student student);

    public void deleteStudent(Student student);

}
