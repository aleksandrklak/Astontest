import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод первого числа
        System.out.println("Введите первое число (a):");
        int a = scanner.nextInt();

        // Ввод второго числа
        System.out.println("Введите второе число (b):");
        int b = scanner.nextInt();

        // Сравнение чисел и вывод результата
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Операции сложения, вычитания, умножения и деления
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient = b != 0 ? (double) a / b : Double.NaN; // Проверка на деление на ноль

        // Вывод результатов арифметических операций
        System.out.println("Сумма a + b: " + sum);
        System.out.println("Разность a - b: " + difference);
        System.out.println("Произведение a * b: " + product);
        if (b != 0) {
            System.out.println("Частное a / b: " + quotient);
        } else {
            System.out.println("Деление на ноль невозможно");
        }

        scanner.close();
    }
}

