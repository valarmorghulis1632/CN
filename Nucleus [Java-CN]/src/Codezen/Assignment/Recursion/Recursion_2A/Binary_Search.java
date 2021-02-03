package Codezen.Assignment.Recursion.Recursion_2A;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 21/06/2017.
 */
public class Binary_Search {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] input=new int[n];
        fillarray(input);
        int x=scan.nextInt();
//        System.out.println("INDEX IS: "+binary_search_1(input,x));
        System.out.println("INDEX IS: "+binary_search_2(input,0,input.length-1,x));
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

    public static int binary_search_2(int[] input,int beg,int end,int element)
    {
        if(beg>end)
        {
            return -1;
        }
        int mid=(beg+end)/2;
        if(input[mid]>element)
        {
            return binary_search_2(input,beg,mid-1,element);
        }
        else if(input[mid]<element)
        {
            return binary_search_2(input,mid+1,end,element);
        }
        else
        {
            return mid;
        }
    }

    public static int binary_search_1(int[] input,int element) {
        if (input.length == 0)
        {
            return -1;
        }
        int beg = 0, end = input.length - 1;
        int mid = (beg + end) / 2;
        int[] small = new int[input.length / 2];
        if (input[mid] > element)
        {
            int i = 0;
            while (i < mid)
            {
                small[i] = input[i];
                i++;
            }
        }
        else if (input[mid] < element)
        {
            int i = mid + 1, j = 0;
            while (i <= end) {
                small[j] = input[i];
                i++;
                j++;
            }
        }
        else
        {
            return mid;
        }
        int ans = binary_search_1(small, element);
        if(ans==-1)
        {
            return -1;
        }
        else
        {
            if(input[mid]<element)
            {
                return mid+ans+1;
            }
            else
            {
                return ans;
            }
        }
    }
}
