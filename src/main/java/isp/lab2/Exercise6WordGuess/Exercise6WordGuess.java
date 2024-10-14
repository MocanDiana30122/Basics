package isp.lab2.Exercise6WordGuess;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise6WordGuess {

    public static int countOccurence(char c, char[] word) {
        int count = 0;
        for (int i = 0; i < word.length; i++) {
            if (word[i] == c) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = { "apple", "banana", "orange", "kiwi", "grape", "pear", "peach" };

        Random random = new Random();
        String word = words[random.nextInt(words.length)];

        char[] wordArray = word.toCharArray();

        char[] guessedLetters = new char[wordArray.length];
        Arrays.fill(guessedLetters, '_');

        int numTries = 0;
        boolean isWordGuessed = false;

        while (!isWordGuessed) {
            System.out.println("Guess a letter: ");
            char guess = scanner.nextLine().charAt(0);
            numTries++;

            boolean isGuessCorrect = false;
            for (int i = 0; i < wordArray.length; i++) {
                if (wordArray[i] == guess) {
                    guessedLetters[i] = guess;
                    isGuessCorrect = true;
                }
            }

            System.out.println(guessedLetters);

            if (Arrays.equals(wordArray, guessedLetters)) {
                isWordGuessed = true;
            }

            if (!isGuessCorrect) {
                int count = countOccurence(guess, wordArray);
                System.out.println("The letter " + guess + " is not in the word. It occurs " + count + " times.");
            }
        }

        System.out.println("Congratulations, you guessed the word in " + numTries + " tries.");
        System.out.println("The word was: " + word);
    }
}
