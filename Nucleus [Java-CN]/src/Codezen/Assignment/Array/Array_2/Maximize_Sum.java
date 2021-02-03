package Codezen.Assignment.Array.Array_2;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 19/06/2017.
 */
public class Maximize_Sum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("ENTER THE LENGTH OF ARRAY A: ");
        int array_length_A = scan.nextInt();
        System.out.print("\nENTER THE LENGTH OF ARRAY B: ");
        int array_length_B = scan.nextInt();
//        int[] array_A = new int[array_length_A+1];
//        int[] array_B = new int[array_length_B+1];
        int[] array_A = new int[array_length_A];
        int[] array_B = new int[array_length_B];
        System.out.print("\nENTER THE TERMS IN ARRAY A: ");
        fill_array(array_A, array_length_A);
//        array_A[array_length_A]=Integer.MAX_VALUE;
        System.out.print("\nENTER THE TERMS IN ARRAY B: ");
        fill_array(array_B, array_length_B);
//        array_B[array_length_B]=Integer.MAX_VALUE;
//        array_length_A++;
//        array_length_B++;
        System.out.println("\nMAX IS: "+maximize_sum(array_A,array_B));
//        int max_sum=max_sum_(array_A,array_length_A,array_B,array_length_B);
//        System.out.println("\nMAX SUM IS: "+max_sum);
    }

    public static void fill_array(int[] array, int array_length)
    {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while (i < array_length) {
            System.out.print(" ");
            array[i] = scan.nextInt();
            i++;
        }
    }

    public static int max_sum_(int[] arr1,int arr1_length,int[] arr2,int arr2_length)
    {
        int sum=0,sum_A=0,sum_B=0;
        int[] merged_array=merge(arr1,arr1_length,arr2,arr2_length);
        int i=1,j,temp_A=0,temp_B=0;
        while(i<merged_array.length)
        {
            if(merged_array[i]==merged_array[i-1])
            {
                j=temp_A;
                while(arr1[j]<=merged_array[i] && arr1[j]!=Integer.MAX_VALUE)
                {
                    sum_A=sum_A+arr1[j];
                    j++;
                }
                temp_A=j;
                j=temp_B;
                while (arr2[j]<=merged_array[i] && arr2[j]!=Integer.MAX_VALUE)
                {
                    sum_B=sum_B+arr2[j];
                    j++;
                }
                temp_B=j;
                int g=(sum_A>sum_B)?sum_A:sum_B;
                sum=sum+g;
                sum_A=0;
                sum_B=0;
            }
            i++;
        }
        return sum;
    }

    public static int[] merge(int[] array_A,int array_length_A,int[] array_B,int array_length_B)
    {
        int i=0,j=0,k=0;
        int[] merged_array=new int[array_length_A+array_length_B];
        while(i<array_length_A && j<array_length_B)
        {
            if(array_A[i]<array_B[j])
            {
                merged_array[k]=array_A[i];
                i++;
                k++;
            }
            else
            {
                merged_array[k]=array_B[j];
                j++;
                k++;
            }
        }

        while(i<array_length_A)
        {
            merged_array[k]=array_A[i];
            i++;
            k++;
        }

        while(j<array_length_B)
        {
            merged_array[k]=array_B[j];
            j++;
            k++;
        }
        return merged_array;
    }





    public static long maximize_sum(int[] input_1,int[] input_2)
    {
        int i=0,j=0;
        int sum_1=0,sum_2=0;
        int total_sum=0;
        while(i<input_1.length && j<input_2.length)
        {
            if(input_1[i]<input_2[j])
            {
                sum_1=sum_1+input_1[i];
                i++;
            }

            else if(input_1[i]>input_2[j])
            {
                sum_2=sum_2+input_2[j];
                j++;
            }
            else
            {
                total_sum=total_sum+Math.max(sum_1,sum_2);
                total_sum=total_sum+input_1[i];
                sum_1=0;
                sum_2=0;
                i++;
                j++;
            }
        }
        while(i<input_1.length)
        {
            sum_1=sum_1+input_1[i];
            i++;
        }
        while (j<input_2.length)
        {
            sum_2=sum_2+input_2[j];
            j++;
        }
        total_sum=total_sum+Math.max(sum_1,sum_2);
        return total_sum;
    }


}
