package Codezen.Practice_Section.Pattern;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 18/06/2017.
 */
public class Repeating_Num {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        print_pattern(num);
    }

    public static void print_pattern(int num)
    {
        int i=1,j,k=1;
        while(i<=num)
        {
            j=1;
            while(j<=Math.pow(2,i-1))
            {
                if(k==10)
                {
                    k=1;
                }
                System.out.print(k+" ");
                k++;
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}
