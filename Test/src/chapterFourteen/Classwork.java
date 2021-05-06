package chapterFourteen;

public class Classwork {

    public static int searchForNumberOfCharOccurrences(String sentence, char charToSearchFor){
        sentence = sentence.toLowerCase();
        charToSearchFor = Character.toLowerCase(charToSearchFor);
        int counter = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if(charToSearchFor == sentence.charAt(i))
                counter++;
        }
        return counter;
    }

    public static int searchForNumberOfStringOccurrences(String sentence, String wordToSearchFor){
        sentence = sentence.toLowerCase();
        wordToSearchFor = wordToSearchFor.toLowerCase();
        int counter = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.regionMatches(i, wordToSearchFor, 0, wordToSearchFor.length()-1))
                counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
      //  System.out.println(Classwork.searchForNumberOfCharOccurrences("The boy is over there", 'e'));
        System.out.println(Classwork.searchForNumberOfStringOccurrences("The boy is overth theye", "th"));
    }

}
