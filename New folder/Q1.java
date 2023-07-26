package com.mycompany.q1;

import java.util.Scanner;
public class Q1 
{

    public static void main(String[] args) 
    {
        int no1,no2,ans;
        Scanner sc=new Scanner(System.in);
        try
        {
            System.out.println("Enter First Number: ");
            no1=sc.nextInt();
            System.out.println("Enter Second Number");
            no2=sc.nextInt();
            ans=no1/no2;
            System.out.println("result: "+ans);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error: Number divide by zero error. \n"+e);
        }
    }
}
