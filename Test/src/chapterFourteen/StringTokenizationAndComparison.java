package chapterFourteen;

public class StringTokenizationAndComparison {


    public void tokenizeSentence(String sentence) {
        String [] token = sentence.split(" ");
        for(String string : token){
            if(string.startsWith("b")){
                System.out.println(string);
            }
        }
    }

    public String getTokenizedSentence() {
        return
    }
}
