package chapterFourteen;

import java.security.SecureRandom;

public class RandomSentences {
    public void randomizingWords() {
        String [] article = {"the", "a", "one", "some", "any"};
        String [] noun = {"boy", "girl", "dog", "town", "car"};
        String [] verb = {"drove", "jumped", "ran", "walked", "skipped"};
        String [] preposition = {"to", "from", "over", "under", "on"};
        SecureRandom random = new SecureRandom();
        String [][] sentenceArray = {article, noun, verb, preposition, article, noun};

        for (int i = 0; i <= 20; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < sentenceArray.length; j++) {
                sb.append(sentenceArray[j][random.nextInt(5)]).append(" ");
            }
            System.out.println(sb);
            StringBuilder sentence = new StringBuilder(article[random.nextInt(5)]);
            sentence.append(" ").append(noun[random.nextInt(5)]);
            sentence.append(" ").append(verb[random.nextInt(5)]);
            sentence.append(" ").append(preposition[random.nextInt(5)]);
            sentence.append(" ").append(article[random.nextInt(5)]);
            sentence.append(" ").append(noun[random.nextInt(5)]);
            System.out.println(sentence.toString());
        }
    }
}
