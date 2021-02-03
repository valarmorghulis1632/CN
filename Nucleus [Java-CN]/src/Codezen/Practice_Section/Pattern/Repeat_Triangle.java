package Codezen.Practice_Section.Pattern;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 16/06/2017.
 */
public class Repeat_Triangle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int row=scan.nextInt();
        int i=1,j;

        while (i<=row)
        {
            j=1;
            while(j<=i-1)
            {
                System.out.print(" ");
                j++;
            }
            char ch='A';
            j=1;
            while(j<=2*(row-i+1))
            {
                if(j<=row-i+1)
                {
                    System.out.print(ch++);
                }
                else
                {
                    System.out.print(--ch);
                }
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}

