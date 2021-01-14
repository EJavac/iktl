package iktlabcourse;

public class Human {

    private String name ="Michael" ;
    private String surname = "Karleone";
    private int year = 1977;
    private int IQ = 90;

    //Human{name='Michael', surname='Karleone', year=1977, iq=90, mother=Jane Karleone, father=Vito Karleone, pet=dog{nickname='Rock', age=5, trickLevel=75, habits=[eat, drink, sleep]}}`
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