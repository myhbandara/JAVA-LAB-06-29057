package com.mycompany.q2;

import java.util.Scanner;
public class Q2 
{

    public static void main(String[] args) 
    {
        int arr[]=new int[3];
        Scanner sc=new Scanner(System.in);
        try
        {
            System.out.println("Enter First Number: ");
            arr[0]=sc.nextInt();
            System.out.println("Enter Second Number");
            arr[1]=sc.nextInt();
            arr[2]=arr[0]/arr[1];
            //System.out.println("result: "+arr[2]);
            System.out.println("result: "+arr[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error: Number divide by zero error. \n"+e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index out of bounds \n"+e);
        }
    }
}
