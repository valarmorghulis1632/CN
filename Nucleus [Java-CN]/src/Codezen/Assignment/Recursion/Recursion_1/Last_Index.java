package Codezen.Assignment.Recursion.Recursion_1;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 20/06/2017.
 */
public class Last_Index {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int elem=scan.nextInt();
        int[] arr=new int[elem];
        fillarray(arr,elem);
        System.out.println("");
        int x=scan.nextInt();
        int count=0;
        //int first_1=last_index(arr,x,0,count);
//        int first_1=last_index_1(arr,x,0,count);
        //int first_1=last_index_2(arr,x,0);
        int first_1=last_index_3(arr,x);
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



    public static int last_index(int[] arr,int x,int i,int count)
    {
        if(arr.length==i && count==0)
        {
            return -2;
        }
        if(arr.length==i && count!=0)
        {
            return -1;
        }
        if(arr[i]==x)
        {
            count++;
            int ans=last_index(arr, x, i + 1,count);
            if(ans==-1)
            {
                return i;
            }
            else if(ans==-2)
            {
                return -2;
            }
        }
        return last_index(arr,x,i+1,count);
    }

    public static int last_index_1(int[] arr,int x,int i,int count)
    {
        if(arr.length==0)
        {
            return -1;
        }
        if(arr[i]==x)
        {
            count=i;
            int ans=last_index(arr, x, i + 1,count);
            if(ans==-1)
            {
                return -1;
            }
            else
            {
                return count;
            }
        }
        return last_index(arr,x,i+1,count);
    }

    public static int last_index_2(int[] arr,int x,int index)
    {
        if(arr.length==index)
        {
            return -1;
        }

        int ans=last_index_2(arr,x,index+1);
        if(ans==-1 && arr[index]==x)
        {
            return index;
        }
        else
        { return ans; }
    }

    public static int last_index_3(int[] arr,int x)
    {
        if(arr.length==0)
        {
            return -1;
        }
        int[] small_arr=new int[arr.length-1];
        int i=0;
        while(i<small_arr.length)
        {
            small_arr[i]=arr[i+1];
            i++;
        }
        int ans=last_index_3(small_arr,x);
        if(ans==-1)
        {
            if(arr[0]==x)
               return 0;
            else return -1;
        }
        else
        {
            return ans+1;
        }
    }
}
