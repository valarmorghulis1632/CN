package Codezen.Assignment.Programming_Fundamentals;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 16/06/2017.
 */
public class Sqr_Root {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        float num=scan.nextFloat();
        int i=1;
        while(i*i<=num)
        {
            i++;
        }
        System.out.println(i-1);
    }
}
