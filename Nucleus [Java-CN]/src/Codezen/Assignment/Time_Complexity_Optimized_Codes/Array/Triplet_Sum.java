package Codezen.Assignment.Time_Complexity_Optimized_Codes.Array;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 05/07/2017.
 */
public class Triplet_Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("ENTER THE LENGTH OF ARRAY: ");
        int array_length = scan.nextInt();
        int[] array = new int[array_length];
        System.out.print("\nENTER THE TERMS IN ARRAY: ");
        fill_array(array);
        System.out.print("\nENTER THE REQUIRED SUM OF ELEMENTS (X): ");
        int number=scan.nextInt();
        no_of_triplets(array,number);
    }

    public static void fill_array(int[] array)
    {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while (i < array.length) {
            System.out.print(" ");
            array[i] = scan.nextInt();
            i++;
        }
    }

    public static void no_of_triplets(int[] input,int num)
    {
        quick_sort(input,0,input.length-1);
        int i=0,j;
        while(i<input.length-2)
        {
            j=i+1;
            while(j<input.length-1)
            {
                int index=binary_search(input,j+1,input.length-1,num-input[i]-input[j]);
                if(index!=-1)
                {
                    System.out.println(input[i]+" "+input[j]+" "+input[index]);
                }
                j++;
            }
            i++;
        }
    }

    public static void quick_sort(int[] input,int start,int end)
    {
        if(start>=end)
        {
            return;
        }

        int pos=get_position(input,start,end);
        quick_sort(input,start,pos-1);
        quick_sort(input,pos+1,end);
    }

    public static int get_position(int[] input,int start,int end)
    {
        int i=start+1,count=0;
        while(i<=end)
        {
            if(input[i]<input[start])
            {
                count++;
            }
            i++;
        }

        int temp=input[start];
        input[start]=input[start+count];
        input[start+count]=temp;
        int j=end;
        i=start;
        count=start+count;
        while(i<count && j>count)
        {
            if(input[i]>temp && input[j]<temp)
            {
                int swap=input[i];
                input[i]=input[j];
                input[j]=swap;
                i++;
                j--;
            }

            else if(input[i]<=temp && input[j]<=temp)
            {
                i++;
            }

            else if(input[i]>=temp && input[j]>=temp)
            {
                j--;
            }
            else if(input[i]<temp && input[j]>temp)
            {
                i++;
                j--;
            }
        }
        return count;
    }

    public static int binary_search(int[] input,int beg,int end,int element)
    {
        if(beg>end)
        {
            return -1;
        }
        int mid=(beg+end)/2;
        if(input[mid]>element)
        {
            return binary_search(input,beg,mid-1,element);
        }
        else if(input[mid]<element)
        {
            return binary_search(input,mid+1,end,element);
        }
        else
        {
            return mid;
        }
    }
}
