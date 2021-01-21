package com.company.dahms;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello World");
        int age = 18;
        double gpa = 3.5;
        boolean isRaining = false;

        System.out.println(age+ "|"+ gpa+ "|" + isRaining);

        String city = "Columbus";
        System.out.println(city.toUpperCase());


        int dailyHighs[] = {50,60,70,80,90};


        for(int i=0; i<=4; i++){
            System.out.println(dailyHighs[i]);
        }

        int twoDeeArray[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        int sum = 3+2;
        System.out.println(sum);
        double a = 10;
        double b = 4;
        double quotient = (a/b);
        System.out.println(quotient);

        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println(name);

    }
}
