package Codezen.Assignment.Hashmap.Hashmap_2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

import static Codezen.Assignment.Hashmap.Hashmap_1.Longest_Consecutive_Sequence.fillarray;

public class Pair_Sum_to_0 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int elements=scan.nextInt();
        int[] arr=new int[elements];
        fillarray(arr);
        pair_sum_to_0(arr);
    }

    private static void pair_sum_to_0(int[] input) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int x:input)
        {
            if(hashMap.containsKey(x))
            {
                hashMap.put(x,hashMap.get(x)+1);
            }
            else
            {
                hashMap.put(x,1);
            }
        }
        int i=0;
        HashSet<Integer> hashSet=new HashSet<>();
        while (i<input.length)
        {
            int temp=input[i]-(2*input[i]);
            if(!hashSet.contains(temp) && hashMap.containsKey(temp) && !hashSet.contains(input[i]))
            {
                int j=hashMap.get(input[i]);
                int k=hashMap.get(temp);
                int m=0,n;
                while (m<j)
                {
                    n=0;
                    while (n<k)
                    {
                        System.out.println(Math.min(temp,input[i])+" "+Math.max(temp,input[i]));
                        n++;
                    }
                    m++;
                }
            }
            hashSet.add(input[i]);
            i++;
        }
    }
}
