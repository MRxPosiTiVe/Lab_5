import static java.lang.Math.*;

public class exc3_5 {
    public static void main(String[] args) {
        double x, f;
        for (x = -3; x <= 3; x += 0.5) {
            if (x >= 0) {
                f = -cos(2 * PI * x);
                System.out.println("f("+ x +") = " + f);
            } else {
                f = 3 * PI * x + sin(2 * PI * x);
                System.out.println("f("+ x +") = " + f);
            }
        }
    }
}
