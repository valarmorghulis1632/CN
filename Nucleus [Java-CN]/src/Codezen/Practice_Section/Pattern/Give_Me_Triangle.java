package Codezen.Practice_Section.Pattern;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 16/06/2017.
 */
public class Give_Me_Triangle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int row=scan.nextInt();
        int i=1,j=1,c=1;
        while(i<=row)
        {   c=1;
            while(c<=i-1)
            {
                System.out.print(" ");
                c++;
            }
            j=1;
            while(j<=row-i+1)
            {
                System.out.print("*");
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}
