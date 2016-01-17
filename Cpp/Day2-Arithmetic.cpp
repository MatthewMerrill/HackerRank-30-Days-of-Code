#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

// https://www.hackerrank.com/contests/30-days-of-code/challenges/day-2-arithmetic/submissions/code/4670598

int main() {
    
    double m;
    double t;
    double x;
    
    cin >> m;
    cin >> t;
    cin >> x;
    
    t = (m * t) / 100;
    x = (m * x) / 100;
    
    cout << "The final price of the meal is $"
        << lround((m + t + x)) << ".";
    
    return 0;
}
