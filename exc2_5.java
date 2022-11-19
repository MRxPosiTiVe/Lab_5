import java.util.Scanner;

public class exc2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A, B, C, AB, AC;
        System.out.print("А = ");
        A = input.nextDouble();
        System.out.print("B = ");
        B = input.nextDouble();
        System.out.print("C = ");
        C = input.nextDouble();
        AB = Math.abs(B - A);
        AC = Math.abs(C - A);
        if (AB > AC){
            System.out.println("C ближе к A " + AC);
        } else {
            System.out.println("B ближе к А " + AB);
        }
    }
}
