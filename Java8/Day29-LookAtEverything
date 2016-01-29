import java.io.*;
import java.util.*;

// https://www.hackerrank.com/contests/30-days-of-code/challenges/day-29-look-at-everything-weve-learned/submissions/code/4940335

public class Solution {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        int cases = scn.nextInt();
        
        scn.nextLine();
        
        while (cases --> 0) {
            String word = scn.nextLine();
            System.out.println(funny(word));
        }
    }
    
    private static String funny(String word) {

        int l = word.length();

        // "Funny" if:
        for (int i = 0; i < l-1; i++) {
            int f = l - i - 1;

            int s = Math.abs(word.charAt(i) - word.charAt(i+1));
            int r = Math.abs(word.charAt(f) - word.charAt(f-1));
            
            if (s != r)
                return "Not Funny";
        }
        
        return "Funny";
    }
}
