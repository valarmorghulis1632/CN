package Codezen.Assignment.Hashmap.Hashmap_1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

import static Codezen.Assignment.Hashmap.Hashmap_1.Longest_Consecutive_Sequence.fillarray;

public class Pair_With_Difference_K {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int elements=scan.nextInt();
        int[] arr=new int[elements];
        fillarray(arr);
        pair_with_difference_k(arr,scan.nextInt());
    }

    private static void pair_with_difference_k(int[] input, int k) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int x:input)
        {
            if(!hashMap.containsKey(x))
            {
                hashMap.put(x,1);
            }
            else
            {
                hashMap.put(x,hashMap.get(x)+1);
            }
        }
        int i=0;
        HashSet<Integer> hashSet=new HashSet<>();
        while (i<input.length)
        {
            int diff_1=input[i]+k;
            int diff_2=input[i]-k;
            if(diff_1==diff_2 && diff_1==input[i] && !hashSet.contains(input[i]))
            {
                int c=hashMap.get(input[i])-1;
                int sum=0;
                while (c>=1)
                {
                    sum=sum+c;
                    c--;
                }
                c=0;
                while (c<sum)
                {
                    System.out.println(input[i]+" "+input[i]);
                    c++;
                }
                hashSet.add(input[i]);
                i++;
                continue;
            }
            if(!hashSet.contains(diff_1) && !hashSet.contains(input[i]))
            {
                if(hashMap.containsKey(diff_1))
                {
                    int m=hashMap.get(input[i]);
                    int n=hashMap.get(diff_1);
                    int a=0,b;
                    while (a<m)
                    {
                        b=0;
                        while (b<n)
                        {
                            System.out.println(input[i]+" "+diff_1);
                            b++;
                        }
                        a++;
                    }
                }
            }
            if(!hashSet.contains(diff_2) && !hashSet.contains(input[i]) && diff_1!=diff_2)
            {
                if(hashMap.containsKey(diff_2))
                {
                    int m=hashMap.get(input[i]);
                    int n=hashMap.get(diff_2);
                    int a=0,b;
                    while (a<m)
                    {
                        b=0;
                        while (b<n)
                        {
                            System.out.println(diff_2+" "+input[i]);
                            b++;
                        }
                        a++;
                    }
                }
            }
            hashSet.add(input[i]);
            i++;
        }
    }
}
