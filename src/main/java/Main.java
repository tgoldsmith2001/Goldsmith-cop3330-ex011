/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many Euros are you exchanging? ");
        String Str1 = input.nextLine();
        System.out.print("What is the exchange rate? ");
        String Str2 = input.nextLine();
        double Euros = Double.parseDouble(Str1);
        double Rate = Double.parseDouble(Str2);
        double Dollars = Math.round(Euros * Rate * 100.0) / 100.0;
        System.out.format("%.2f euros at an exchange rate of %f is\n%.2f U.S dollars.", Euros, Rate, Dollars);
    }
}