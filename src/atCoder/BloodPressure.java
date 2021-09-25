package atCoder;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class BloodPressure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int systolic_bp = scanner.nextInt();
        int diastolic_bp = scanner.nextInt();

        int mean_artirial_bp = (systolic_bp - diastolic_bp)/3 + diastolic_bp;

        System.out.println("mean arterial pressure - " + mean_artirial_bp);
    }
}
