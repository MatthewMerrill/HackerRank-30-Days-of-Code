#include <map>
#include <set>
#include <list>
#include <cmath>
#include <ctime>
#include <deque>
#include <queue>
#include <stack>
#include <string>
#include <bitset>
#include <cstdio>
#include <limits>
#include <vector>
#include <climits>
#include <cstring>
#include <cstdlib>
#include <fstream>
#include <numeric>
#include <sstream>
#include <iostream>
#include <algorithm>
#include <unordered_map>

using namespace std;

// https://www.hackerrank.com/contests/30-days-of-code/challenges/day-6-lets-review/submissions/code/4670970

int main(){
    int n;
    cin >> n;
    
    string spce = string(n, ' ');
    string symb = string(n, '#');
    
    for (int i = 1;  i <= n; ++i)
        cout << spce.substr(0, n - i) << symb.substr(0, i) << endl;
    
    return 0;
}
