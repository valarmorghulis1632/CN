package Codezen.Assignment.Programming_Fundamentals;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 16/06/2017.
 */
public class Dec_To_Bin {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("ENTER THE DECIMAL NUMBER: ");
        int decimalnumber=scan.nextInt(),i=1;
        long binary=0;
        while(decimalnumber>0)
        {
            int digit=decimalnumber%2;
            binary=binary+(digit*i);
            i=i*10;
            decimalnumber=decimalnumber/2;
        }
        System.out.println("\nREVERSE IS: "+binary);
    }
}
