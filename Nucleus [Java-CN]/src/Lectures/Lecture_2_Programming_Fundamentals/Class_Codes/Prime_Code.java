package Lectures.Lecture_2_Programming_Fundamentals.Class_Codes;
/**
 * Created by Ayush Deshwal on 10/06/2017.
 */
import java.util.Scanner;
public class Prime_Code {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=s.nextInt();
        int i=2;
        int flag=0;
        if(num==1) {
            System.out.println("Its none");
            return;
        }
        while(i<=(num/2)) {
            if (num % i == 0) {
                flag = 1;
                break;
            }
          i++;
        } if(flag==1)
             System.out.println(num + " is not a Prime");
         else System.out.println(num + " is Prime");


    }
}
