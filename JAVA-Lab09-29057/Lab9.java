/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab9;

/**
 *
 * @author Yudula
 */
public class Lab9 {

    public static void main(String[] args) 
    {
        CheckingAccount obj1 = new CheckingAccount();
        obj1.setdata(99, 1000000);
        System.out.println("interest is"+obj1.calculateinterest());
        SavingsAccount obj2 = new SavingsAccount();
        obj2.setdata(99, 20000000);
    }
}
