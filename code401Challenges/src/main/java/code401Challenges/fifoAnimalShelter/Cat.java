package code401Challenges.fifoAnimalShelter;

public class Cat extends Animal {

    public Cat(String name, String gender, String color, int ageInYears){
        super(name, gender, color, ageInYears);
        this.meow = true;
        setMeow(true);
    }
    public void setMeow(boolean flag) {
        this.meow = flag;
    }
}
