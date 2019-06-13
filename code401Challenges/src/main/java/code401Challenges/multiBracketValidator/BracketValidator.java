package code401Challenges.multiBracketValidator;

import code401Challenges.stackandqueues.Stack;

public class BracketValidator {
    Stack openBrackets;
    Stack tmpBrackets;
    Stack closedBrackets;
    String input;

    public BracketValidator(String input) {
        this.openBrackets = new Stack();
        this.tmpBrackets = new Stack();
        this.closedBrackets = new Stack();
        this.input = input;
    }

    private void populateStacks() {
        char tmp;//hold character of string
        for(int i = 0; i < this.input.length(); i++) {
            tmp = this.input.charAt(i);
            if( (tmp == '{') || (tmp == '(') || (tmp == '[') ) {
                System.out.println("Open bracket: " + tmp);
                this.openBrackets.push(tmp);
            }
            if( (tmp == '}') || (tmp == ')') || (tmp == ']') ) {
                System.out.println("Closed bracket: " + tmp);
                this.tmpBrackets.push(tmp);
            }
        }
    }

    private void flip() {
        while(tmpBrackets.getTop() != null) {
            closedBrackets.push(tmpBrackets.pop());
        }
        System.out.println("peeking" + closedBrackets.peek());

    }
    private boolean parenBalance(String a, String b) {
        if(  a.equals('(') && b.equals(')') ) {
            return true;
        } else {
            return false;
        }
    }

    private boolean curlyBalance(String a, String b) {
        if(  a.equals('{') && b.equals('}') ) {
            return true;
        } else {
            return false;
        }
    }

    private boolean squareBalance(String a, String b) {
        if( a.equals('[') && b.equals(']') ) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isBalanced() {
        populateStacks();
        flip(); //flip the stack to 'match' (if balanced) the openBrackets stack
        while(this.openBrackets.getTop() != null && this.closedBrackets.getTop() != null) {
            String open = this.openBrackets.pop().toString();
            String close = this.closedBrackets.pop().toString();
            if(parenBalance(open, close) || curlyBalance(open, close) || squareBalance(open, close)){
                System.out.println("match");

            } else {
                System.out.println(("not match"));
            }
        }
        return true;
    }
}
