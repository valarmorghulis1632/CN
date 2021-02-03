package Codezen.Assignment.Hashmap.Hashmap_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Longest_Subset_Sum_to_Zero {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int elements=scanner.nextInt();
        ArrayList<Integer> arrayList=new ArrayList<>(elements);
        while (elements!=0)
        {
            arrayList.add(scanner.nextInt());
            elements--;
        }
        longest_subset_sum_0(arrayList);
    }

    private static int longest_subset_sum_0(ArrayList<Integer> arrayList) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        int sum=0;
        int max_length=0;
        int i=0;
        while (i<arrayList.size())
        {

        }
        return 0;
    }
}
