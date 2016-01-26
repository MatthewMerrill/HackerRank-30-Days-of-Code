
// https://www.hackerrank.com/contests/30-days-of-code/challenges/day-23-review-and-binary-trees/submissions/code/4822505

    static void levelOrder(Node root){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            Node node = queue.remove();
            
            if (node == null)
                continue;

            queue.add(node.left);
            queue.add(node.right);
            
            System.out.print(node.data + " ");
        }
    }
