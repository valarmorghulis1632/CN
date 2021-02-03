package Codezen.Practice_Section.Recursion;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 03/07/2017.
 */
public class Lexicographical_Order {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int[] result=new int[0];
        lexicographical_order(num,result);
    }

    public static void lexicographical_order(int num,int[] result)
    {
        if(num==0)
        {
            int i=0;
            while(i<result.length)
            {
                System.out.print(result[i]+" ");
                i++;
            }
            return;
        }

        if(result.length==0)
        {
            int[] result_new=new int[1];
            result_new[0]=num;
            lexicographical_order(num-1,result_new);
            return;
        }
        int[] result_new=new int[result.length+1];
        int dig,rev=0;
        int n=num;
        int i=0,k=0;
        while(n>0)
        {
            dig=n%10;
            rev=dig+rev*10;
            n=n/10;
        }
        int flag=0;
        int loc= Integer.MIN_VALUE;
        while(i<result.length)
        {
            int rev_1=0,rev_2,dig_1;
            loc=Integer.MIN_VALUE;
            int next=result[i];
            while(next>0)
            {
                dig_1=next%10;
                rev_1=dig_1+rev_1*10;
                next=next/10;
            }
            rev_2=rev;
            while(rev_1>0)
            {
                if(rev_1%10 > rev_2%10)
                {
                    loc=i;
                    flag=1;
                    break;
                }
                else if(rev_1%10 == rev_2%10)
                {
                    rev_1=rev_1/10;
                    rev_2=rev_2/10;
                }
                else
                {
                    break;
                }
            }

            if(flag==1)
            {
                break;
            }
            i++;
        }

        if(flag==0)
        {
            loc=result.length;
        }

        i=0;
        while(i<result.length)
        {
            if(i==loc)
            {
                result_new[k]=num;
                k++;
                result_new[k]=result[loc];
                k++;
            }
            else
            {
                result_new[k]=result[i];
                k++;
            }
            i++;
        }

        if(loc==result.length)
        {
            result_new[k]=num;
            k++;
        }
        lexicographical_order(num-1,result_new);
    }
}
