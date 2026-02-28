import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    final int MAX_PEOPLE = 6;
    final int MAX_WEIGHT = 450;

    int peopleCount = 0;
    int totalWeight = 0;
    String stopReason = "";

    while (true) {
        System.out.print("Введите вес человека №" + (peopleCount + 1)+ ": ");

        int personWeight = scanner.nextInt();

        if (peopleCount + 1 > MAX_PEOPLE) {
            stopReason = "Превышено максимальное количество людей";
            break;
        }

        if (totalWeight + personWeight > MAX_WEIGHT) {
            stopReason = "Превышена максимальная нагрузка";
            break;
        }

        peopleCount++;
        totalWeight += personWeight;

        System.out.println("В лифте: " + peopleCount + " человек, общий вес: " + totalWeight + " кг");

        if (peopleCount == MAX_PEOPLE) {
            stopReason = "Достигнуто максимальное количество людей";
            break;
        }
        if (totalWeight == MAX_WEIGHT) {
            stopReason = "Достигнута максимальная нагрузка (" + MAX_WEIGHT + " кг)";
            break;
        }
    }

    scanner.close();

    System.out.println("Количество людей в лифте: " + peopleCount);
    System.out.println("Общий вес: " + totalWeight + " кг");

    if (!stopReason.isEmpty()) {
        System.out.println("Причина прекращения входа: " + stopReason);
    } else if (peopleCount == MAX_PEOPLE) {
        System.out.println("Причина прекращения входа: Достигнуто максимальное количество людей");
    } else if (totalWeight == MAX_WEIGHT) {
        System.out.println("Причина прекращения входа: Достигнута максимальная нагрузка");
    } else {
        System.out.println("Причина прекращения входа: Ввод завершен пользователем");
    }

    System.out.println("Зашло человек: " + peopleCount + " из " + MAX_PEOPLE + " возможных");
    System.out.println("Общий вес: " + totalWeight + "кг из " + MAX_WEIGHT + "кг" + " возможных");
}