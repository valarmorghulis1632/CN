/**QUESTION -
 * Write a program to print first 20 terms of the series 3n+2 which
 are not multiples of 4.
 */
package Lectures.Lecture_2_Programming_Fundamentals.Assignment_2B;

/**
 * Created by Ayush Deshwal on 12/06/2017.
 */
public class Print_20_Terms {
    public static void main(String[] args) {
    int i=1,count=1,term;  //count is keeping track of number of terms printed (<=20)
    while(count<=20) {
        term = (3 * i) + 2;
        if (term % 4 != 0) {
            System.out.print(term + " ");
            count++;
        }
        i++;
      }
    }
}
