import java.io.*;
import java.util.*;

import static java.util.Calendar.*;

// https://www.hackerrank.com/contests/30-days-of-code/challenges/day-26-testing-part-1-plus-implementations/submissions/code/4861593

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println(penalty(scn));
        
    }
    
    private static int penalty(Scanner scn) {
        Stack<Integer> stack = new Stack<Integer>();
        
        for (int i = 0; i < 6; i++) {
            stack.push(scn.nextInt());
        }
        
        GregorianCalendar expected = new GregorianCalendar(stack.pop(), stack.pop() - 1, stack.pop() - 1);
        GregorianCalendar actual = new GregorianCalendar(stack.pop(), stack.pop() - 1, stack.pop() - 1);
        
        if (actual.before(expected))
            return 0;
        
        if (actual.get(YEAR) != expected.get(YEAR))
            return 10000;
        
        if (actual.get(MONTH) == expected.get(MONTH))
            return 15 * (actual.get(DAY_OF_YEAR) - expected.get(DAY_OF_YEAR));
        
        return 500 * (actual.get(MONTH) - expected.get(MONTH));
    }
}
