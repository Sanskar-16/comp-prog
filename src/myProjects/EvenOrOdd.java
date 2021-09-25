package myProjects;

import java.util.Scanner;

// TODO: add function which checks for prime numbers too
public class EvenOrOdd {
    public static void main(String[] args) {
        int n;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the limit up till where you want to check whether the numbers are even or odd AND PRIME!!");
        n = input.nextInt();

        for (int i=1; i<=n; i++){
            if (i%2==0)
                System.out.println(i + " EVEN");
            else if (i%2==1)
                System.out.println(i + " ODD");
            else
                System.out.println("lol");
        }
    }
}
