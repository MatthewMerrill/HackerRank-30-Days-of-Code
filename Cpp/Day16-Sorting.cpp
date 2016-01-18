#include <cmath>
#include <climits>
#include <list>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

// https://www.hackerrank.com/contests/30-days-of-code/challenges/day-16-closest-numbers/submissions/code/4681380

int main()
{
    
    int T;
    cin >> T;
    
    vector<int> arr(T, 0);
    for (int n = 0; n < T; n++)
    {
        int i;
        cin >> i;
        arr[n] = i;
    }
    
    sort(arr.begin(), arr.end());
    
    int minDiff = INT_MAX;
    std::list<int> minPairs;
    
    for (int i = 0; i+1 < arr.size(); i++)
    {
        int diff = arr[i+1] - arr[i];
        if (diff < minDiff)
        {
            minDiff = diff;
            minPairs.clear();
        }
        
        if (diff == minDiff)
        {
            minPairs.push_back(arr[i]);
            minPairs.push_back(arr[i+1]);
        }
    }
    
    for (int i : minPairs)
    {
        cout << i << " ";
    }
    
    return 0;
}
