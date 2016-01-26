import java.io.*;
import java.util.*;

// https://www.hackerrank.com/contests/30-days-of-code/challenges/day-25-running-time/submissions/code/4822267

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        for (int cases = scn.nextInt(); cases > 0; --cases) {
            System.out.println(checkPrime(scn.nextInt()));
        }
    }
    
    private static String checkPrime(int n) {
        
        if (n == 1)
            return "Not prime";
        
        for (int i = 2; i*i <= n; i+=2) {
            if (n % i == 0)
                return "Not prime";
            if (i == 2)
                --i;
        }
        
        return "Prime";
    }
}
