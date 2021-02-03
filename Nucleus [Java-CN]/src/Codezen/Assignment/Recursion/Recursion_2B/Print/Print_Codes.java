package Codezen.Assignment.Recursion.Recursion_2B.Print;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 01/07/2017.
 */
public class Print_Codes {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        String result="";
        print_codes(num,result);
    }

    public static void print_codes(int num,String result)
    {
        if(num==0)
        {
            System.out.println(result);
            return;
        }

        if(num/10==0)
        {
            System.out.println((char)(96+num)+result);
            return;
        }
        String ans_1=(char)(96+num%10)+result;
        print_codes(num/10,ans_1);
        int n=((num / 10) % 10) * 10 + (num % 10);
        if(n<=26 && n>9)
        {
            String ans_2=(char)(96+n)+result;
            print_codes(num/100,ans_2);
        }
    }
}
