package code401Challenges.fifoAnimalShelter;

public class Dog extends Animal {

    public Dog(String name, String gender, String color, int ageInYears){
        super(name, gender, color, ageInYears);
        this.bark = true;
        setBark(true);
    }

    public void setBark(boolean flag) {
        this.bark = flag;
    }
}
