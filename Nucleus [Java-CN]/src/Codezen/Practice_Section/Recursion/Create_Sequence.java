package Codezen.Practice_Section.Recursion;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 02/07/2017.
 */
public class Create_Sequence {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] result=new int[0];
        print_sequence(n,result);
    }

    public static void print_sequence(int n,int[] result)
    {
        if(n<=1)
        {
            int i=0;
            while(i<result.length)
            {
                if(result[i]!=0)
                {
                    System.out.println(result[i]);
                }
                i++;
            }
            return;
        }
        int count=1;
        int num=n;
        while(num>9)
        {
            num=num/10;
            count=count*10;
        }
        int num_1=n-count;
        int i=num_1+1,flag,k=result.length;
        int[] new_result=new int[k+count];
        int j=0;
        while(j<k)
        {
            new_result[j]=result[j];
            j++;
        }
        while(i<=n)
        {
            int x=i;
            flag=0;
            while(x!=0)
            {
                int dig=x%10;
                if(dig!=2 && dig!=5)
                {
                    flag=1;
                    break;
                }
                x=x/10;
            }
            if(flag==0)
            {
                new_result[k]=i;
                k++;
            }
            i++;
        }

        print_sequence(num_1,new_result);
    }
}
