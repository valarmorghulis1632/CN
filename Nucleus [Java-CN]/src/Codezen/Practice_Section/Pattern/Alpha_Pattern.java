package Codezen.Practice_Section.Pattern;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 16/06/2017.
 */
public class Alpha_Pattern {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int row=scan.nextInt(),i=1,j;
        char ch='A';
        while(i<=row)
        {
            j=1;
            while(j<=i)
            {
                System.out.print(ch);
                j++;
            }
            System.out.println("");
            ch++;
            i++;
        }
    }
}
