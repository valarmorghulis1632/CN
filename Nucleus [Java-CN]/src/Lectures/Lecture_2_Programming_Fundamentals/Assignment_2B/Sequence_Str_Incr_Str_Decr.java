/**QUESTION -
 * You are given S a sequence of n integers S = s1, s2, ..., sn.
 Please, compute if it is possible to split S into two parts : s1, s2,
 ..., si and si+1, si+2, ….., sn
 (1 <= i < n) in such a way that the first part is strictly decreasing
 while the second is strictly increasing one. First take n as input
 and then take n more integers, output yes or no.
 */
package Lectures.Lecture_2_Programming_Fundamentals.Assignment_2B;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 13/06/2017.
 */
public class Sequence_Str_Incr_Str_Decr {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("ENTER WITH ARRAY(A) OR WITHOUT ARRAY(B): ");
        char choice=scan.next().charAt(0);
        if(choice=='A' || choice=='a')
            Seq_With_Array();
        else if(choice=='B' || choice=='b')
            Seq_Without_Array();
        else System.out.println("\n  INVALID CHOICE");
    }



    public static void Seq_With_Array()
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF TERMS IN SEQUENCE S: ");
        int num=scan.nextInt();
        int i=1;
        int s[]=new int[15];
        while (i<=num) {
            System.out.print("ENTER THE NUMBER S" + i + " : ");
            s[i] = scan.nextInt();
            i++;
        }
        System.out.print("\n");
        int large=s[1];
        int small;
        int firstpart[]=new int[15];
        int secondpart[]=new int[15];
        firstpart[1]=large;
        i=2;
        while(i<num)
        { if(large<s[i]) {
            firstpart[i] = s[i];
            large = s[i];
          }
          else {
            secondpart[1] = s[i];
            break;
          }
          i++;
        }
        small=secondpart[1];
        if(i==num)
            secondpart[1]=s[num];
        int j=2;
        i++;
        while(i<=num) {
            if (small > s[i]) {
                secondpart[j] = s[i];
                small = s[i];
                j++;
            }
            else break;
            i++;
        }
        j=1;
        System.out.print("STRICTLY INCREASING PART: ");
        while(firstpart[j]!='\0') {
            System.out.print(firstpart[j] + " ");
            j++;
         }
        j=1;
        System.out.print("\nSTRICTLY DECREASING PART: ");
        while(secondpart[j]!='\0') {
            System.out.print(secondpart[j] + " ");
            j++;
        }
        System.out.print("\n");
      if(i==num+1) {
          System.out.println("\n  YES IT CAN BE BROKEN");
      }
      else System.out.println("\n  IT CAN'T BE BROKEN");
    }



    public static void Seq_Without_Array()
    {
        Scanner scan=new Scanner(System.in);
        int i=1,count=0;
        System.out.print("ENTER THE NUMBER OF TERMS IN SEQUENCE: ");
        int n=scan.nextInt();
        System.out.print("ENTER THE ELEMENTS: ");
        int s1=scan.nextInt();
        while(i<n)
        {
            int s2=scan.nextInt();
            if(s2<s1 )
            { if(count==0)
                {
                   s1 = s2;
                   if (i+1==n) {
                       System.out.println("\n  YES IT CAN BE BROKEN");
                       break;
                   }
                      i++;
                }
              else
                {
                    System.out.println("\n  IT CAN'T BE BROKEN");
                    break;
                }
            }
            else
            { s1=s2;
              count++;
              if(i+1==n) {
                  System.out.println("\n  YES IT CAN BE BROKEN");
                  break;
                }
              i++;
            }
        }
    }

}
