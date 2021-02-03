package Codezen.Assignment.Programming_Fundamentals;


import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 15/06/2017.
 */
public class Arrow_Pattern {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF ROWS: ");
        int row=scan.nextInt();
        int i=1,j;
        while(i<=(row/2)+1)
        {
            j=1;
            while(j<i)
            {
                System.out.print(" ");
                j++;
            }
            j=1;
            while(j<=i)
            {
                System.out.print("* ");
                j++;
            }
            System.out.println("");
            i++;
        }
        i=i-1;
        while(i>1)
        {
            j=1;
            while(j<i-1)
            {
                System.out.print(" ");
                j++;
            }
            j=1;
            while(j<i)
            {
                System.out.print("* ");
                j++;
            }
            System.out.println("");
            i--;
        }
    }
}
