package iktlabcourse;

public class Human {

    private String name;
    private String surname;
    private int year;
    private int IQ;

    public Human() {

    }

    public Human(String name, String surname, int year, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }



    Pet pet = new Pet();
    Human mother = new Human();
    Human father = new Human();

    public void greetPetMethod() {
        System.out.println("Hello, [the name of the pet]");
    }

    public void describePetMethod() {
        System.out.println();
    }

    public String toString() {
        return String.format("name - %s, surname - %s, year - %d, IQ - %s, ", name, surname, year, IQ);

    }
}