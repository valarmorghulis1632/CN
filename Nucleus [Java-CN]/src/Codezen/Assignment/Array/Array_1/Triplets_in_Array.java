package Codezen.Assignment.Array.Array_1;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 16/06/2017.
 */
public class Triplets_in_Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[20];
        System.out.print("ENTER THE LENGTH OF ARRAY: ");
        int array_length = scan.nextInt();
        System.out.print("\nENTER THE TERMS IN ARRAY: ");
        fill_array(array, array_length);
        System.out.print("\nENTER THE REQUIRED SUM OF ELEMENTS (X): ");
        int number=scan.nextInt();
        no_of_triplets(array,array_length,number);
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

    public static void no_of_triplets(int[] arr,int arr_length,int x)
    {
        int i=0,j,count=0;
        System.out.println("");
        while(i<arr_length)
        {
            j=i+1;
            while(j<arr_length)
            {
                int k=j+1;
                while(k<arr_length)
                {
                    if((arr[i]+arr[j]+arr[k])==x)
                    {
                        count++;
                        if(arr[i]>arr[j] && arr[j]>arr[k])
                        {
                            System.out.println(arr[k]+" "+arr[j]+" "+arr[i]);
                        }
                        else if (arr[i]>arr[k] && arr[k]>arr[j])
                        {
                            System.out.println(arr[j]+" "+arr[k]+" "+arr[i]);
                        }
                        else if (arr[j]>arr[k] && arr[k]>arr[i])
                        {
                            System.out.println(arr[i]+" "+arr[k]+" "+arr[j]);
                        }
                        else if (arr[j]>arr[i] && arr[i]>arr[k])
                        {
                            System.out.println(arr[k]+" "+arr[i]+" "+arr[j]);
                        }
                        else if (arr[k]>arr[i] && arr[i]>arr[j])
                        {
                            System.out.println(arr[j]+" "+arr[i]+" "+arr[k]);
                        }
                        else if (arr[k]>arr[j] && arr[j]>arr[i])
                        {
                            System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                        }

                    }
                    k++;
                }
                j++;
            }
            i++;
        }
        if(count==0)
            System.out.println("  THE REQUIRED SUM "+x+" IS NOT SATISFIED BY ANY TRIPLET OF GIVEN ARRAY");
    }
}
