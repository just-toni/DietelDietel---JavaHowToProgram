package chapterFourteen;

public class ComparingStringPortions {

    public boolean comparison(String firstWord, String secondWord, int firstStringIndex, int secondStringIndex, int numberOfCharacters) {
        return firstWord.regionMatches(firstStringIndex, secondWord, secondStringIndex,numberOfCharacters);
    }
}
