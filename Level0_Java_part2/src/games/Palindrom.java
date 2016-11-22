package games;

import java.util.Scanner;

/**
 * Created by olenka on 20.11.2016.
 */
public class Palindrom {

    public static void main(String[] args) {
        System.out.println("Пожалуйста, введите слово");
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        if (checkWord(word)) {
            System.out.println("Слово является палиндромом");
        } else {
            System.out.println("Слово не является палиндромом");
        }
        System.out.println("Пожалуйста, введите фразу");
        Scanner some = new Scanner(System.in);
        String phrase = in.nextLine();
        if (checkPhrase(phrase)) {
            System.out.println("Фраза является палиндромом");
        } else {
            System.out.println("Фраза не является палиндромом");
        }

    }

    public static boolean checkWord (String someWord) {
        String word = someWord.toLowerCase();
        word = word.replace(" ", "");
        return word.equals(reverseString(word));
    }

    public static boolean checkPhrase (String somePhrase) {
        String phrase = somePhrase.toLowerCase();
        phrase = phrase.replace(" ", "");
        return phrase.equals(reverseString(phrase));
    }

    public static String reverseString(String s) {
        String r = "";
        // берем символы исходной строки с конца строки до начала
        // и добавляем ее в начала строки-результата (переменная r)
        for (int i = s.length() - 1; i >= 0; --i) r += s.charAt(i);
        return r;
    }
}