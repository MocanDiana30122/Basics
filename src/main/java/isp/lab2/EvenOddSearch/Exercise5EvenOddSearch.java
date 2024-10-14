package isp.lab2.Exercise5EvenOddSearch;


import java.util.Arrays;

public class Exercise5EvenOddSearch {

    public static int[] findEvenOdd(String input) {

        String[] numbersString = input.split(",");
        int[] numbers = new int[numbersString.length];
        for (int i = 0; i < numbersString.length; i++) {
            numbers[i] = Integer.parseInt(numbersString[i].trim());
        }


        int largestEven = Integer.MIN_VALUE;
        int smallestOdd = Integer.MAX_VALUE;
        int largestEvenPos = -1;
        int smallestOddPos = -1;


        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (num % 2 == 0 && num > largestEven) {
                largestEven = num;
                largestEvenPos = i;
            } else if (num % 2 != 0 && num < smallestOdd) {
                smallestOdd = num;
                smallestOddPos = i;
            }
        }


        int[] result = new int[4];
        result[0] = largestEven;
        result[1] = largestEvenPos;
        result[2] = smallestOdd;
        result[3] = smallestOddPos;
        return result;
    }

    public static void main(String[] args) {
        String input = "1,2,3,4,5,6,7,8,9,10";
        int[] result = findEvenOdd(input);
        if (result[0] == Integer.MIN_VALUE && result[2] == Integer.MAX_VALUE) {
            System.out.println("No even or odd numbers found in the list.");
        } else {
            System.out.println("Largest even number: " + result[0] + " at position " + result[1]);
            System.out.println("Smallest odd number: " + result[2] + " at position " + result[3]);
        }
    }
}
