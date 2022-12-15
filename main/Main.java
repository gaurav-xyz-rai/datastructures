package main;

import recursion.*;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello, World!!");
        /* The Recursion classes*/
        System.out.println("The Fibonacci number is : " + new Fibonacci().fibonacci(-15));
        System.out.println("The Sum of Digits are : " + new SumOfDigits().sumOfDigits(10345));
        System.out.println("The power is : " + new Power().power(5,-1));
        System.out.println("The GCD of the two numbers are : " + new Gcd().gcd(8,-4));
        System.out.println("The Binary is : " + new DecimalToBinary().decimalToBinary(-333));
        System.out.println("The factorial of the number is : " + new Factorial().factorial(5));
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println("The Product of the Array Is : " + new ProductOfArray().productofArray(arr,arr.length));
        System.out.println("The recursive Range is : " + new RecursiveRange().recursiveRange(6));
        System.out.println("The reverse of the String is : " + new Reverse().reverse("appmillers"));
        System.out.println("This string is Palindrome : " + new Palindrome().isPalindrome("tacocat"));
        System.out.println("The first capital character in the String is : " + new FirstCapital().first("appmillerS"));
        System.out.println("The capitalized word is : " + new CapitalizeWords().capitalizeWord("i love java"));
    }
}
