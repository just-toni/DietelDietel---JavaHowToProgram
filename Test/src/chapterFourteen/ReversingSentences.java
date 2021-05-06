package chapterFourteen;

public class ReversingSentences {
    public String reverseInput(String sentence) {
        String[] splitResult = sentence.split(" ");
        StringBuilder reserved = new StringBuilder();
        for (int i = splitResult.length - 1; i >= 0; i--) {
            reserved.append(splitResult[i]).append(" ");
        }
        return reserved.toString();
    }
}
