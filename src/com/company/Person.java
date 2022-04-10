package com.company;

import java.util.Scanner;

public class Person {
    String surnameNansamba57153, firstnameNansamba57153, streetNansamba57153, zipCodeNansamba57153, cityNansamba57153;

    public void initializeNansamba57153(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your surname.");
        surnameNansamba57153 = input.nextLine();
        System.out.println("Enter your firstname.");
        firstnameNansamba57153= input.nextLine();
        System.out.println("Enter your street.");
        streetNansamba57153= input.nextLine();
        System.out.println("Enter your zipcode.");
        zipCodeNansamba57153= input.nextLine();
        System.out.println("Enter your city.");
        cityNansamba57153= input.nextLine();
    }

    public void printNansamba57153() {
        System.out.println(  surnameNansamba57153);
        System.out.println(  firstnameNansamba57153);
        System.out.println(  streetNansamba57153);
        System.out.println(  zipCodeNansamba57153);
        System.out.println(  cityNansamba57153);
    }
}
