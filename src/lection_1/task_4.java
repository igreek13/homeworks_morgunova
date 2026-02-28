import java.util.Arrays;
import java.util.Random;

void main() {
        Random random = new Random();

        int size1 = 10;
        int size2 = 8;

        int[] array1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            array1[i] = random.nextInt(21);
        }
        int[] array2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            array2[i] = random.nextInt(21);
        }

        System.out.println("Первый массив: " + Arrays.toString(array1));
        System.out.println("Второй массив: " + Arrays.toString(array2));

        int[] result = findEl(array1, array2);

        System.out.println("Результат: " +
                Arrays.toString(result));
    }

int[] findEl(int[] first, int[] second) {
    int[] tempResult = new int[first.length];
    int count = 0;

    for (int i = 0; i < first.length; i++) {
        boolean found = false;

        for (int j = 0; j < second.length; j++) {
            if (first[i] == second[j]) {
                found = true;
                break;
            }
        }
        if (!found) {
            tempResult[count] = first[i];
            count++;
        }
    }
    int[] result = new int[count];
    for (int i = 0; i < count; i++) {
        result[i] = tempResult[i];
    }
    return result;
}