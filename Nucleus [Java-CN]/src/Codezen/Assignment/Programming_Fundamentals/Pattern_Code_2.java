package Codezen.Assignment.Programming_Fundamentals;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 15/06/2017.
 */
public class Pattern_Code_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int c = row - 1, i = 1, j = 1, k = 0;
        while (i <= row)
        {
            j = 1;
            while(j<=c) {
                System.out.print(" ");
                j++;
            }
            j=1;
            k = i;
            while (j <= i)
            {

                System.out.print(k);
                j++;
                k++;
            }
            System.out.println("");
            i++;
            c--;
        }
    }
}
