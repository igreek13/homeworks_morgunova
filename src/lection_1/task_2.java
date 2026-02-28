void main() {
    int count = 0;
    System.out.println("Числа, соблюдающие два условия: ");

    for (int number = 100; number <= 999; number++) {
        if (number % 10 != 0) {
            continue;
        }

        int sumOfOddDivisors = calculateSumOfOddDivisors(number);

        if (sumOfOddDivisors % 10 == 0) {
            count++;
            System.out.println(number);
        }
    }
}

    private static int calculateSumOfOddDivisors(int number) {
        int sum = 0;

        for (int divisor = 1; divisor <= number; divisor++) {
            if (number % divisor == 0) {
                if (divisor % 2 != 0) {
                    sum += divisor;
                }
            }
        }
        return sum;
    }