package Homework_week1_kapil;

import java.util.Scanner;

public class Input_twonumbers
{
    public static void main(String[] args)

    {
        System.out.println("Taking input from the user:");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first input:");
        int a = sc.nextInt();
        System.out.println("Enter the second input:");
        int b = sc.nextInt();
        int Result= a*b;
        System.out.println("The expected result is: "+Result);

    }
}
