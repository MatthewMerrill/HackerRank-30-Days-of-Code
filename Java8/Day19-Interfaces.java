
// https://www.hackerrank.com/contests/30-days-of-code/challenges/day-19-interfaces/submissions/code/4760172

class Calculator implements AdvancedArithmetic {
    
    public int divisorSum(int n) {
        Set<Integer> divisors = divisors(n);
        
        int sum = 0;
        for (Integer i : divisors)
            sum += i;
        
        return sum;
    }
    
    private Set<Integer> divisors(int n) {
        Set<Integer> divisors = new HashSet<Integer>();
        
        divisors.add(1);
        divisors.add(n);
        
        for (int i = 2; i*i <= n; ++i) {
            if (n % i == 0) {
                divisors.add(i);
                divisors.add(n / i);
            }
        }
        
        return divisors;
    }
    
    
}
