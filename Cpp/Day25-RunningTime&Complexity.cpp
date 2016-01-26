#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

// https://www.hackerrank.com/contests/30-days-of-code/challenges/day-25-running-time/submissions/code/4822375

string checkPrime(int n) {
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

int main() {
    int cases, input;
    cin >> cases;
    for (; cases > 0; --cases) {
        cin >> input;
        cout << checkPrime(input) << endl;
    }
}
