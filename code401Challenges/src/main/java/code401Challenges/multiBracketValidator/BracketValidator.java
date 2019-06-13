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
                this.openBrackets.push(tmp);
            }
            if( (tmp == '}') || (tmp == ')') || (tmp == ']') ) {
                this.tmpBrackets.push(tmp);
            }
        }
    }

    private void flip() {
        if(tmpBrackets.getTop() != null) {
            while (tmpBrackets.getTop() != null) {
                closedBrackets.push(tmpBrackets.pop());
            }
        }

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

        if(this.openBrackets.getTop() == null && this.closedBrackets.getTop() == null ) {
            return true;

        } else if(this.openBrackets.getTop() == null && this.closedBrackets.getTop() != null ){
            return false;

        } else if(this.openBrackets.getTop() != null && this.closedBrackets.getTop() == null ){
            return false;
        }

        else if(this.input.length() < 1) {
            return true;
        }

        else {
            populateStacks();
            flip(); //flip the stack to 'match' (if balanced) the openBrackets stack
            while (this.openBrackets.getTop() != null && this.closedBrackets.getTop() != null) {

                char open = (char) this.openBrackets.pop();
                char close = (char) this.closedBrackets.pop();

                if (parenBalance(open, close) || curlyBalance(open, close) || squareBalance(open, close)) {
                    System.out.println("yay");
                } else {
                    return false;
                }

            }
            return true;
        }
    }
}
