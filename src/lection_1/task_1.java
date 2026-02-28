import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите трехзначное число: ");
    int number = scanner.nextInt();

    if (number < 100 || number > 999) {
            System.out.println("Неверный ввод! Число должно быть трехзначным (от 100 до 999)");
            return;
        }

        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int units = number % 10;

        int result;

        if (number > 500) {
            result = units * 100 + tens * 10 + hundreds;
        } else {
            result = hundreds * 100 + units * 10 + tens;
        }

        System.out.println("Преобразованное число: " + result);

        scanner.close();
    }