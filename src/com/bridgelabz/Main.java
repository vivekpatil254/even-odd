package com.bridgelabz;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	        int number;
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter The number");
             number = sc.nextInt();
                if(number%2==0)
                    System.out.println("The "+number+" is an even number");
                else
                   System.out.println("The "+number+" is an Odd number");
    }
}
