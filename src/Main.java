import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] inputArray1 = {1243, 534, 213, 5464, 324};
        float[] outputArray1 = new float[4];
        System.out.println("Сумма всех выплат за месяц");
        int sum = 0;
        for (int el : inputArray1) {
            sum += el;
        }
        outputArray1[0] = sum;
        System.out.println(Arrays.toString(inputArray1));
        System.out.println(Arrays.toString(outputArray1));

        System.out.println("Минимальная выплата за месяц");
        int minNum = 999999;
        for (int el1 : inputArray1)
            {
                if (el1 < minNum) {
                    minNum = el1;
                }
            }
            outputArray1[1] = minNum;
            System.out.println(Arrays.toString(inputArray1));
            System.out.println(Arrays.toString(outputArray1));

            System.out.println("Максимальная выплата за месяц");
            int maxNum = 0;
            for (int el2 : inputArray1) {
                if (el2 > maxNum) {
                    maxNum = el2;
                }
            }
            outputArray1[2] = maxNum;
            System.out.println(Arrays.toString(inputArray1));
            System.out.println(Arrays.toString(outputArray1));

            System.out.println("Средняя выплата за месяц");
            float sredNum = (float) sum / inputArray1.length;
            outputArray1[3] = sredNum;
            System.out.println(Arrays.toString(inputArray1));
            System.out.println(Arrays.toString(outputArray1));

            System.out.println("Задание 2");
            int[] inputArray2 = {3456, 234, 567, 9458, 3654};
            float[] outputArray2 = new float[5];
            for (int i = 0; i < inputArray2.length; i++) {
                float el = inputArray2[i];
                outputArray2[i] = (el / 100) * 13;
            }
            ;
            System.out.println(Arrays.toString(inputArray2));
            System.out.println(Arrays.toString(outputArray2));

            System.out.println("Задание 3");
            int[] inputArray3 = {5493, 4909, 5000, 423, 456};
            boolean[] outputArray3 = new boolean[5];
            for (int i = 0; i < inputArray3.length; i++) {
                if (inputArray3[i] < 5000) {
                    outputArray3[i] = false;
                } else {
                    outputArray3[i] = true;
                }
            }
            System.out.println(Arrays.toString(inputArray3));
            System.out.println(Arrays.toString(outputArray3));

            System.out.println("Задание 4");
            int[] inputArray4 = {53364, 97894, 50600, -2323, 46556};
            boolean[] outputArray4 = new boolean[5];
            for (int i = 0; i < inputArray4.length; i++) {
                if (inputArray4[i] < 0) {
                    outputArray4[i] = false;
                    break;
                } else {
                    outputArray4[i] = true;
                }
            }
            System.out.println(Arrays.toString(inputArray4));
            System.out.println(Arrays.toString(outputArray4));

            System.out.println("Задание 5");
            int[] inputArray5 = {3253, 433634, -43, 78756, 0};
            boolean[] outputArray5 = new boolean[5];
            for (int i = 0; i < inputArray5.length; i++) {
                if (inputArray5[i] <= 0) {
                    outputArray5[i] = false;
                } else {
                    outputArray5[i] = true;
                }
            }
            System.out.println(Arrays.toString(inputArray5));
            System.out.println(Arrays.toString(outputArray5));


        }
    }
