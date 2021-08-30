/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("How many Euros are you exchanging? ");
        String Str1=input.nextLine();
        System.out.print("What is the exchange rate? ");
        String Str2=input.nextLine();
        double Euros= Double.parseDouble(Str1);
        double Rate= Double.parseDouble(Str2);
        double Dollars= Round_up(Euros*Rate);
        System.out.format("%.2f euros at an exchange rate of %f is\n%.2f U.S dollars.",Euros,Rate,Dollars);
    }
    //A function that uses a base 10 system to round a number up to 2 decimal places (up to next penny)
    public static double Round_up(double num){
        //Convert number to string
        String n=String.valueOf(num);
        double Ret=0;
        int decimal=n.indexOf('.');
        //Remove decimal from string for the purpose of calculations
        String N=n.replace(".","");
        for (int i = 0; i <= decimal+1; i++) {
            //Gets value at specific decimal index
            int decimal_value=Character.getNumericValue((N.charAt(i)));
            //Case where i is at location to be rounded up
            if(i==decimal+1)
                decimal_value+=1;
            //Adds decimal at index i to return by a factor of 10^(i-1)
            Ret+=(Math.pow(10,decimal-i-1))*decimal_value;
        }
        return Ret;
    }
}