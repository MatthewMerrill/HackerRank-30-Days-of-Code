import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arithmetic {

// https://www.hackerrank.com/contests/30-days-of-code/challenges/day-2-arithmetic/submissions/code/4681483

    public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
      double M = sc.nextDouble(); // original meal price
      double T = sc.nextInt(); // tip percentage
      double X = sc.nextInt(); // tax percentage
      
      T = (M * T) / 100;
      X = (M * X) / 100;
    
      System.out.println("The final price of the meal is $"
        + Math.round((M + T + X)) + ".");
      
    }
}
