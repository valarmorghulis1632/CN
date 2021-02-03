package Codezen.Assignment.Stacks_and_Queues;

import java.util.Scanner;

public class Stock_Span {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int arr[]=new int[scan.nextInt()];
        fill_array(arr);
        int[] ans=stock_span(arr);
        for (int x:ans)
        {
            System.out.print(x+" ");
        }
    }

    public static void fill_array(int[] arr)
    {
        Scanner scan=new Scanner(System.in);
        int i=0;
        while (i<arr.length)
        {
            System.out.println(" ");
            arr[i]=scan.nextInt();
            i++;
        }
    }

    public static int[] stock_span(int[] price)
    {
        int ans[]=new int[price.length];
        int counter=1;
        ans[0]=1;
        for(int x=1;x<ans.length;x++)
        {
            counter=1;
            for(int y=0;y<x;y++)
            {
                if(price[x]>price[y])
                {
                    counter++;
                }
                else
                    counter=1;
            }
            ans[x]=counter;
        }
        return ans;
    }
}
