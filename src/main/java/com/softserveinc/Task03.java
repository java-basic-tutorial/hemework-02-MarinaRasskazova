package com.softserveinc;

import java.util.Scanner;

/*
    Write a program that determines the minimum of a sequence positive numbers (the length of the sequence is not limited).

    The user should input the numbers until enter a zero or negative number.

    The example below shows how your output might look. The symbol >>> represents the user input.
    Notice that it's not the part of the input.

    Enter the number after symbol >>>. To exit enter a zero.
    >>> 12
    >>> 75
    >>> 10
    >>> 9
    >>> 23
    >>> 0
    Minimum number is 9
 */
public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: Write your code here
        int min=Integer.MAX_VALUE;
        int number;
        System.out.println("Enter the number after symbol >>>. To exit enter a zero.");
        do{
            System.out.print(">>> ");
            number=scanner.nextInt();
            if(number==0 || number<0){
                break;
            }
            if (number<min){
                min=number;
            }

        } while (true);
        System.out.printf("Minimum number is %d", min);

    }
}
