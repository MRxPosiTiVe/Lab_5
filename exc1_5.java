import java.util.Scanner;

public class exc1_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int flat, n, floor, newflat1, floor1, cflat;
        System.out.print("Сколько этажей? ");
        n = input.nextInt();
        System.out.print("Какая у вас квартира? ");
        flat = input.nextInt();
        if (n % 2 == 0) {
            cflat = (n / 2) * 9;
        } else {
            cflat = ((n - 1) / 2) * 9 + 4;
        }
        if (flat > cflat){
            System.out.println("Вы дЭбил!");
        } else {
            if (flat % 9 == 0 || flat % 9 == 5 || flat % 9 == 6 || flat % 9 == 7 || flat % 9 == 8) {
                floor = (flat / 10) * 2 + 2;
                System.out.println("Вы уедете на " + floor + " этаж");
            } else {
                newflat1 = flat - 9;
                floor = (newflat1 / 10) * 2 + 2;
                floor1 = floor + 2;
                System.out.println("Вы уедете на " + floor + " этаж или на " + floor1 + " этаж");
            }
        }
    }
}
