package Important_Topics.Sorting_Techniques;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 04/07/2017.
 */
public class Merge_Sort {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] input=new int[n];
        fillarray(input);
//        int[] ans=merge_sort(input);
//        int i=0;
//        System.out.println("");
//        while(i<ans.length)
//        {
//            System.out.print(ans[i]+" ");
//            i++;
//        }
        merge_sort_1(input);
        int i=0;
        System.out.println("");
        while(i<input.length)
        {
            System.out.print(input[i]+" ");
            i++;
        }
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

    public static int[] merge_sort(int[] input)
    {
        if(input.length==1)
        {
            return input;
        }
        int mid=(input.length-1)/2;
        int[] left=new int[mid+1];
        int[] right=new int[input.length-mid-1];
        int i=0;
        while(i<=mid)
        {
            left[i]=input[i];
            i++;
        }
        int j=0;
        while(i<input.length)
        {
            right[j]=input[i];
            i++;
            j++;
        }
        int[] left_ans=merge_sort(left);
        int[] right_ans=merge_sort(right);
        merge_sorted_arrays(input,left_ans,right_ans);
        return input;
    }

    public static void merge_sorted_arrays(int[] input,int[] arr1,int[] arr2)
    {
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                input[k]=arr1[i];
                i++;
                k++;
            }
            else
            {
                input[k]=arr2[j];
                j++;
                k++;
            }
        }

        while(i<arr1.length)
        {
            input[k]=arr1[i];
            i++;
            k++;
        }

        while(j<arr2.length)
        {
            input[k] = arr2[j];
            j++;
            k++;
        }
    }

    public static void merge_sort_1(int[] input)
    {
        if(input.length==1)
        {
            return;
        }
        int mid=(input.length-1)/2;
        int[] left=new int[mid+1];
        int[] right=new int[input.length-mid-1];
        int i=0;
        while(i<=mid)
        {
            left[i]=input[i];
            i++;
        }
        int j=0;
        while(i<input.length)
        {
            right[j]=input[i];
            i++;
            j++;
        }
        merge_sort_1(left);
        merge_sort_1(right);
        merge_sorted_arrays(input,left,right);
    }
}
