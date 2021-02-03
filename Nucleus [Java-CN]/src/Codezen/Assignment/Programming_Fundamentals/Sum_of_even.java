package Codezen.Assignment.Programming_Fundamentals;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 15/06/2017.
 */
public class Sum_of_even {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt(), i = 1,sum=0;
        while (i <= num)
        {
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
}
