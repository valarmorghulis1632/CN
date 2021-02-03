package Codezen.Practice_Section.Pattern;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 17/06/2017.
 */
public class Diamond_Stars {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number of rows");
        int row = s.nextInt();
        int i = 1, j,k=0;
        System.out.println("\nThe Output is: \n");
        if(row%2==0)
            row++;
        while (i <= row)
        {   if(i<=(row/2)+1)
        {
            j=1;
            while(j<=(row/2)-i+1)
            {
                System.out.print(" ");
                j++;
            }
            j = 1;
            while (j <= (2*i)-1) {
                System.out.print("*");
                j++;
            }
        }
        else
        {
            j=1;
            while(j<=i-(row/2)-1)
            {
                System.out.print(" ");
                j++;
            }
            j=1;
            while(j<=row+(row/2)-i-k)
            {
                System.out.print("*");
                j++;
            }
            k++;
        }
            System.out.println("");
            i++;
        }
    }
}
