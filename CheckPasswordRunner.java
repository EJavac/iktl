package iktlabcourse;

import java.util.Scanner;

public class CheckPasswordRunner {
    public static void main(String[] args) {
        String password = "";
        CheckPassword obj = new CheckPassword();
        Scanner consoleText = new Scanner(System.in);
        System.out.println("Enter the password: ");
        password = consoleText.nextLine();
        obj.checkPassword(password);
    }
}
