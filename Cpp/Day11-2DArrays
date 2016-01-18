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
using namespace std;

// https://www.hackerrank.com/contests/30-days-of-code/challenges/day-11-more-review/submissions/code/4680685

int main(){
    vector< vector<int> > arr(6,vector<int>(6));
    
    vector<int> sums(16, 0);
    
    for(int arr_i = 0;arr_i < 6;arr_i++){
       for(int arr_j = 0;arr_j < 6;arr_j++){
           
          cin >> arr[arr_i][arr_j];

          for (int di = -2; di < 1; di++) {
              for (int dj = -2; dj < 1; dj++) {
                  
                  int i,j;
                  i = arr_i + di;
                  j = arr_j + dj;
                  
                  if (i < 0 || j < 0 || i >= 4 || j >= 4) {
                      continue;
                  }
                  
                  if (dj == -2 && di == -1)
                      continue;
                  if (dj == 0  && di == -1)
                      continue;
                  
                  sums[(i<<2) + j] += arr[arr_i][arr_j];
                  
              }
          }
       }
    }
    
    int max = INT_MIN;
    for (int i = 0; i < 16; i++) {
        if (sums[i] > max)
            max = sums[i];
    }
    
    cout << max;
    
    return 0;
}
