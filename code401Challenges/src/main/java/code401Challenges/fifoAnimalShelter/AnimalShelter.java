package code401Challenges.fifoAnimalShelter;

import code401Challenges.stackandqueues.Queue;

public class AnimalShelter {
    Queue animalShelter;

    public AnimalShelter() {
        this.animalShelter = new Queue();
    }

    public void enqueue(Animal animal) {
        this.animalShelter.enqueue(animal);
    }

    public Animal dequeue(Animal pref) {
        if(this.animalShelter.getFront() != null) {
            pref = (Animal) this.animalShelter.peek();
            if(pref.doesBark() || pref.doesMeow()) {
                return pref;
            } else {
                return null;
            }
        } else {
            throw new IllegalStateException("Cannot take any animals for the shelter if it is empty");
        }
    }
}
