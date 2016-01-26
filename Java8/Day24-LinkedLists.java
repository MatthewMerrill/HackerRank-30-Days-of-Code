   
// https://www.hackerrank.com/contests/30-days-of-code/challenges/day-24-more-review-plus-more-linked-lists/submissions/code/4822664
   
    public static Node removeDuplicates(Node head) {
        
        if (head == null)
            return head;
        
        Set<Integer> seen = new HashSet<Integer>();
        seen.add(head.data);
        
        Node curr = head;
        
        while (curr.next != null) {
            
            if (seen.contains(curr.next.data)) {
                curr.next = curr.next.next;
            } else {
                seen.add(curr.next.data);
                curr = curr.next;
            }
            
        }
        
        return head;
    }
