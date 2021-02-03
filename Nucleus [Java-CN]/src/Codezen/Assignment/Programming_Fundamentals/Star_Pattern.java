package Codezen.Assignment.Programming_Fundamentals;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 15/06/2017.
 */
public class Star_Pattern {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int row=scan.nextInt();
        int c=row-1,i=1,j=1;
        while(i<=row)
        {
            j=1;
            while(j<=c)
            {
                System.out.print(" ");
                j++;
            }
            j=1;
            while(j<=(2*i)-1)
            {
                System.out.print("*");
                j++;
            }
            System.out.println("");
            i++;
            c--;
        }

    }
}
