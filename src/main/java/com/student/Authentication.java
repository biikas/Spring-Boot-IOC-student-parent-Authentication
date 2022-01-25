package com.student;

//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Authentication {

   //Student student = new Student("Ram", "1921");

    public void check(String username,String password) {
        if (username.equalsIgnoreCase("Ram") && password.equalsIgnoreCase("1921")) {
            System.out.println("Welcome "+username);
        } else {
            System.out.println("Incorrect password");
        }

    }




}
