package Practice_Quests.Hasmap;

import java.util.*;

public class Max_Frequency_Word {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        System.out.println(max_freq_word(str));
    }

    public static String max_freq_word(String str)
    {
        HashMap<String,Integer> hashMap=new HashMap<>();
        String[] input=str.split(" ");
        int i=0;
        while (i<input.length)
        {
            if(hashMap.containsKey(input[i]))
            {
                hashMap.put(input[i],hashMap.get(input[i])+1);
            }
            else
            {
                hashMap.put(input[i],1);
            }
            i++;
        }
        int large=Integer.MIN_VALUE;
        String word="";
        for (Map.Entry<String,Integer> entry:hashMap.entrySet())
        {
            if(entry.getValue()>large)
            {
                word=entry.getKey();
                large=entry.getValue();
            }
        }
        return word;
    }
}
