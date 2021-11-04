package chapterFourteen;

public class TextAnalysis {
    public static String findNumberOfOccurrencesOfEachAlphabetInThisText(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 'a'; i <= 'z'; i++) {
            int occurrences = 0;
            for (int j = 0; j < text.length(); j++) {
                if(text.indexOf((char)i, j) == -1){
                    break;
                }
                else{
                    ++occurrences;
                    j = text.indexOf((char)i, j);
                }
            }
//            System.out.printf("%s%13d%n", (char)i, occurrences);
            stringBuilder.append((char)i).append("            ").append(occurrences).append("\n");
        }
        return stringBuilder.toString();
    }

    public static String findWordLengthInThisText(String text){
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = text.toCharArray();
        String[] splitText = text.split(" ");
        for (int i = 0; i < splitText.length; i++) {
            int occurrences = 0;
            for (int j = 0; j < splitText[i].length(); j++) {
                if(splitText[i].length() == splitText[j].length()){
                    ++occurrences;
                }
            }
            stringBuilder.append(i).append("             ").append(occurrences).append("\n");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String text = "To be, or not to be: that is the question";
        findNumberOfOccurrencesOfEachAlphabetInThisText(text);
        System.out.println(findWordLengthInThisText("Whether 'tis nobler in the mind to suffer"));
    }
}
