package Codezen.Assignment.Recursion.Recursion_2B.Print;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 27/06/2017.
 */
public class Print_Subset
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int elem=scan.nextInt();
        int[] input=new int[elem];
        fillarray(input);
        int[] result=new int[0];
        print_subset(input,result);
    }

    public static void fillarray(int[] array)
    {   Scanner scan=new Scanner(System.in);
        int i=0;
        while(i<array.length) {
            array[i] = scan.nextInt();
            System.out.print(" ");
            i++;
        }
    }

    public static void print_subset(int[] input,int[] result)
    {
        if(input.length==0)
        {
            int i=0;
            while(i<result.length)
            {
                System.out.print(result[i] + " ");
                i++;
            }
            System.out.println("");
            return;
        }

        int[] small=new int[input.length-1];
        int i=0;
        while (i<small.length)
        {
            small[i]=input[i+1];
            i++;
        }
        print_subset(small,result);
        int[] result_1=new int[result.length+1];
        i=0;
        while(i<result.length)
        {
            result_1[i]=result[i];
            i++;
        }
        result_1[i]=input[0];
        print_subset(small,result_1);
    }
}
