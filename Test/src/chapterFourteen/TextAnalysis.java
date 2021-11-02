package chapterFourteen;

public class TextAnalysis {
    public void findNumberOfOccurrencesOfEachAlphabetInThisText(String text) {
        char [] array = text.toCharArray();
        int occurrences = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < text.length(); j++) {
                if(array[i] == text.charAt(j)){
                    ++occurrences;
                }
            }
            System.out.println(array[i] + occurrences);
        }
    }

    public static void main(String[] args) {
        TextAnalysis textAnalysis = new TextAnalysis();

        textAnalysis.findNumberOfOccurrencesOfEachAlphabetInThisText("To be, or not to be: that is the question");
    }
}
