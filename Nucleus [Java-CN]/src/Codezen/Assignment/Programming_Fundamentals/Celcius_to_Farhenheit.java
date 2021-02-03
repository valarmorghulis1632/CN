package Codezen.Assignment.Programming_Fundamentals;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 15/06/2017.
 */
public class Celcius_to_Farhenheit {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        long start=scan.nextLong();
        long end=scan.nextLong();
        long step=scan.nextLong();
        long celsius;
        while(start<=end)
        {
            celsius = (long) ((5.0 / 9) * (start - 32));
            System.out.println(start + "     " + celsius);
            start=start+step;
        }

    }
}
