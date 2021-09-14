package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Anh Pham
 *
 */
public class App 
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("What is the principal amount? ");
        int principal = input.nextInt();


        System.out.print("What is the rate? ");
        double rate = input.nextDouble();


        System.out.print("What is the number of years? ");
        int year = input.nextInt();

        System.out.print("What is the number of times the interest is compounded per year? ");
        int times = input.nextInt();


        double worth = principal*Math.pow(1+((rate*0.01)/times),times*year);

        System.out.printf("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f.\n",
                principal, rate, year, times, worth);

        input.close();
    }
}
