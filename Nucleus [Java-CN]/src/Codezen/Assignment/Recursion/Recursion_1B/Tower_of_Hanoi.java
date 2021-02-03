package Codezen.Assignment.Recursion.Recursion_1B;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 01/07/2017.
 */
public class Tower_of_Hanoi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        System.out.println("");
        tower_of_hanoi(num,'A','B','C');
    }

    public static void tower_of_hanoi(int num,char src,char aux,char dst)
    {
        if(num==1)
        {
            System.out.println("Move ring "+num+" from "+src+" to "+dst);
            return;
        }

        tower_of_hanoi(num-1,src,dst,aux);
        System.out.println("Move ring "+num+" from "+src+" to "+dst);
        tower_of_hanoi(num-1,aux,src,dst);
    }
}
