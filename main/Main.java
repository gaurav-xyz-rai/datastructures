package main;

import recursion.Fibonacci;
import recursion.SumOfDigits;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello, World!!");

        /* The Recursion classes*/

        System.out.println("The Fibonacci number is : " + new Fibonacci().fibonacci(-15));
        System.out.println("The Sum of Digits are : " + new SumOfDigits().sumOfDigits(10345));


    }
}
