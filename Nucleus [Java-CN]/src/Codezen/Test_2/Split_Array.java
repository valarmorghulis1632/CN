package Codezen.Test_2;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 10/07/2017.
 */
public class Split_Array {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int elem=scan.nextInt();
        int[] arr=new int[elem];
        fill_array(arr);
        System.out.println("\nANS IS: "+is_it_possible(arr));
        System.out.println("ANS IS: "+splitArray(arr));
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

    //first approach with recursion

    public static boolean splitArray(int input[])
    {
        return check(input, 0, 0, 0);
    }

    public static boolean check(int input[], int startIndex,int lSum,int rSum)
    {
        if(startIndex == input.length)
        {
            return lSum == rSum;
        }
        if(input[startIndex] % 5 == 0)
        {
            lSum += input[startIndex];
        }
        else if(input[startIndex] % 3 == 0)
        {
            rSum += input[startIndex];
        }
        else
        {
            boolean leftAns = check(input, startIndex+1, lSum+input[startIndex], rSum);
            boolean rightAns = check(input, startIndex+1,	lSum, rSum + input[startIndex]);
            return leftAns || rightAns;
        }
        return check(input, startIndex + 1, lSum, rSum);
    }

    // second approach without normal recursion

    public static boolean is_it_possible(int[] input)
    {
        int i=0,j=0,k=input.length-1,s1=0,s2=0;
        int[] arr_1=new int[input.length];
        while(i<input.length)
        {
            if(input[i]%5==0)
            {
                arr_1[j]=input[i];
                s1=s1+input[i];
                j++;
            }
            else if(input[i]%3==0)
            {
                arr_1[k]=input[i];
                s2=s2+input[i];
                k--;
            }
            i++;
        }
        if(j-k==1)
        {
            int sum_1=0,sum_2=0;
            i=0;
            while(i<j)
            {
                sum_1=sum_1+input[i];
                i++;
            }
            i=input.length-1;
            while(i>k)
            {
                sum_2=sum_2+input[i];
                i--;
            }
            if(sum_1==sum_2)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        int[] arr_2=new int[k-j+1];
        i=0;
        j=0;
        while(i<input.length)
        {
            if(input[i]%5!=0 && input[i]%3!=0)
            {
                arr_2[j]=input[i];
                j++;
            }
            i++;
        }
        int[] result=new int[0];
        return print_permutations_1(arr_2,result,s1,s2);
    }

    public static boolean print_permutations_1(int[] input,int[] result,int s1,int s2)
    {
        if (input.length==0)
        {
            int i=0,j=result.length-1;
            while(i<=j)
            {
                s1=s1+result[i];
                i++;
            }
            if(s1==s2)
            {
                return true;
            }
            else
            {
                while (s1!=s2 && j>=0)
                {
                    s1=s1-result[j];
                    s2=s2+result[j];
                    j--;
                }
                if(s1==s2)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        int i=0;

        while(i<result.length+1)
        {
            int[] small = new int[result.length + 1];
            int j = 0, k = 0;
            while (j < i) {
                small[k] = result[j];
                j++;
                k++;
            }
            small[k] = input[0];
            k++;
            j = i;
            while (j < result.length) {
                small[k] = result[j];
                j++;
                k++;
            }
            int small_arr[]=new int[input.length-1];
            int l=0;
            while(l<small_arr.length)
            {
                small_arr[l]=input[l+1];
                l++;
            }
            boolean ans=print_permutations_1(small_arr,small,s1,s2);
            if(ans==true)
            {
                return ans;
            }
            i++;
        }
        return false;
    }
}
