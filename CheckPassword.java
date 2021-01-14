package iktlabcourse;

public class CheckPassword {
    int acceptablePassword = 10;


    public void checkPassword(String enteredText){

        if(enteredText.length()<acceptablePassword) {
            System.out.println("Your password is wrong");
        }else System.out.println("Your password is correct!!!");

        if(letterCount())
    }


    public static boolean letterCount(char character) {
        character = Character.toLowerCase(character);
        return (character >= 'a' && character <= 'z');
    }


    public static boolean digitCount(char digit) {
        return (digit >= '0' && digit <= '9');
    }
}
