
/*QUESTION -
Write a program to input name and marks of three tests of a
student and calculate and print the name and average of
best two test marks.
*/
package Lectures.Lecture_2_Programming_Fundamentals.Assignment_2A;
/**
 * Created by Ayush Deshwal on 12/06/2017.
 */
import java.util.Scanner;
public class Bst_Of_2_Test_Marks {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        char ch='y';
        do {
            System.out.print("Enter Your Name: ");
            String name=scan.next();
            System.out.println("\nEnter Name And Marks Of 3 Subjects You Have Studied: ");
            String subject1 = scan.next();
            float marks1 =scan.nextFloat();
            String subject2 = scan.next();
            float marks2 =scan.nextFloat();
            String subject3 = scan.next();
            float marks3 =scan.nextFloat();
            if(marks1>=marks3 && marks2>=marks3)
            {
                System.out.println(subject1+" & "+subject2+" have his/her best of 3");
                System.out.println("Average of the 2 is: "+((marks1+marks2)/2) +"\n");
            }
            else if(marks1>=marks2 && marks3>=marks2)
            {
                System.out.println(subject1+" & "+subject3+" have his/her best of 3");
                System.out.println("Average of the 2 is: "+((marks1+marks3)/2)+"\n");
            }
            else
            {
                System.out.println(subject2+" & "+subject3+" are his/her best out of 3 subjects");
                System.out.println("Average of the 2 is: "+((marks3+marks2)/2)+"\n");
            }
            System.out.println("Want to Enter for Another Student: ");
            ch=scan.next().charAt(0);

        }while(ch=='y' || ch=='Y');
    }
}
