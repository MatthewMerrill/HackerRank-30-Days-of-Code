#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

// https://www.hackerrank.com/contests/30-days-of-code/challenges/day-9-recursion/submissions/code/4671385

int find_gcd(int a,int b){
    if (b == 0)
        return a;
    return find_gcd(b, a%b);
}
int main() {
    int a,b;
    cin >> a >> b;
    
    int gcd=find_gcd(a,b);
    cout<<gcd;
    
    return 0;   
}
