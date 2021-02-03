/**
 * n=4
 *   *000*000*
 *   0*00*00*0
 *   00*0*0*00
 *   000***000
 */
package Codezen.Test_1;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 16/06/2017.
 */
public class Zeroes_Star_Pattern {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int row=scan.nextInt();
        int i=1,j;
        while(i<=row)
        {
            j=1;
            while(j<=(2*row)+1)
            {
                if(j==i || j==row+1 || j==(2*row)+2-i)
                {
                    System.out.print("*");
                }
                else System.out.print("0");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
