package chapterFourteen;

public class PigLatin {
    public static String pigLatin(String word) {
        String firstLetter = word.substring(0,1);
        String newWord = word.substring(1);
        StringBuilder result = new StringBuilder();

        return result.append(newWord).append(firstLetter).append("ay").toString();
    }

    public static String convertSentence(String sentence) {
        sentence = sentence.toLowerCase();
        String[] splitResult = sentence.split(" ");
        StringBuilder convert = new StringBuilder();
        String result = "";
        for (int i = 0; i < splitResult.length; i++) {
            convert.append(pigLatin(splitResult[i])).append(" ");
        }
        return convert.toString();
    }
}
