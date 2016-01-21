
// https://www.hackerrank.com/contests/30-days-of-code/challenges/day-18-queues-stacks/submissions/code/4743119

class Palindrome {
    
    Queue<Character> queue = new LinkedList<Character>();
    Stack<Character> stack = new Stack<Character>();
    
    void pushCharacter(char ch) {
        stack.add(ch);
    }
    
    void enqueueCharacter(char ch) {
        queue.add(ch);
    }
    
    char popCharacter() {
        return stack.pop();
    }
    
    char dequeueCharacter() {
        return queue.remove();
    }
}
