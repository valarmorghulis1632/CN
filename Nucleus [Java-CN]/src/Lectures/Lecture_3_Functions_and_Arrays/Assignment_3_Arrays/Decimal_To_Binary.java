/**QUESTION -
 * Convert a decimal number to binary using array.
 */
package Lectures.Lecture_3_Functions_and_Arrays.Assignment_3_Arrays;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 14/06/2017.
 */
public class Decimal_To_Binary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("ENTER THE DECIMAL NUMBER: ");
        int decimalnumber=scan.nextInt();
        int[] rev_of_binarynumber=new int[500];
        int no_of_bits=conversion(decimalnumber,rev_of_binarynumber);
        display_binary_number(rev_of_binarynumber,no_of_bits,decimalnumber);
        System.out.println();
        System.out.println(conversion_1(decimalnumber));
    }

    public static int conversion(int decimalnumber,int[] rev_of_binarynumber)
    {
        int i=0;
        while(decimalnumber>0)
        {
            rev_of_binarynumber[i]=(decimalnumber)%2;
            i++;
            decimalnumber=(decimalnumber/2);
        }
        return i;
    }

    public static int conversion_1(int decimalnumber)
    {
        int ans=0,i=0;
        while (decimalnumber!=0)
        {
            ans=(decimalnumber%2)*(int)Math.pow(10,i)+ans;
            decimalnumber=decimalnumber/2;
            i++;
        }
        return ans;
    }

    public static void display_binary_number(int[] rev_of_binarynumber,int no_of_bits,int dec_number)
    {
        int i=no_of_bits-1;
        System.out.print("\nTHE BINARY REPRESENTATION OF DECIMAL NUMBER "+dec_number+" IS: ");
        while(i>=0)
        {
            System.out.print(rev_of_binarynumber[i]+"");
            i--;
        }
    }
}
