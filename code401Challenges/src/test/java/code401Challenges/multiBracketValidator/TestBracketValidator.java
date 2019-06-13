package code401Challenges.multiBracketValidator;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestBracketValidator {

    @Test
    public void testBracketValidtor() {
        String in = "{ { [ ( ) ( ) ] } }";
        BracketValidator bv = new BracketValidator(in);
        boolean expectedOutput = true;
        boolean actualOutput = bv.isBalanced();

        assertEquals("isBalanced should return true.", expectedOutput, actualOutput);


    }
}
