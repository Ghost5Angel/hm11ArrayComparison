import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] inputArray1 = {1243, 534, 213, 5464, 324};
        float[] outputArray1 = new float[4];
        int sum = 0;
        for (int el : inputArray1) {
            sum += el;
        }
        outputArray1[0] = sum;

        int minNum = 999999;
        for (int el1 : inputArray1)
            {
                if (el1 < minNum) {
                    minNum = el1;
                }
            }
            outputArray1[1] = minNum;

            int maxNum = 0;
            for (int el2 : inputArray1) {
                if (el2 > maxNum) {
                    maxNum = el2;
                }
            }
            outputArray1[2] = maxNum;

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
            boolean[] outputArray4 = new boolean[1];
            for (int i = 0; i < inputArray4.length; i++) {
                if (inputArray4[i] < 0) {
                    outputArray4[0] = false;
                    break;
                } else {
                    outputArray4[0] = true;
                }
            }
            System.out.println(Arrays.toString(inputArray4));
            System.out.println(Arrays.toString(outputArray4));

            System.out.println("Задание 5");
            int[] inputArray5 = {3253, 433634, -43, 78756, 0};
            int[] outputArray5 = new int[1];
            int count = 0;
            for (int i = 0; i < inputArray5.length; i++) {
                if (inputArray5[i] > 0) {
                    count++;
                }
            }
            outputArray5[0] = count;
            System.out.println(Arrays.toString(inputArray5));
            System.out.println(Arrays.toString(outputArray5));


        }
    }
