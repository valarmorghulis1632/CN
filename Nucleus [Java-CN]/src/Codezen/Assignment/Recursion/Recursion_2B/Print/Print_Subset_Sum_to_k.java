package Codezen.Assignment.Recursion.Recursion_2B.Print;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 02/07/2017.
 */
public class Print_Subset_Sum_to_k {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int elem=scan.nextInt();
        int[] input=new int[elem];
        fillarray(input);
        int k=scan.nextInt();
        int[] result=new int[0];
        print_subset_sum_to_k(input,result,k);
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

    public static void print_subset_sum_to_k(int[] input,int[] result,int k)
    {
        if(input.length==0)
        {
            if(k==0)
            {
                int i=0;
                while(i<result.length)
                {
                    System.out.print(result[i]+" ");
                    i++;
                }
                System.out.println("");
            }
            return;
        }

        int[] small=new int[input.length-1];
        int i=0;
        while(i<small.length)
        {
            small[i]=input[i+1];
            i++;
        }
        print_subset_sum_to_k(small,result,k);
        int[] new_result=new int[result.length+1];
        new_result[new_result.length-1]=input[0];
        i=0;
        while(i<result.length)
        {
            new_result[i]=result[i];
            i++;
        }
        print_subset_sum_to_k(small,new_result,k-input[0]);
    }
}
