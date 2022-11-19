import java.util.Scanner;

import static java.lang.Math.*;

public class exc5_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, y;
        System.out.print("Введите x: ");
        x = input.nextDouble();
        System.out.print("Введите y: ");
        y = input.nextDouble();
        int counter = 0;
        if (x >= -6 & x <= 6 & y >= 0 & y <= sqrt(36 - pow(x, 2))) {
            counter++;
            if (x >= -4 & x <= -1 & y >= 0 & y <= -1 * x - 1) {
                System.out.println("Точка НЕ попала в область");
                counter--;
            }
            if (x >= -1 & x <= 4 & y >= 0 & y <= 0.75 * x + 0.75 & y <= -3 * x + 12) {
                System.out.println("Точка НЕ попала в область");
                counter--;
            }
            if (x >= 1 & x <= 2 & y >= (-sqrt(-3 - pow(x, 2) + 4 * x)) + 4 & y <= (sqrt(-3 - pow(x, 2) + 4 * x)) + 4) {
                System.out.println("Точка НЕ попала в область");
                counter--;
            }
        } else {
            System.out.println("Точка НЕ попала в область");
        }
        if (x >= -3 & x <= 1 & y >= (-sqrt(3 - pow(x, 2) - 2 * x)) + 3 & y <= (sqrt(3 - pow(x, 2) - 2 * x)) + 3) {
            counter = 0;
            if (x >= -2 & x <= 0 & y >= (-sqrt(-pow(x, 2) - 2 * x)) + 2 & y <= (sqrt(-pow(x, 2) - 2 * x)) + 2) {
                counter++;

            } else {
                System.out.println("Точка НЕ попала в область");
            }

        }
        if (counter > 0) {
            System.out.println("Точка попала в область :)");
        }
    }
}
