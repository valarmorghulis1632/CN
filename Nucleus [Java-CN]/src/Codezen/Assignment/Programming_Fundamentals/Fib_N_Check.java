package Codezen.Assignment.Programming_Fundamentals;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 16/06/2017.
 */
public class Fib_N_Check {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE Number: ");
        int num = scan.nextInt();
        System.out.println("\n");
        boolean bool=check(num);
        System.out.println(bool);
    }
    public static boolean check(int num)
    {
        int first=0,second=1,sum=1;
        if(num<0)
            return false;
        else if(num==1 || num==0)
            return true;
        else {

            while (sum < num) {

                sum=first+second;
                first=second;
                second=sum;
            }
        }
        if(sum==num)
            return true;
        return false;
    }
}
