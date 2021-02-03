package Codezen.Assignment.Recursion.Recursion_1;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 20/06/2017.
 */
public class Array_of_Indices {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] arr=new int[100];
        int count=0;
        int elem=scan.nextInt();
        fillarray(arr,elem);
        System.out.println("");
        int x=scan.nextInt();
        int[] indices=new int[count];
//        indices=arr_indices(arr,x,indices,count);
        indices=arr_indices_1(arr,x,0);
        if(indices.length==0)
        {
            System.out.println("ELEMENT NOT FOUND");
        }
        else
        {
            int i=0;
            while(i<indices.length)
            {
                System.out.print(indices[i]+" ");
                i++;
            }
        }
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

    public static int[] arr_indices(int[] arr,int x,int[] indices,int count)
    {
        if(arr.length==0)
        {
            return indices;
        }
        int small[]=new int[arr.length-1];
        int i=0;
        while (i<small.length)
        {
            small[i]=arr[i+1];
            i++;
        }


        if(arr[0]==x)
        {
            int[] indices_1=new int[indices.length+1];
            i=0;
            while(i<indices.length)
            {
                indices_1[i]=indices[i];
                i++;
            }
            indices_1[i]=count;
            count++;
            return arr_indices(small,x,indices_1,count);
        }
        else
        {
            count++;
            return arr_indices(small,x,indices,count);
        }
    }

    public static int[] arr_indices_1(int[] input,int x,int index)
    {
        if(index==input.length)
        {
            int[] arr={};
            return arr;
        }
        int[] back=arr_indices_1(input,x,index+1);
        if(input[index]==x)
        {
            int[] ans=new int[back.length+1];
            ans[0]=index;
            int i=0;
            while(i<back.length)
            {
                ans[i+1]=back[i];
                i++;
            }
            return ans;
        }
        else
        {
            return back;
        }
    }
}
