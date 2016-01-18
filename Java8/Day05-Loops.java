import java.io.*;
import java.util.*;

// https://www.hackerrank.com/contests/30-days-of-code/challenges/day-5-loops/submissions/code/4682102

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        for (int cases = scn.nextInt(); cases > 0; --cases) {
            
            int a = scn.nextInt();
            int b = scn.nextInt();
            int n = scn.nextInt();
            
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += (int)(Math.pow(2, i) * b);
                if (i != 0)
                    System.out.print(" ");
                System.out.print(sum+a);
            }
            if (cases > 1)
                System.out.println();
        }
    }
}
