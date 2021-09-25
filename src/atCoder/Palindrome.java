package atCoder;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        String originalString, reverseString = "";
        Scanner sc = new Scanner(System.in);
        originalString = sc.next();

        int length = originalString.length();

        for(int i=length-1; i>=0; i--)
            reverseString = reverseString + originalString.charAt(i);

        System.out.println(reverseString);
        if(originalString.equals(reverseString))
            System.out.println("Palindrome");
        else
            System.out.println("no Palindrome");
    }
}
