import java.util.Scanner;

public class exc5_7_g {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x;
        System.out.print("Введите x[-4; 4]: ");
        x = input.nextDouble();
        double g;
        if (x <= -4 || x >= 4) {
            System.out.println("Вы ввели неверные значения, x[-4; 4]");

        } else if (x >= -4 & x <= 4) {
            if (x <= 0) {
                g = (3 + Math.pow(Math.cos(2 * x), 2)) / (1 + Math.pow(Math.cos(x), 2));
                System.out.println("g = " + g);
            } else {
                g = (2 * Math.sqrt(1 + 2 * x));
                System.out.println("g = " + g);
            }
        }
    }
}
