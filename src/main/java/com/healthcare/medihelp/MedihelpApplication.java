package com.healthcare.medihelp;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MedihelpApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedihelpApplication.class, args);
        System.out.println("Hello");

//        Connection con = null;
//        try {
//            // Correct the typo in the JDBC URL from "mqsql" to "mysql"
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/medihelp", "root", "qwertyuiop");
//
//            System.out.println("con " + con);
//            if (con != null) {
//                System.out.println("Database connected");
//            }
//
//        } catch (Exception e) {
//            // Print the exception details to understand the issue
//            e.printStackTrace();
//            System.out.println("Not connected");
//        }
    }
}
