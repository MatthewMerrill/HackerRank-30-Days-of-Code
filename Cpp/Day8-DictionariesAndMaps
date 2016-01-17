#include <map>
#include <iostream>
#include <string>
using namespace std;

// https://www.hackerrank.com/contests/30-days-of-code/challenges/day-8-dictionaries-and-maps/submissions/code/4671325

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    
    ios_base::sync_with_stdio (false);
    
    map<string, int> mymap;
    map<string, int>::iterator it;
    
    int n;
    cin >> n;
    for (int i = 0; i < n; ++i) {
        
        string key;
        int value;
        
        cin.ignore();
        getline(cin, key);
        cin >> value;
        
        mymap[key] = value;
        
    }
    
    string qry;
    cin.ignore();
    while (cin.good()) {
        getline(cin, qry);
            
        it = mymap.find(qry);
        if (it == mymap.end())
            cout << "Not found" << endl;
        else
            cout << qry << "=" << it->second << endl;
    }
    
    
    return 0;
}
