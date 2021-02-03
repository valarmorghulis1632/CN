/*QUESTION -
Write a program to calculate the total salary of a person. The
user has to enter the basic and the grade and depending
upon which the total salary is calculated as:
t_sal = basic + hra + da + allow – pf
where : hra = 20% of basic
da = 50% of basic
allow = 1700 if grade = ‘A’
allow = 1500 if grade = ‘B’
allow = 1300 if grade = ‘C’
pf = 11% of basic.
 */
package Lectures.Lecture_2_Programming_Fundamentals.Assignment_2A;

/**
 * Created by Ayush Deshwal on 12/06/2017.
 */
import java.util.Scanner;
public class Salary_Calculation
{
    public static void main(String[] args)
    {
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter Your Name: ");
      String name=scan.nextLine();
      System.out.println("Enter Your Basic Pay: ");
      float basic=scan.nextFloat();
      System.out.println("Enter Your Employee Grade Assigned By The Company: ");
      char grade=scan.next().charAt(0);
      float hra=(20.0f/100)*basic;
      float da=(50.0f/100)*basic;
      int allowance=0;
      if(grade=='A' || grade=='a')
           allowance=1700;
      else if(grade=='B' || grade=='b')
           allowance=1500;
      else if( grade=='C' || grade=='c')
           allowance=1300;
      double pf=(11.0d/100)*basic;
      double total_salary= basic + hra + da - pf + allowance;
        long total_salary_1= (long)(total_salary*10);
        if((total_salary_1%10)>=5)
            total_salary_1=total_salary_1+10;

        total_salary_1=total_salary_1/10;
        System.out.println("\n\n"+total_salary_1);

    }
}
