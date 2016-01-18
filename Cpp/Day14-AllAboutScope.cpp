
// https://www.hackerrank.com/contests/30-days-of-code/challenges/day-14-scope-and-imports/submissions/code/4681014
	
	// Add your code here
    Difference(vector<int> a) {
        elements = a;
    }
    void computeDifference() {
        int max = 0;
        int min = 101;
        
        for (int i : elements) {
            if (i > max)
                max = i;
            if (i < min)
                min = i;
        }
        
        maximumDifference = max - min;
    }
