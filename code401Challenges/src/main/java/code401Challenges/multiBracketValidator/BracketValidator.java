package code401Challenges.multiBracketValidator;

import code401Challenges.stackandqueues.Stack;

public class BracketValidator {
    Stack openBrackets;
    Stack tmpBrackets;
    Stack closedBrackets;
    String input;

    public BracketValidator(String input) {
        this.openBrackets = new Stack();

        this.input = input;
    }

    private boolean parenBalance(char a, char b) {
        if(  a == '(' && b == ')') {
            return true;
        } else {
            return false;
        }
    }

    private boolean curlyBalance(char a, char b) {
        if(  a == '{' && b == '}') {
            return true;
        } else {
            return false;
        }
    }

    private boolean squareBalance(char a, char b) {
        if(  a == '[' && b == ']') {
            return true;
        } else {
            return false;
        }
    }

    public boolean isBalanced() {

        if(this.input.equals("")) {
            return true;
        }
        char tmp;//hold character of string
        for(int i = 0; i < this.input.length(); i++) {
            tmp = this.input.charAt(i);
            if( (tmp == '{') || (tmp == '(') || (tmp == '[') ) {
                this.openBrackets.push(tmp);
            }
            if( (tmp == '}') || (tmp == ')') || (tmp == ']') ) {
                if(this.openBrackets.getTop() == null) {
                    return false;
                }
                if(!parenBalance(tmp, (char)this.openBrackets.peek() ) ||
                        !curlyBalance(tmp, (char)this.openBrackets.peek()) ||
                        !squareBalance(tmp, (char)this.openBrackets.peek())){
                    System.out.println("Peek: " + (char)this.openBrackets.peek() );
                    return false;
                }
            }
        }
        return true;
    }
}
