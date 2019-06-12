package code401Challenges.fifoAnimalShelter;

public class Animal {

    protected String name;
    protected String gender;
    protected String color;
    protected int ageInYears;
    protected boolean bark;
    protected boolean meow;

    public Animal(String name, String gender, String color, int ageInYears){
        this.name = name;
        this.gender = gender;
        this.color = color;
        this.ageInYears = ageInYears;
    }

    public String getName() {
        return this.name;
    }

    public String getGender() {
        return this.gender;
    }

    public String getColor() {
        return this.color;
    }

    public int getAgeInYears() {
        return ageInYears;
    }

    public boolean doesMeow() {
        return this.meow;
    }

    public boolean doesBark() {
        return this.bark;
    }
}
