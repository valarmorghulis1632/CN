package Lectures.Lecture_2_Programming_Fundamentals.Class_Codes;
/**
 * Created by Ayush Deshwal on 10/06/2017.
 */
import java.util.Scanner;
public class Pattern_Code_2 {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter The Number of Rows");
        int row=s.nextInt();
        int c=row-1;
        int num,i=1,j=1;
        while(i<=row)
        {  j=1;
            while(j<=c) {
            System.out.print(" ");
            j++;
           }
           num=i;
           while(num<=(2*i)-1) {
               System.out.print(num);
               num++;
           }
           num=num-2;
           while(num>=i) {
               System.out.print(num);
               num--;
           }
            System.out.println("");
          i++;
          c--;
        }



    }
}
