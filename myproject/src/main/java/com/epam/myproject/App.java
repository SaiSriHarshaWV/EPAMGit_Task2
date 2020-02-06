package com.epam.myproject;
import java.util.Scanner;
import com.epam.myproject.newyear.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("NEW YEAR GIFT\n");
        Scanner sc=new Scanner(System.in);
        int totalcost=0;
        sweets s=new sorting();
        System.out.println("enter number of chocolates");
        int ch=sc.nextInt();
        for(int i=0;i<ch;i++)
        {
        	System.out.println("enter name of the chocolates");
        	String name=sc.next();
        	System.out.println("enter the weight of the chocolate");
        	int weight=sc.nextInt();
        	System.out.println("enter the cost of the chocolate");
        	int cost=sc.nextInt();
        	totalcost=totalcost+cost;
        	s.setvalues(name,weight);
        	s.setvaluesbyweight(weight,name);
        }
        System.out.println("\nenter number of candy");
        int ca=sc.nextInt();
        for(int i=0;i<ca;i++)
        {
        	System.out.println("enter name of the candys");
        	String name=sc.next();
        	System.out.println("enter the weight of the candy");
        	int weight=sc.nextInt();
        	System.out.println("enter the cost of the candy");
        	int cost=sc.nextInt();
        	totalcost=totalcost+cost;
        	s.setvalues(name,weight);
        	s.setvaluesbyweight(weight,name);
        }
        System.out.println("\nSorted with respect to name");
        s.getvalues();
        System.out.println("\nSorted with respect to weight");
        s.getvaluesbyweight();
        System.out.println("\nTotal cost of sweets");
        System.out.print(totalcost);
        
    }
}

