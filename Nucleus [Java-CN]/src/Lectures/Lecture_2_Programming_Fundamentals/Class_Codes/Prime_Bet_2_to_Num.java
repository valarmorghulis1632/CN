package Lectures.Lecture_2_Programming_Fundamentals.Class_Codes;
/**
 * Created by Ayush Deshwal on 12/06/2017.
 */
import java.util.Scanner;
public class Prime_Bet_2_to_Num {
        public static void main(String[] args)
        {

            Scanner scan=new Scanner(System.in);
            System.out.println("Enter the Number");
            int num=scan.nextInt();
            int i=2,j,flag=0;
            if(num<2)
                System.out.println("NO PRIMES");
            else
            {
                while (i <= num)
                { j=2;
                  flag=0;
                    while(j<=Math.sqrt(i))
                    {
                        if(i%j==0)
                        {   flag = 1;
                            break;
                        }
                         j++;
                    }
                    if(flag==0)
                        System.out.print(i+" ");
                    i++;
                }
            }

        }
}





