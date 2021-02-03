package Codezen.Practice_Section.Pattern;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 16/06/2017.
 */
public class Interesting_Alphabets {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int row=scan.nextInt(),i=1,j;

        while(i<=row)
        {   j=1;
            int asc=64+row;
            char ch=(char)asc;
            while(j<=i-1)
            {
                ch--;
                j++;
            }
            while(ch!=(char)(asc+1))
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println("");
            i++;
        }
    }
}
