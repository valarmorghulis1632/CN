package Codezen.Assignment.Hashmap.Hashmap_1;

import java.util.*;

public class Longest_Consecutive_Sequence {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int elements=scan.nextInt();
        int[] arr=new int[elements];
        fillarray(arr);
        ArrayList<Integer> arrayList=longest_consecutive_sequence(arr);
        for (Integer x:arrayList)
        {
            System.out.print(x+" ");
        }
    }

    private static ArrayList<Integer> longest_consecutive_sequence(int[] input) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (Integer num: input)
        {
            hashMap.put(num,num);
        }
        ArrayList<Integer> arrayList=new ArrayList<>();
        int i=0,count,large=Integer.MIN_VALUE;
        while (i<input.length)
        {
            count=0;
            int temp=input[i]+1;
            while (count!=-1)
            {
                if(hashMap.containsKey(temp))
                {
                    count++;
                    temp++;
                }
                else
                {
                    hashMap.put(input[i],count);
                    break;
                }
            }
            i++;
        }
        HashSet<Integer> hashSet=new HashSet<>();
        for (int m:hashMap.values())
        {
            if(large<m)
            {
                large=m;
            }
        }
        for (Map.Entry<Integer,Integer> entry:hashMap.entrySet())
        {
            if(entry.getValue()==large)
            {
                hashSet.add(entry.getKey());
            }
        }
        int final_key=0;
        for (int n :input)
        {
            if(hashSet.contains(n))
            {
                final_key=n;
                break;
            }
        }
        int final_value=hashMap.get(final_key);
        i=1;
        arrayList.add(final_key);
        while (i<=final_value)
        {
            arrayList.add(final_key+i);
            i++;
        }
        return arrayList;
    }

    public static void fillarray(int[] input) {
        Scanner scan=new Scanner(System.in);
        int i=0;
        while (i<input.length)
        {
            input[i]=scan.nextInt();
            System.out.print(" ");
            i++;
        }
    }


}
