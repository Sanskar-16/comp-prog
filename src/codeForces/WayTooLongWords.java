package codeForces;

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {

        String word;
        int counter = 0;
        String firstLetter = null;
        String lastLetter = null;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word");
        word = input.next();

        if (word.length() > 10) {
            for (int i = 0; i < word.length(); i++) {
                firstLetter = String.valueOf(word.charAt(0));
                counter++;
                lastLetter = String.valueOf(word.charAt(word.length() - 1));
            }
            counter = counter - 2;
            System.out.println("The abb is: " + firstLetter + counter + lastLetter);
        }
        else
            System.out.println(word);
    }
}

