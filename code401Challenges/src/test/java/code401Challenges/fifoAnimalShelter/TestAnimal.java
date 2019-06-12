package code401Challenges.fifoAnimalShelter;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestAnimal {
    @Test
    public void testAnimal() {
        Animal a = new Animal("Sasquatch", "Male", "Brown", 200);

        assertEquals("getName should return the animal's name.", "Sasquatch", a.getName());
        assertEquals("getGender should return the animal's gender.", "Male", a.getGender());
        assertEquals("getColor should return the animal's color.", "Brown", a.getColor());
        assertEquals("getName should return the animal's age.", 200, a.getAgeInYears());
        assertFalse("Animal should not bark.", a.doesBark());
        assertFalse("Animal should not meow.", a.doesMeow());

    }
}
