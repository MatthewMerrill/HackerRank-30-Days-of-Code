import java.util.Scanner;
import java.util.regex.*;

// https://www.hackerrank.com/contests/30-days-of-code/challenges/day-28-regex-patterns-intro-to-databases/submissions/code/4906823

public class Solution
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases-->0){
         String pattern = in.nextLine();
         
          try {
              Pattern.compile(pattern);
              System.out.println("Valid");
          } catch (Exception ignored) {
              System.out.println("Invalid");
          }
      }
   }
}
