
// https://www.hackerrank.com/contests/30-days-of-code/challenges/day-15-linked-list/submissions/code/4681121
      
      Node* insert(Node *head,int data)
      {
          Node *node = new Node(data);
          
          if (head == NULL) {
              head = node;
          } else {
            Node* curr = head;
            
            while (curr->next) {
              curr = curr->next;
            }
          
            curr->next = new Node(data);
          }
          
          return head;
      }
      
      
