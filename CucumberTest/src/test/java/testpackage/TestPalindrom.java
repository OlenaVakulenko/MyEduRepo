package testpackage;

import games.Palindrom;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by olenka on 04.12.2016.
 */
public class TestPalindrom {

    @Test
    // проверка метода "переворота" строки
    public void checkReverseString() {
        String actReversedString = Palindrom.reverseString("abcdef");
        String expReversedString = "fedcba";
        Assert.assertEquals("Expected string was " + expReversedString + " but actual is " + actReversedString,expReversedString,actReversedString);
    }

    @Test
    // проверка метода определения палиндрома для слова (положительный кейс)
    public void checkPalindromWord() {
        boolean actPalindromWord = Palindrom.checkWord("pop");
        Assert.assertTrue("Word 'pop' is considered to be not palindrome", actPalindromWord);
    }

    @Test
    // // проверка метода определения палиндрома для слова, написанного с большой буквы
    public void checkPalindromeWordCapitalLetter() {
        boolean actPalindromeWordCapitalLetter = Palindrom.checkWord("Level");
        Assert.assertTrue("Word 'Level' is considered not to be palindrome", actPalindromeWordCapitalLetter);
    }

    @Test
    // проверка метода определения палиндрома для слова (отрицательный кейс)
    public void checkNotPalindromWord() {
        boolean actNotPalindromWord = Palindrom.checkWord("moon");
        Assert.assertFalse("Word 'moon' is considered to be palindrome", actNotPalindromWord);
    }

    @Test
    // проверка метода определения палиндрома для фразы (положительный кейс)
    public void checkPalindromPhrase() {
        boolean actPalindromPhrase = Palindrom.checkPhrase("A man a plan a canal Panama");
        Assert.assertTrue("Phrase 'A man a plan a canal Panama' is considered to be not palindrome",actPalindromPhrase);
    }

    @Test
    // проверка метода определения палиндрома для фразы (отрицательный кейс)
    public void checkNotPalindromPhrase() {
        boolean actNotPalindromPhrase = Palindrom.checkPhrase("Man a plan a canal Panama");
        Assert.assertFalse("Phrase 'Man a plan a canal Panama' is considered to be not palindrome",actNotPalindromPhrase);
    }
}
