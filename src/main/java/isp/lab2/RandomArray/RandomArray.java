package isp.lab2.Exercise1RandomArray;

import java.util.Random;

public class RandomArray {

    public static int[] getArrayOfRandomNumbers(int n) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(91) + 10;
        }
        return array;
    }

    public static int[] findMaxAndMin(int[] array) {
        int minim = array[0];
        int maxim = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minim > array[i])
                minim = array[i];
            if (maxim < array[i])
                maxim = array[i];
        }
        int mm[] = new int[2];
        mm[0] = minim;
        mm[1] = maxim;
        return mm;

    }

    public static void main(String[] args) {

        Random random = new Random();

        // genereaza numar random intre 10 si 100
        int size = random.nextInt(91) + 10;
        int[] a = getArrayOfRandomNumbers(size);
        int[] mm = findMaxAndMin(a);
        System.out.println("Min is:" + mm[0] + " Max is:" + mm[1]);
    }
}
