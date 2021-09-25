package atCoder;

import java.util.Scanner;

//https://atcoder.jp/contests/abc197/tasks/abc197_a
public class Rotate {
    public static void main(String[] args) {
        String input;

        Scanner inp = new Scanner(System.in);
        input = inp.nextLine();
        System.out.println(input.substring(1).concat(input.substring(0,1)));
    }
}
