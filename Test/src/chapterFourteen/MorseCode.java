package chapterFourteen;

public class MorseCode {

    private String encodeChar(char letter) {
        String value = "";
        switch (letter) {
            case 'A' -> value = ".-";
            case 'B' -> value = "-...";
            case 'C' -> value = "-.-. ";
            case 'D' -> value = "-.. ";
            case 'E' -> value = ".";
            case 'F' -> value = "..-.";
            case 'G' -> value = "--.";
            case 'H' -> value = "....";
            case 'I' -> value = "..";
            case 'J' -> value = ".---";
            case 'K' -> value = "-.-";
            case 'L' -> value = ".-..";
            case 'M' -> value = "--";
            case 'N' -> value = "-.";
            case 'O' -> value = "---";
            case 'P' -> value = ".--.";
            case 'Q' -> value = "--.-";
            case 'R' -> value = ".-.";
            case 'S' -> value = "...";
            case 'T' -> value = "-";
            case 'U' -> value = "..-";
            case 'V' -> value = "...- ";
            case 'W' -> value = ".--";
            case 'X' -> value = "-..-";
            case 'Y' -> value = "-.--";
            case 'Z' -> value = "--..";
            case '1' -> value = ".----";
            case '2' -> value = "..---";
            case '3' -> value = "...--";
            case '4' -> value = "....-";
            case '5' -> value = ".....";
            case '6' -> value = "-....";
            case '7' -> value = "--...";
            case '8' -> value = "---..";
            case '9' -> value = "----.";
            case '0' -> value = "-----";
        }
        return value;
    }

    private char decodeChar(String morse) {
        char value = ' ';
        switch (morse) {
            case ".-" -> value = 'A';
            case "-..." -> value = 'B';
            case "-.-. " -> value = 'C';
            case "-.. " -> value = 'D';
            case "." -> value = 'E';
            case "..-." -> value = 'F';
            case "--." -> value = 'G';
            case "...." -> value = 'H';
            case ".." -> value = 'I';
            case ".---" -> value = 'J';
            case "-.-" -> value = 'K';
            case ".-.." -> value = 'L';
            case "--" -> value = 'M';
            case "-." -> value = 'N';
            case "---" -> value = 'O';
            case ".--." -> value = 'P';
            case "--.-" -> value = 'Q';
            case ".-." -> value = 'R';
            case "..." -> value = 'S';
            case "-" -> value = 'T';
            case "..-" -> value = 'U';
            case "...- " -> value = 'V';
            case ".--" -> value = 'W';
            case "-..-" -> value = 'X';
            case "-.--" -> value = 'Y';
            case "--.." -> value = 'Z';
            case "-----" -> value = '0';
            case ".----" -> value = '1';
            case "..---" -> value = '2';
            case "...--" -> value = '3';
            case "....-" -> value = '4';
            case "....." -> value = '5';
            case "-...." -> value = '6';
            case "--..." -> value = '7';
            case "----." -> value = '9';
            case "---.." -> value = '8';
        }
        return value;
    }

    public String toMorseCode(String phrase) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = phrase.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == ' '){
                stringBuilder.append("/");
            }
            else{
                stringBuilder.append(encodeChar(Character.toUpperCase(chars[i])));
                if(i != chars.length - 1){
                    stringBuilder.append(" ");
                }
            }
        }
        return stringBuilder.toString();
    }
}
