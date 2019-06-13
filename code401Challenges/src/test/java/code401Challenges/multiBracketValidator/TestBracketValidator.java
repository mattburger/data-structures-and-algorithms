package code401Challenges.multiBracketValidator;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestBracketValidator {

    @Test
    public void testBracketValidtor() {

        assertTrue("isBalanced should return true.", new BracketValidator("[]").isBalanced());
        assertTrue("isBalanced should return true.", new BracketValidator("([{}])").isBalanced());
//        assertTrue("isBalanced should return true.", new BracketValidator("{{{[[[((({}[](){})))]]]}}}").isBalanced());
        assertTrue("isBalanced should return true.", new BracketValidator("").isBalanced());
//        assertFalse("isBalanced should return false.", new BracketValidator("      ").isBalanced());
        assertFalse("isBalanced should return false.", new BracketValidator("{{{{{{{{{{{{{{").isBalanced());
        assertFalse("isBalanced should return false.", new BracketValidator("}}}}}}}}}}}}}}}").isBalanced());
        assertFalse("isBalanced should return false.", new BracketValidator("}").isBalanced());
        assertFalse("isBalanced should return false.", new BracketValidator("{").isBalanced());

    }
}
