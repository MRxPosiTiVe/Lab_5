import java.util.Locale;
import java.util.Scanner;

public class exc5_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите день недели: ");
            String input = scanner.nextLine().toLowerCase(Locale.ROOT);
            String timetable = String.format("Получение книг:\n\t-> %d%d:%d%d <-",
                    (int) (Math.random() + 1),
                    (int) (Math.random() * (10 - 1) + 1),
                    (int) (Math.random() * (6 - 1) + 1),
                    (int) (Math.random() * (10 - 1) + 1)
            );

            switch (input) {
                case "понедельник" -> System.out.printf("%s\n\tИСТ-22-1б\n\tИСТ-22-2б\n\n", timetable);
                case "вторник" -> System.out.printf("%s\n\tИСТ-22-3б\n\n", timetable);
                case "среда" -> System.out.printf("%s\n\tИСТ-22-1б\n\tИСТ-22-2б\n\n", timetable);
                case "четверг" -> System.out.printf("%s\n\tИСТ-22-3б\n\n", timetable);
                case "пятница" -> System.out.printf("%s\n\tИСТ-22-1б\n\tИСТ-22-2б\n\n", timetable);
                case "суббота" -> System.out.printf("%s\n\tИСТ-22-3б\n\n", timetable);
                case "воскресенье" -> System.out.println("Библиопека не работает");
                case "угабуга" -> System.out.print("");
                default -> System.out.println("Напиши день правильно инвалид!");

            }
            if (input.compareTo("УгаБуга".toLowerCase()) == 0)
                break;
        }
    }
}
