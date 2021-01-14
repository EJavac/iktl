package iktlabcourse;

import java.util.Scanner;

public class CheckPassword {
   static  int   acceptablePassword = 10;

    public static void main(String[] args) {
        Scanner consoleText = new Scanner(System.in);
        System.out.println("Enter the password: ");
       String password = consoleText.nextLine();

   if(checkPassword(password)) {
        System.out.println("Your password is wrong");
    }
        else System.out.println("Your password is correct!!!");

}
    public static boolean checkPassword(String enteredText) {
        if (enteredText.length() < acceptablePassword)
            return false;

        int countDigits = 0;
        int countChararter = 0;

        for (int i = 0; i < enteredText.length(); i++) {

            char charcter = enteredText.charAt(i);

            if (digitCount(charcter))
                countDigits++;
            else if
            (letterCount(charcter))
                countChararter++;

            else return false;
        }
         return countDigits >= 2;
    }

        public static boolean letterCount ( char character){
            character = Character.toLowerCase(character);
            return (character >= 'a' && character <= 'z');
        }

        public static boolean digitCount ( char digit){
            return (digit >= '0' && digit <= '9');
        }

    }
