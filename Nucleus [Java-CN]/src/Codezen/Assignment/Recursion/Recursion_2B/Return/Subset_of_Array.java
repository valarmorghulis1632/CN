package Codezen.Assignment.Recursion.Recursion_2B.Return;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 25/06/2017.
 */
public class Subset_of_Array {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int elem=scan.nextInt();
        int[] input=new int[elem];
        fillarray(input);
        int[][] ans=subset_array(input);
        int i=0,j;
        while(i<ans.length)
        {
            j=0;
            while(j<ans[i].length)
            {
                System.out.print(ans[i][j]+" ");
                j++;
            }
            System.out.println("");
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

    public static int[][] subset_array(int[] input)
    {
        if(input.length==0)
        {
            int[][] arr=new int[1][0];
            return arr;
        }
        int[] small=new int[input.length-1];
        int i=0;
        while(i<small.length)
        {
            small[i]=input[i+1];
            i++;
        }
        int[][] back=subset_array(small);
        int[][] ans=new int[2*back.length][];
        i=0;
        int k=0,j;
        while(i<back.length)
        {
            ans[k]=new int[back[i].length];
            j=0;
            while(j<back[i].length)
            {
                ans[k][j]=back[i][j];
                j++;
            }
            i++;
            k++;
        }

        i=0;
        while(i<back.length)
        {
            ans[k]=new int[back[i].length+1];
            ans[k][0]=input[0];
            j=0;
            while(j<back[i].length)
            {
                ans[k][j+1]=back[i][j];
                j++;
            }
            k++;
            i++;
        }
        return ans;
    }
}
