package codeForces;

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {

        int w;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");

        w = input.nextInt();

        if(w >= 1 && w <= 100) {
            if (w % 2 == 0)
                System.out.println("YES");
             else
                System.out.println("NO");
        }
    }
}
