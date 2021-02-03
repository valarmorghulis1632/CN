package Codezen.Practice_Section.Pattern;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 16/06/2017.
 */
public class Reverse_Series_Pattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number of rows");
        int row=s.nextInt();
        int i=1,j,k=1;
        System.out.println("\nThe Output is: \n");
        while(i<=row)
        {

            if(i%2==0)
            {
                j = 1;
                int step=k+i-1;
                while(j<=i)
                {

                    System.out.print(step+" ");
                    j++;
                    step--;
                }
                j = 1;
                while(j<=i) {

                    j++;
                    k++;
                }
            }
            else
            {
                j=1;
                while(j<=i)
                {
                    System.out.print(k+" ");
                    k++;
                    j++;
                }
            }

            System.out.println("");
            i++;
        }

    }
}
