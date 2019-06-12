package code401Challenges.fifoAnimalShelter;

public class Dog extends Animal {
    boolean bark;

    public Dog(String name, String gender, String color, int ageInYears){
        super(name, gender, color, ageInYears);
        this.bark = true;
    }

    public boolean doesBark() {
        return this.bark;
    }
}
