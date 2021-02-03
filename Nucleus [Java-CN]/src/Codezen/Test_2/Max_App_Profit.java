package Codezen.Test_2;


import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 10/07/2017.
 */
public class Max_App_Profit {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int elements=scan.nextInt();
        int[] input=new int[elements];
        fillarray(input);
        System.out.println("\nMAXIMUM PROFIT: "+max_profit(input));
    }

    public static void fillarray(int[] array)
    {   Scanner scan=new Scanner(System.in);
        int i=0;
        while(i<array.length) {
            System.out.print(" ");
            array[i] = scan.nextInt();
            i++;
        }
    }

    public static int max_profit(int[] budget)
    {
        quick_sort(budget,0,budget.length-1);
        int price,sum,i=0,temp=Integer.MIN_VALUE;
        while(i<budget.length)
        {
            price=budget[i];
            sum=price*(budget.length-i);
            if(temp<sum)
            {
                temp=sum;
            }
            i++;
        }
        return temp;
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
            if(input[i]<=input[start])
            {
                count++;
            }
            i++;
        }

        int pivot=input[start];
        input[start]=input[start+count];
        input[start+count]=pivot;
        int j=end;
        i=start;
        count=start+count;
        while(i<count && j>count)
        {

            if(input[i]<=pivot)
            {
                i++;
            }
            else if(input[j]>pivot)
            {
                j--;
            }
            else
            {
                int swap=input[i];
                input[i]=input[j];
                input[j]=swap;
                i++;
                j--;
            }
        }
        return count;
    }

//    public static int max_profit(int[] budget)
//    {
//        int i=0,j,sum,price,temp=Integer.MIN_VALUE;
//        while(i<budget.length)
//        {
//            j=0;
//            price=budget[i];
//            int count=0;
//            while(j<budget.length)
//            {
//                if(budget[j]>=price)
//                {
//                    count++;
//                }
//                j++;
//            }
//            i++;
//            sum=count*price;
//            if(temp<sum)
//            {
//                temp=sum;
//            }
//        }
//        return temp;
//    }
}
