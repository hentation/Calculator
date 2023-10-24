import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int result = 0;
        char continueCalculation = 'c';
        int firstNumber;
        int secondNumber;
        char operation;

        do {
            if (continueCalculation == 'c') {
                System.out.println("Введите первое число: ");
                firstNumber = scanner.nextInt();
                System.out.println("Введите оператор: ");
                operation = scanner.next().charAt(0);
            } else {
                firstNumber = result;
                operation = continueCalculation;
            }

            System.out.println("Введите второе число: ");
            secondNumber = scanner.nextInt();

            result = calculate(firstNumber, secondNumber, operation);
            System.out.println("Ваш результат: " + result);
            continueCalculation = scanner.next().charAt(0);
        }
        while (continueCalculation != 's');
    }

    public static int calculate(int firstNumber, int secondNumber, char operation) {
        return switch (operation) {
            case '+' -> firstNumber + secondNumber;
            case '-' -> firstNumber - secondNumber;
            case '*' -> firstNumber * secondNumber;
            case '/' -> firstNumber / secondNumber;
            default -> {
                System.out.println("Неверный оператор");
                yield 0;
            }
        };
    }
}

