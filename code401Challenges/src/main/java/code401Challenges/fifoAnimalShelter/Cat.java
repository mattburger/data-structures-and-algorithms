package code401Challenges.fifoAnimalShelter;

public class Cat extends Animal {
    boolean meow;

    public Cat(String name, String gender, String color, int ageInYears){
        super(name, gender, color, ageInYears);
        this.meow = true;
    }

    public boolean doesMeow() {
        return this.meow;
    }

}
