import java.util.Locale;
import java.util.Scanner;

public class exc5_7_z {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // For writing "1.2" instead of "1,2" etc.

        System.out.print("Введите x, x[-4;4]: ");
        double x = scanner.nextDouble();
        double z;

        if (x < -4 || x > 4) {
            System.out.println("Не верные значения x, т.к. x[-4;4]");
        } else {
            if (x < 0) {
                z = Math.sqrt(1 + (Math.pow(x, 2) / (1 + Math.pow(x, 2))));
            } else if (x > 1) {
                z = Math.sqrt(1 + Math.pow(Math.abs(2 * Math.sin(3 * x)), 1 / 3.0));
            } else {
                z = 2 * Math.pow(Math.cos(x), 2);
            }
            System.out.printf("Z = %.2f", z);
        }
    }
}
