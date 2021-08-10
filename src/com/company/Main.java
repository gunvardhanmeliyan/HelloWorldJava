package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello World");
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        System.out.printf("Hello %s, have a Great Day!!",name);
    }
}
