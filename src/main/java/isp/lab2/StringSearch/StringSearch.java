package isp.lab2.Exercise4StringSearch;

import java.util.ArrayList;
import java.util.Scanner;

public class StringSearch {

    /**
     * This method should return an array of strings that contain the substring.
     *
     * @param input     the input string containing all the strings separated by commas
     * @param substring the substring to search for
     * @return an array of strings that contain the substring
     */
    public static String[] searchSubstrings(String input, String substring) {
        String[] strings = input.split(",");
        ArrayList<String> matches = new ArrayList<>();
        for (String s : strings) {
            if (s.contains(substring)) {
                matches.add(s);
            }
        }
        String[] result = new String[matches.size()];
        return matches.toArray(result);
    }

    public static String readFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line: ");
        return scanner.nextLine();
    }

    public static void main(String[] args) {

        String input = readFromConsole();
        String substring = readFromConsole();

        String[] result = searchSubstrings(input, substring);


        System.out.println("Strings that contain \"" + substring + "\":");
        if (result.length == 0) {
            System.out.println("None");
        } else {
            for (String s : result) {
                System.out.println(s);
            }
        }
    }
}
