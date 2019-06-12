package code401Challenges.fifoAnimalShelter;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestDog {

    @Test
    public void testDog (){
        Dog d = new Dog("Balto", "Male", "Grey", 4);

        assertEquals("The bark value should be set to true.", true, d.doesBark());
        assertFalse("The meow value should not be true.", d.doesMeow());
    }
}
