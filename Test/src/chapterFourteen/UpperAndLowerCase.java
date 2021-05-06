package chapterFourteen;

public class UpperAndLowerCase {
    public static String changeCase(String word) {
        String result = word.toLowerCase();
        String result2 = word.toUpperCase();
        return "Lower case format of the word is " + result + "\n" + "Upper case format of the word is " + result2;
    }
}
