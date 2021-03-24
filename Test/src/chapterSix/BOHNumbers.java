package chapterSix;

public class BOHNumbers {
    public static int covertToBinary(int decimal) {
        String binary = "";
        int rem = decimal;
        while(rem > 0){
            binary = (rem % 2) + binary;
            rem /= 2;
        }
        return Integer.parseInt(binary);
    }

    public static int covertToOctal(int decimal) {
        String octal = "";
        int rem = decimal;
        while(rem > 0){
            octal = (rem % 8) + octal;
            rem /= 8;
        }
        return Integer.parseInt(octal);
    }

    public static String covertToHexadecimal(int decimal) {
        String hex = "";
        int rem = decimal;
        while(rem > 0){
            hex = getHexValue((rem % 16)) + hex;
            rem /= 16;
        }
        return hex;
    }

    public static String getHexValue(int decimal){
        return switch (decimal) {
            case 10 -> "A";
            case 11 -> "B";
            case 12 -> "C";
            case 13 -> "D";
            case 14 -> "E";
            case 15 -> "F";
            default -> String.valueOf(decimal);
        };
    }
}
