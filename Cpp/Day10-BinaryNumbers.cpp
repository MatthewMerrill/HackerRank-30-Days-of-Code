#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

// https://www.hackerrank.com/contests/30-days-of-code/challenges/day-10-binary-numbers/submissions/code/4671541

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    
    int t;
    cin >> t;
    
    while (t --> 0) {
        
        int n,log;
        cin >> n;
        
        for (int i = log2(n); i >= 0; --i) {
            cout << ((n>>i)&1);
        }
        
        cout << endl;
    }
    
    return 0;
}
