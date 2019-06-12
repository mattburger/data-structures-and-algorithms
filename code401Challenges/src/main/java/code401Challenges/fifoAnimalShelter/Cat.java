package code401Challenges.fifoAnimalShelter;

public class Cat extends Animal {

    public Cat(String name, String gender, String color, int ageInYears){
        super(name, gender, color, ageInYears);
        setMeow(true);
    }

    private void setMeow(boolean flag) {
        this.meow = flag;
    }
}
