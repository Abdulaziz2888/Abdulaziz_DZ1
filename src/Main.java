import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String multiWordVariable; // 1
        final int NUM = 10; // 2
        String word = "Hello"; // 3
        multiWordVariable = NUM + word; // 4
        System.out.println("multiWordVariable: " + multiWordVariable);
        System.out.println("NUM: " + NUM);
        System.out.println("word: " + word);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }

        System.out.println("Введите ваше имя: "); // 7
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine(); // 8
        System.out.println("Привет, " + userName + "!"); // 9
    }
}
