package atCoder;

import java.util.Scanner;

public class WelcomeToAtCoder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        String s = input.next();

        System.out.println((a + b + c) + " " + s);
    }
}
