    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;

// https://www.hackerrank.com/contests/30-days-of-code/challenges/day-3-if-statements/submissions/code/4681890

    public class Solution {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();            
            String ans;
            if(n%2==1)ans = "Weird";
            else
            {
                if (n > 20)
                    ans = "Not Weird";
                else if (n > 5)
                    ans = "Weird";
                else
                    ans = "Not Weird";
            }
            System.out.println(ans);
            
        }
    }
