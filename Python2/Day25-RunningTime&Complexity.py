
# https://www.hackerrank.com/contests/30-days-of-code/challenges/day-25-running-time/submissions/code/4861343

def checkPrime(n):
    if (n == 1):
        return "Not prime";
    i = 2
    while (i*i <= n):
        if (n % i == 0):
            return "Not prime"
        if (i == 2):
            i -= 1;
        i+=2
        
    return "Prime"

cases = int(raw_input())
while (cases > 0):
    print (checkPrime(int(raw_input())))
    cases -= 1
