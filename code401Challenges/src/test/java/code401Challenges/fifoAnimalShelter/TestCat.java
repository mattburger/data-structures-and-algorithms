package code401Challenges.fifoAnimalShelter;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestCat {
    @Test
    public void testCat (){
        Cat c = new Cat("Milo", "Male", "Orange", 2);

        assertEquals("The bark value should be set to true.", true, c.doesMeow());
        assertFalse("The meow value should not be true.", c.doesBark());

    }
}
