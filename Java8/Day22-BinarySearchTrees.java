
// https://www.hackerrank.com/contests/30-days-of-code/challenges/day-22-binary-search-trees/submissions/code/4760287

	public static int getHeight(Node root){
        
        if (root == null)
            return 0;
        
        int maxHeight = 0;
        maxHeight = Math.max(maxHeight, getHeight(root.left));
        maxHeight = Math.max(maxHeight, getHeight(root.right));
        
        return maxHeight + 1;
    }
