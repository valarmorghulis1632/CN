package Codezen.Assignment.Hashmap.Hashmap_1;

import java.util.HashMap;
import java.util.Scanner;

public class Extract_Unique_Characters
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        System.out.println(extract_unique_char(str));
    }

    public static String extract_unique_char(String str)
    {
        HashMap<Character,Integer> hashMap=new HashMap<>();
        int i=0,count=0;
        String str_1="";
        while (i<str.length())
        {
            if(!hashMap.containsKey(str.charAt(i)))
            {
                hashMap.put(str.charAt(i),count);
                str_1=str_1+str.charAt(i);
                count++;
            }
            i++;
        }
        return str_1;
    }
}
