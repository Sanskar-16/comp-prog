package atCoder;

import java.util.Scanner;

//https://atcoder.jp/contests/abc194/tasks/abc194_a
public class Iscream {
    static int milkFat;
    static int milkSolidNotFat;
    int milkSolids = 0;

    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        milkFat = input1.nextInt();
        milkSolidNotFat = input2.nextInt();
        Iscream check = new Iscream();
        check.percentFat();
    }

    public void percentFat() {
        milkSolids = milkSolidNotFat + milkFat;
        if (milkSolids >= 15 && milkFat >= 8) {
            System.out.println(1);
        } else if (milkSolids >= 10 && milkFat >= 3) {
            System.out.println(2);
        } else if (milkSolids >= 3) {
            System.out.println(3);
        }
        else
            System.out.println(4+" flavoured ice");
    }
}
