package games;

import java.util.Scanner;

/**
 * Created by olenka on 20.11.2016.
 */
public class Palindrom {

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