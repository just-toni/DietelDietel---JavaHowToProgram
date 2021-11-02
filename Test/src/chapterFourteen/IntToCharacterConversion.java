package chapterFourteen;

public class IntToCharacterConversion {
    public char convertIntToCharacter(int code) {
        char result = (char)code;
        return result;
    }

    public void generateThreeDigitCodes(){
        for (int i = 0; i < 256; i++) {
            char result = (char)i;
            System.out.println("Integer code " + "                   " + "Character Value");
            System.out.println("    " + i + "                                 " + result);
        }
    }

    public static void main(String[] args) {
        IntToCharacterConversion intToCharacterConversion = new IntToCharacterConversion();
        intToCharacterConversion.generateThreeDigitCodes();
    }
}
