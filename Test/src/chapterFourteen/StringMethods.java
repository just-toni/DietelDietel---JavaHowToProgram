package chapterFourteen;

public class StringMethods {
    public int indexOf(String word, char phrase) {
        int index = 0;
        for (int i = 0; i < word.length(); i++) {
            if(phrase == word.charAt(i)){
                index = i;
            }
        }
        return index;
    }

    public int indexOf(String word, String phrase){
        int index = 0;
        char [] newPhrase = phrase.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            if(newPhrase[0] == word.charAt(i)){
                index = i;
            }
        }
        return index;
    }

    public int lastIndexOf(String word, String phrase){
        int index = 0;
        char [] newPhrase = phrase.toCharArray();
        for (int i = 0; i < word.length() - 1; i++) {
            if(newPhrase[0] == word.charAt(i)){
                index = i;
            }
        }
        return index;
    }

    public int lastIndexOf(String word, char phrase) {
        int index = 0;
        for (int i = 0; i < word.length() - 1; i++) {
            if(phrase == word.charAt(i)){
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        StringMethods stringMethods = new StringMethods();
        stringMethods.indexOf("Qwerty", 'w');
    }
}
