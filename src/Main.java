public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int[ ] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum = sum + element;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей %n", sum);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int[ ] arr = generateRandomArray();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int element : arr) {
            if (element > max) {
                max = element;
            }
        }
        System.out.printf("Максимальная сумма трат за день составила %d рублей %n", max);

        for (int element : arr) {
            if (element < min) {
                min = element;
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей %n", min);
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int[ ] arr = generateRandomArray();
        double averageValue;
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        averageValue = (double) sum / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %f рублей %n", averageValue);
    }

    public static void task4 () {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length; i > 0; i--) {
            int print = i - 1;
            System.out.print(reverseFullName[print]);
        }
        System.out.println("");
    }
}
