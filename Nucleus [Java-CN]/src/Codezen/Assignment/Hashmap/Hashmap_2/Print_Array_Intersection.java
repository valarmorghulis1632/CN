package Codezen.Assignment.Hashmap.Hashmap_2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

import static Codezen.Assignment.Hashmap.Hashmap_1.Longest_Consecutive_Sequence.fillarray;

public class Print_Array_Intersection {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int elem_A=scanner.nextInt();
        int[] input_A=new int[elem_A];
        fillarray(input_A);
        int elem_B=scanner.nextInt();
        int[] input_B=new int[elem_B];
        fillarray(input_B);
        print_array_intersection(input_A,input_B);
    }

    private static void print_array_intersection(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> hashMap_1=new HashMap<>();
        for (int x:arr1)
        {
            if(hashMap_1.containsKey(x))
            {
                hashMap_1.put(x,hashMap_1.get(x)+1);
            }
            else
            {
                hashMap_1.put(x,1);
            }
        }
        HashMap<Integer,Integer> hashMap_2=new HashMap<>();
        for (int y:arr2)
        {
            if(hashMap_2.containsKey(y))
            {
                hashMap_2.put(y,hashMap_2.get(y)+1);
            }
            else
            {
                hashMap_2.put(y,1);
            }
        }
        int i=0;
        HashSet<Integer> hashSet=new HashSet<>();
        while (i<arr1.length)
        {
            int temp=arr1[i];
            if(hashMap_1.containsKey(temp) && hashMap_2.containsKey(temp) && !hashSet.contains(temp))
            {
                int g=hashMap_1.get(temp)>hashMap_2.get(temp)?hashMap_2.get(temp):hashMap_1.get(temp);
                int k=0;
                while (k<g)
                {
                    System.out.println(temp);
                    k++;
                }
                hashSet.add(temp);
            }
            i++;
        }
    }
}
