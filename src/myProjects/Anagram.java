package myProjects;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public void isAnagram(String string1, String string2) {
        String s1 = string1.replace("\\s", "");
        String s2 = string2.replace("\\s", "");

        boolean status = true;

        if (string1.length() != string2.length()) {
            status = false;
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }

        if (status) {
            System.out.println("They are anagrams");
        } else {
            System.out.println("They are not anagrams");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter two words to be checked: ");
        Scanner inp = new Scanner(System.in);
        String word1 = inp.nextLine();
        String word2 = inp.nextLine();

        Anagram check = new Anagram();
        check.isAnagram(word1, word2);
    }
}