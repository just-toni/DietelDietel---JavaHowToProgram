package chapterFourteen;

import java.security.SecureRandom;

public class RandomSentences {
    public void randomizingWords() {
        String [] article = {"the", "a", "one", "some", "any"};
        String [] noun = {"boy", "girl", "dog", "town", "car"};
        String [] verb = {"drove", "jumped", "ran", "walked", "skipped"};
        String [] preposition = {"to", "from", "over", "under", "on"};
        SecureRandom random = new SecureRandom();

        StringBuilder stringBuilder = new StringBuilder();

        String[][] wordArray = {article,noun,verb,preposition,article,noun};
        for (int i = 0; i < wordArray.length; i++) {

        }
    }
}
