import java.io.*;
import java.util.*;

// https://www.hackerrank.com/contests/30-days-of-code/challenges/day-27-testing-part-2/submissions/code/4879789

public class Solution {
    //*
    public static void main(String[] args) {
        
        // We need the output to be cases that follow the pattern:
        // YES
        // NO
        // YES
        // NO
        // YES
        
       System.out.println("5");
       System.out.println("21 20");
       System.out.println("-1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 0 -1 -1 -1 -1 -1 -1 1 1");
       System.out.println("20 2");
       System.out.println("-1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 0 -1 7 -1 -1 -1");
       System.out.println("5 3");
       System.out.println("5 5 5 0 -1");
       System.out.println("4 2");
       System.out.println("-1 0 4 2");
       System.out.println("3 3");
       System.out.println("-1 1 0");

        
    }
    
    /*/
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        for (int cases = scn.nextInt(); cases > 0; --cases) {
            System.out.println(runCase(scn));
        }
    }
    
    public static String runCase(Scanner scn) {
        
        int N = scn.nextInt();
        int K = scn.nextInt();
        
        for (int n = 0; n < N; ++n) {
            if (scn.nextInt() <= 0) {
                --K;
            }
        }
        
        return (K <= 0) ? "NO" : "YES";
    }
    //*/
}
