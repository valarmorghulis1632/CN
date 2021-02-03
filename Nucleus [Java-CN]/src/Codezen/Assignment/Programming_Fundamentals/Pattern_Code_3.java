package Codezen.Assignment.Programming_Fundamentals;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 16/06/2017.
 */
public class Pattern_Code_3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int row=scan.nextInt();
        int i=1,j=1;
        while(i<=row)
        {
            int c=i-1;
            j=1;
            while (j<=row)
            {
                if(c!=0)
                {
                    System.out.print(row-c);
                    j++;
                    c--;
                }
                else
                {
                    System.out.print(row);
                    j++;
                }
            }
            System.out.println("");
            i++;
        }
    }
}
