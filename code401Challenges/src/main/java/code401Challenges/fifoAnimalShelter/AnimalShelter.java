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

    public Animal dequeue(String pref) {
        if(this.animalShelter.getFront() != null) {
            Animal tmp = (Animal)this.animalShelter.peek();
            String nextAnimal;
            this.animalShelter.dequeue();
            if(tmp.doesBark()) {
                nextAnimal = "dog";
                if(pref.equals(nextAnimal)) {
                    return tmp;
                }
            } else if(tmp.doesMeow()) {
                nextAnimal = "cat";
                if(pref.equals(nextAnimal)) {
                    return tmp;
                }
            }
            else {
                return null;
            }
        } else {
            throw new IllegalStateException("Cannot take any animals for the shelter if it is empty");
        }
        return null;
    }
}
