package Codezen.Assignment.Recursion.Recursion_1A;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 21/06/2017.
 */
public class Count_Zeroes {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        System.out.println("NO. OF ZEROES: "+zero_count(num));
    }

    public static int zero_count(int num)
    {
        if(num==0)
        {
            return 0;
        }
        int dig=num%10,count=0;
        if(dig==0)
        {
            count++;
        }
        num=num/10;
        return count+zero_count(num);
    }
}
