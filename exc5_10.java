import java.util.Scanner;

public class exc5_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Опрос на знание Звездных Войн");
        int answer;
        int ans, counter = 0;
        System.out.println("Хотите пройти опрос? ");
        System.out.println("1) Да\n2) Нет");
        answer = input.nextInt();

        if (answer == 1 || answer == 2) {
            System.out.println("Вопрос 1: С какой фразы начинается космическая киносага Джорджа Лукаса?");
            System.out.println("""
                    1) Совсем недавно на соседней планете...
                    2) Давным-давно в далекой-далекой вселенной...
                    3) Давным-давно в далекой-далекой галактике...
                    4) Давным-давно на далекой-далекой планете...""");
            ans = input.nextInt();
            switch (ans) {
                case 1 -> System.out.println("Ответ не верный!");
                case 2 -> System.out.println("Ответ не верный!");
                case 3 -> {
                    counter++;
                    System.out.println(" --> Ответ верный! <--\n");
                }
                case 4 -> System.out.println("Ответ не верный!");
                default -> System.out.println("Вы ввели не верный формат данных!");
            }
            System.out.println("Вопрос 2: Выберите правильное написание фразы, " +
                    "которую используют в мире «Звездных войн» для пожелания удачи:");
            System.out.println("""
                    1) «Да пребудет с тобой Сила»
                    2) «Да прибудет с тобой Сила и гуманитарная помощь»
                    3) «Да пребудет со мной Сила»
                    4) «Да прибудет с тобой Сила»""");
            ans = input.nextInt();
            switch (ans) {
                case 1 -> {
                    counter++;
                    System.out.println(" --> Ответ верный! <--\n");
                }
                case 2 -> System.out.println("Ответ не верный!");
                case 3 -> System.out.println("Ответ не верный!");
                case 4 -> System.out.println("Ответ не верный!");
                default -> System.out.println("Вы ввели не верный формат данных!");
            }
            System.out.println("Вопрос 3: Какой злодей из «Звездых войн» вынужден постоянно носить " +
                    "костюм с портативной системой жизнеобеспечения?");
            System.out.println("""
                    1) Дарт Вейпер
                    2) Дарт Вейдер
                    3) Энакин Скайуокер
                    4) Дарт Мол""");
            ans = input.nextInt();
            switch (ans) {
                case 1 -> System.out.println("Ответ не верный!");
                case 2 -> {
                    counter++;
                    System.out.println(" --> Ответ верный! <--\n");
                }
                case 3 -> System.out.println("Ответ не верный!");
                case 4 -> System.out.println("Ответ не верный!");
                default -> System.out.println("Вы ввели не верный формат данных!");
            }
            System.out.println("Вопрос 4: Как называется самое мощное оружие Империи?");
            System.out.println("""
                    1) «Звезда присмерти»
                    2) «Звезда апокалипсиса»
                    3) «Звезда посмертия»
                    4) «Звезда смерти»""");
            ans = input.nextInt();
            switch (ans) {
                case 1 -> System.out.println("Ответ не верный!");
                case 2 -> System.out.println("Ответ не верный!");
                case 3 -> System.out.println("Ответ не верный!");
                case 4 -> {
                    counter++;
                    System.out.println(" --> Ответ верный! <--\n");
                }
                default -> System.out.println("Вы ввели не верный формат данных!");
            }
            System.out.println("Вопрос 5: Самый ущербный герой в вселенной ЗВ это - ");
            System.out.println("""
                    1) Хан Соло
                    2) Эвок Великий
                    3) Рей-цыганка
                    4) Швабра""");
            ans = input.nextInt();
            switch (ans) {
                case 1 -> System.out.println("Ответ не верный!");
                case 2 -> System.out.println("Ответ не верный!");
                case 3 -> {
                    counter++;
                    System.out.println(" --> Ответ верный! <--\n");
                }
                case 4 -> System.out.println("Ответ не верный!");
                default -> System.out.println("Вы ввели не верный формат данных!");
            }
            System.out.println("Вопрос 6: В каком эпизоде был выполнен приказ 66?");
            System.out.println("""
                    1) Эпизод IV: Новая надежда
                    2) Эпизод V: Империя наносит ответный удар
                    3) Звёздные войны. Эпизод II: Атака клонов
                    4) Эпизод III: Месть ситхов""");
            ans = input.nextInt();
            switch (ans) {
                case 1 -> System.out.println("Ответ не верный!");
                case 2 -> System.out.println("Ответ не верный!");
                case 3 -> System.out.println("Ответ не верный!");
                case 4 -> {
                    counter++;
                    System.out.println(" --> Ответ верный! <--\n");
                }
                default -> System.out.println("Вы ввели не верный формат данных!");
            }
            System.out.println("Вопрос 7: Где начались Войны клонов?");
            System.out.println("""
                    1) Татуин
                    2) Геоноз
                    3) Набу
                    4) Корусант""");
            ans = input.nextInt();
            switch (ans) {
                case 1 -> System.out.println("Ответ не верный!");
                case 2 -> {
                    counter++;
                    System.out.println(" --> Ответ верный! <--\n");
                }
                case 3 -> System.out.println("Ответ не верный!");
                case 4 -> System.out.println("Ответ не верный!");
                default -> System.out.println("Вы ввели не верный формат данных!");
            }
            System.out.println("Вопрос 8: Сколько всего эпизодов в ЗВ?");
            System.out.println("1) 4\n2) 9\n3) 6\n4) 12");
            ans = input.nextInt();
            switch (ans) {
                case 1 -> System.out.println("Ответ не верный!");
                case 2 -> {
                    counter++;
                    System.out.println(" --> Ответ верный! <--\n");
                }
                case 3 -> {
                    counter++;
                    System.out.println("Ответ верный частично (для некоторых)!");
                }
                case 4 -> System.out.println("Ответ не верный!");
                default -> System.out.println("Вы ввели не верный формат данных!");
            }
            System.out.println("Вопрос 9: По словам Императора, в чем заключалась слабость Люка Скайуокера?");
            System.out.println("""
                    1) Его вера в светлую сторону силы
                    2) Его вера в своих друзей
                    3) Его отсутствие видения
                    4) Его сопротивление Темной стороне Силы""");
            ans = input.nextInt();
            switch (ans) {
                case 1 -> System.out.println("Ответ не верный!");
                case 2 -> {
                    counter++;
                    System.out.println(" --> Ответ верный! <--\n");
                }
                case 3 -> System.out.println("Ответ не верный!");
                case 4 -> System.out.println("Ответ не верный!");
                default -> System.out.println("Вы ввели не верный формат данных!");
            }
            System.out.println("ФИНАЛЬНЫЙ ВОПРОС 10: Самый не приятный босс в Star Wars Fallen Order?");
            System.out.println("""
                    1) Швабра
                    2) Дарт Вейдер
                    3) Дедок с Датомира
                    4) 9 сестра (Свинья)""");
            ans = input.nextInt();
            switch (ans) {
                case 1 -> System.out.println("Ответ не верный!");
                case 2 -> System.out.println("Ответ не верный!");
                case 3 -> {
                    counter++;
                    System.out.println(" --> Ответ верный! <--\n");
                }
                case 4 -> System.out.println("Ответ не верный!");
                default -> System.out.println("Вы ввели не верный формат данных!");
            }
            System.out.println("А теперь тест на ПЛОХОГО ЧЕЛОВЕКА, выбери: ");
            System.out.println("1) Империя\n2) Повстанцы");
            ans = input.nextInt();

            switch (ans) {
                case 1 -> counter += (Math.random() * (6 - 4) + 4);
                case 2 -> {
                    counter = 0;
                    System.out.println("Ну ты и не очень конечно...!");
                }
            }

            System.out.printf("Правильных ответов: %d из 10 \n", counter);
            if (counter < 5) {
                System.out.println("Оценка: Помянем!");
            } else if (counter <= 7) {
                System.out.println("Оценка: Харош, че-то могешь");
            } else if (counter >= 10) {
                System.out.println("Оценка: Грандмастер ордена джедаев или император вишейт (не позер)");
            } else {
                System.out.println("Оценка: Ультрамегасупер-Харооооош, не позер");
            }

        } else {
            System.out.println("Если вы хотите пройти, перезапустите опрос!");
        }
    }
}
