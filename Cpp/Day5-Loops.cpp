#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

// https://www.hackerrank.com/contests/30-days-of-code/challenges/day-5-loops/submissions/code/4670907

void series(int a, int b, int N) {
    for (int n = 0; n < N; ++n) {
        
        int bSum = 0;
        
        for (int i = 0; i <= n; ++i)
            bSum += (lround(pow(2, i)) * b);
        
        cout << a + bSum;
        if (n+1 != N)
            cout << " ";
    }
    cout << endl;
}

int main() {
    int t;
    cin >> t;
    
    while (t --> 0) {
        int a, b, n;
        cin >> a >> b >> n;
        series(a, b, n);
    }
    
    return 0;
}

