import java.util.Scanner;
import static java.lang.Math.*;

public class exc4_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, y;
        System.out.print("Введите x: ");
        x = input.nextDouble();
        if (x < 0) {
            y = sqrt(2) - x;
            System.out.println("y = " + y);
        } else if (x > 0 & x < 2){
            y = exp(2 * pow(x, x)) + 5 * log10(2 * x + 2);
            System.out.println("y = " + y);
        } else if (x > 2){
            y = (cos(x) - sin(x)) / (pow(x, 2) + 5 * x + 6);
            System.out.println("y = " + y);
        } else if (x == 0 || x == 2) {
            y = 10000;
            System.out.println("y = " + y);
        }
    }
}
