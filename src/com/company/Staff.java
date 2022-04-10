package com.company;

import java.util.Scanner;
import java.io.IOException;

public class Staff extends Person {
String educationNansamba57153 , positionNansamba57153;


    public void initialize1Nansamba57153() throws IOException {
        Scanner input = new Scanner(System.in);
        initializeNansamba57153();
        System.out.println("Enter your education.");
        educationNansamba57153 = input.nextLine();
        System.out.println("Enter your position.");
        positionNansamba57153 = input.nextLine();
    }
    public void print1Nansamba57153() {
        printNansamba57153();
        System.out.println(educationNansamba57153);
        System.out.println(positionNansamba57153);
    }
}
