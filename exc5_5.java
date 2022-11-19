import java.util.Scanner;

import static java.lang.Math.*;

public class exc5_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите переменную x: ");
        double x = input.nextDouble();
        System.out.print("Введите переменную y: ");
        double y = input.nextDouble();
        int count1 = 0, count2 = 0;
        if (x >= -3 & x <= 1 & y >= 3 & y <= sqrt(3 - pow(x, 2) - 2 * x) + 3) {
            count1++;
        }
        if (x >= -3 & x <= 1 & y <= 3 & y >= (-4.0 / 3.0) * x - 1 & y >= 2 * x - 1) {
            count1++;
        }
        if (count1 > 0) {
            System.out.println("Точка попала в 1 область");
        }
        if (x >= 3 & x <= 7 & y <= 0 & y >= -sqrt(-21 - pow(x, 2) + 10 * x)) {
            count2++;
        }
        if (x >= 3 & x <= 7 & y >= 0 & y <= x - 3 & y <= -1 * x + 7) {
            count2++;
        }
        if (count2 > 0) {
            System.out.println("Точка попала во 2 область");
        }
        if (count1 == 0 & count2 == 0) {
            System.out.println("Точка не попала в область");
        }
    }
}
