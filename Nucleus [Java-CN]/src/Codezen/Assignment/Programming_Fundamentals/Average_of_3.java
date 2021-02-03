package Codezen.Assignment.Programming_Fundamentals;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 15/06/2017.
 */
public class Average_of_3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        char name=scan.next().charAt(0);
        System.out.println("\nEnter Name And Marks Of 3 Subjects You Have Studied: ");
        String subject1 = scan.next();
        int marks1 =scan.nextInt();
        String subject2 = scan.next();
        int marks2 =scan.nextInt();
        String subject3 = scan.next();
        int marks3 =scan.nextInt();
        int avg=(marks1+marks2+marks3)/3;
        System.out.println(name);
        System.out.println("\n\naverage is: " +avg);
    }
}
