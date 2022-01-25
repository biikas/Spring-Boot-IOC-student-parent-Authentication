package com.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manager extends Authentication {

    private Student student;
    private Parent parent;

    @Autowired
    public Manager(Student student, Parent parent) {
        this.student = student;
        this.parent = parent;
    }

    public void checkAuthentication(){
//        Student student= new Student("Ram","Shyam");
//        check(student.getUsername(),student.getPassword());
//
//        Student parent= new Student("Ram","Shyam");
//        check(student.getUsername(),student.getPassword());
        student.setUsername("Ram");
        student.setPassword("1921");
        check(student.getUsername(), student.getPassword());

        parent.setUsername("1921");
        parent.setPassword("1921");
        check(parent.getUsername(), parent.getPassword());




    }

}
