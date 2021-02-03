package Lectures.Lecture_2_Programming_Fundamentals.Class_Codes;
/**
 * Created by Ayush Deshwal on 12/06/2017.
 */
import java.util.Scanner;
public class Fib_Less_Than_N {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER THE UPPER LIMIT: ");
        int num=scan.nextInt();
        System.out.println("\n");
        int first=0,second=1,sum=1;
        if(num<=0)
            System.out.println("Nothing to Print");
        else if(num==1)
            System.out.println(first);
        else {
            System.out.println(first);
            while (sum < num) {
                System.out.println(sum);
                sum=first+second;
                first=second;
                second=sum;
            }
        }
    }
}
