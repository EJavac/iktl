package iktlabcourse;

public class Pet {

    private String species;
    private String nickname = "Rock";
    private int age = 5;
    private int trickLevel = 75;

    private String [] habits = {"eat", "drink", "sleep"};

    public Pet(String species, String nickname){
        this.species=species;
        this.nickname=nickname;
    }

    public Pet(){

    }

    public Pet(String species, String nickname, int age, int trickLevel, String [] habits){
        this.species=species;
        this.nickname=nickname;
        this.age =age;
        this.trickLevel =trickLevel;
        this.habits =habits;
    }
    /*
    constructor which describes the pet's species an nickname
    - constructor which describes all the fields for the pet
    - empty constructor
     */

    public void eatMethod() {
        System.out.println("I am eating");
    }
    public void respondMethod(){
        System.out.println("Hello, owner. I am - [the name of the pet]. I miss you!");
    }

    public void foulMethod(){
        System.out.println("I need to cover it up");

    }
    public String toString(){
        return String.format("nickname - %s, age - %d, trickLevel - %s, habits - %s, spices - %s ", nickname, age, trickLevel, habits, species);
                /*
                `dog{nickname='Rock', age=5, trickLevel=75, habits=[eat, drink, sleep]}`, where `dog` = species;
                 */
    }
}