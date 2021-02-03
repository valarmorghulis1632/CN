package Codezen.Assignment.Hashmap.Hashmap_2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

import static Codezen.Assignment.Hashmap.Hashmap_1.Longest_Consecutive_Sequence.fillarray;

public class Highest_Frequency_Number {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int elements=scanner.nextInt();
        int[] input=new int[elements];
        fillarray(input);
        System.out.println(highest_frequency_number(input));
    }

    private static int highest_frequency_number(int[] input) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        int large=Integer.MIN_VALUE;
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
        for (int m:hashMap.values())
        {
            if(large<m)
            {
                large=m;
            }
        }
        HashSet<Integer> hashSet=new HashSet<>();
        for (Map.Entry<Integer,Integer> entry:hashMap.entrySet())
        {
            if(entry.getValue()==large)
            {
                hashSet.add(entry.getKey());
            }
        }
        for (int a:input)
        {
            if(hashSet.contains(a))
            {
                return a;
            }
        }
        return 0;
    }
}
