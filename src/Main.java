import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random rand = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Task One: total sum");
        int[] arr1 = generateRandomArray();
        int total = 0;
        for (int el : arr1) {
            total += el;
        }
        System.out.println(Arrays.toString(arr1));  // to see random values
        System.out.println("Сумма трат за месяц составила " + total + " рублей");
        System.out.println();
    }

    public static void task2() {
        System.out.println("Task Two: max and min sum");
        int[] arr2 = generateRandomArray();
        int maxSum = 99_000;
        int minSum = 201_000;
        for (int val : arr2) {
            if (val > maxSum) {
                maxSum = val;
            }
        }
        for (int val : arr2) {
            if (val < minSum) {
                minSum = val;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей. " +
                "Максимальная сумма трат за день составила " + maxSum + " рублей");
        System.out.println();

    }

    public static void task3() {
        System.out.println("Task Three: average");
        int[] arr3 = generateRandomArray();
        double total = 0;
        for (int val : arr3) {
            total += val;
        }
        double averageSum = total / (arr3.length);
        System.out.println(averageSum);
        System.out.printf("Rouded:" +"%.2f", averageSum); // rounded to two place decimals
        System.out.println();
    }

    public static void task4() {
        System.out.println();
        System.out.println("Task Four: reverse order");
        //int [] arr4 = generateRandomArray();
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1; i>=0; i--) {
            System.out.print(reverseFullName[i] + "");
        }
    }

}