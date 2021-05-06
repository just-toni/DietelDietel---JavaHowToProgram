package chapterFourteen;

public class ComparingStrings {
    public String compare(String firstWord, String secondWord) {
        if(firstWord.compareTo(secondWord) > 0){
            return "First word is larger";
        }
        else if (firstWord.compareTo(secondWord) < 0){
            return "Second word is larger";
        }
        else return "Both words are equal";
    }
}
