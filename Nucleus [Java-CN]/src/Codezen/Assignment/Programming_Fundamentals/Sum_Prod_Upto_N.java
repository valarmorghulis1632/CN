package Codezen.Assignment.Programming_Fundamentals;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 16/06/2017.
 */
public class Sum_Prod_Upto_N {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER: ");
        int number=scan.nextInt();
        System.out.print("ENTER THE CHOICE: ");
        int choice=scan.nextInt(),i;
        switch (choice)
        {
            case 1: int sum=0;
                    i=1;
                    while(i<=number)
                    {
                        sum=sum+i;
                        i++;
                    }
                    System.out.println("\nSUM IS: "+sum);
                    break;

            case 2: long product=1;
                    i=1;
                    while(i<=number)
                    {
                        product=product*i;
                        i++;
                    }
                    System.out.println("\nPRODUCT IS: "+product);
                    break;

             default: System.out.println("\nWRONG CHOICE: "+(-1));

        }
    }
}
