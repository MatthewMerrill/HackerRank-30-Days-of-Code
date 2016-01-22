
// https://www.hackerrank.com/contests/30-days-of-code/challenges/day-20-review-plus-more-string-methods/submissions/code/4760232

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(scn.nextLine(), " ![,?.\\_'@+]");
        
        System.out.println(st.countTokens());
        
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        
    }
}
