package AnagrammaTask;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;

import static java.lang.System.out;

public class AnagrammaTask{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        out.println("Введите, пожалуйста, первую строку");
        String s1 = sc.nextLine().toLowerCase();

        Scanner sc2 = new Scanner(System.in);
        out.println("Введите, пожалуйста, вторую строку");
        String s2 = sc2.nextLine().toLowerCase();

        String str1 = s1.replaceAll("\\s", "");
        String str2 = s2.replaceAll("\\s", "");

        char[] string1ToCharArray = str1.toCharArray();
        char[] string2ToCharArray = str2.toCharArray();

        Arrays.sort(string1ToCharArray);
        Arrays.sort(string2ToCharArray);

        if (Arrays.equals(string1ToCharArray, string2ToCharArray)) {
            out.println("Я красавчик!");
        } else if (string1ToCharArray != string2ToCharArray) {
            out.println("К сожалению, слова не являются анаграммой");
        }
    }
}