package Codezen.Assignment.Recursion.Recursion_1;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 20/06/2017.
 */
public class First_Index {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] arr=new int[100];
        int elem=scan.nextInt();
        fillarray(arr,elem);
        int x=scan.nextInt();
        //int first=f_index(arr,x,0);
        int first_1=f_index_1(arr,x);
        System.out.println("\n"+first_1);
    }

    public static void fillarray(int[] array,int elem)
    {   Scanner scan=new Scanner(System.in);
        int i=0;
        while(i<elem) {
            array[i] = scan.nextInt();
            System.out.print(" ");
            i++;
        }
    }

    public static int f_index(int[] arr,int x,int i)
    {
        if(arr.length==i)
        {
            return -1;
        }
        if(arr[i]==x)
        {
            return i;
        }

        return f_index(arr,x,i+1);
    }

    public static int f_index_1(int[] arr,int x)
    {
        if(arr.length==0)
        {
            return -1;
        }

        if(arr[0]==x)
        {
            return 0;
        }
        int i=0;
        int[] arr1=new int[arr.length-1];
        while(i<arr1.length)
        {
            arr1[i]=arr[i+1];
            i++;
        }
        int ans=f_index_1(arr1,x);
        if(ans==-1)
        {
            return -1;
        }
        else
        {
            return ans+1;
        }
    }
}