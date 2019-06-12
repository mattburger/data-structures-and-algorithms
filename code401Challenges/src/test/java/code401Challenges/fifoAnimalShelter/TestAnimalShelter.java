package code401Challenges.fifoAnimalShelter;

import code401Challenges.stackandqueues.Queue;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestAnimalShelter {
    @Test
    public void testAnimalShelter() {
        AnimalShelter as = new AnimalShelter();
        Dog d = new Dog("Balto", "Male", "Grey", 4);
        Cat c = new Cat("Milo", "Male", "Orange", 2);
        Animal a = new Animal("Sasquatch", "Male", "Brown", 200);

        as.enqueue(d);
        as.enqueue(c);
        as.enqueue(a);

        assertEquals("Dequeue should return a Dog, Cat, or null.", "Balto", as.dequeue("dog").getName() );
        assertEquals("Dequeue should return a Dog, Cat, or null.", "Milo", as.dequeue("cat").getName() );
        assertEquals("Dequeue should return a Dog, Cat, or null.", null, as.dequeue("dog") );

    }

    @Test(expected = IllegalStateException.class)
    public void testAnimalShelter_empty() {
        AnimalShelter as = new AnimalShelter();

        assertEquals("Dequeue should return a Dog, Cat, or null.", "Balto", as.dequeue("dog").getName() );

    }
}
