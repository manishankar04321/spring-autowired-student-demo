package com.example.autowireddemo.model;

import org.springframework.stereotype.Component;

@Component
public class Certification {

    private int id = 501;
    private String name = "Spring Framework Certification";
    private String dateOfCompletion = "2026";

    public void displayCertification() {
        System.out.println("Certification ID: " + id);
        System.out.println("Certification Name: " + name);
        System.out.println("Date Of Completion: " + dateOfCompletion);
    }
}