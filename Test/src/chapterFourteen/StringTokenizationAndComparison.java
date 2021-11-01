package chapterFourteen;

import java.util.Arrays;

public class StringTokenizationAndComparison {

    public String tokenizeSentence(String sentence) {
        StringBuilder builder = new StringBuilder();
        String [] token = sentence.split(" ");
        System.out.println(Arrays.deepToString(token));
        for(String string : token) {
            if (string.toLowerCase().startsWith("b")) {
                builder.append(string).append(" ");
            }
            if(string.endsWith("ED")){
                builder.append(string).append(" ");
            }
        }
        return builder.toString().trim();
    }
}
