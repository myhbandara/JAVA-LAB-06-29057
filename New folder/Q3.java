package com.mycompany.q3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Q3 
{

    public static void main(String[] args) 
    {
       try
       {
           File file=new File("nonexistent.txt");
           Scanner scanner=new Scanner(file);
           
           while(scanner.hasNextLine())
           {
               String line=scanner.nextLine();
               System.out.println(line);
           }
           scanner.close();
       }
       catch(FileNotFoundException e)
       {
           System.out.println("Error: File not found. \n"+e);
       }
    }
}
