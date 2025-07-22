import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Mad Libs!\n" +
                "Enter in the following, separated by a comma and a space: \n" +
                "Verb, Verb (with -ed), teacher name, adjective, song title, student name, adjective\n");

        String input = sc.nextLine();
        String[] words = input.split(",\\s*");


        MadLibs story = new MadLibs(words[0], words[1], words[2], words[3], words[4], words[5], words[6]);
    }
}