import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод первой строки
        System.out.println("Введите первую строку:");
        String a = scanner.nextLine();

        // Ввод второй строки
        System.out.println("Введите вторую строку:");
        String b = scanner.nextLine();

        // Сравнение строк и вывод результата
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        scanner.close();
    }
}
