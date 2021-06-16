package chapterSeven;

public class SevenDigitDisplay {

    int[][] sevenDigitDisplay = new int [5][4];

    public void displayBoard() {
        for (int[] digits : sevenDigitDisplay) {
            for (int digit : digits) {
                if (digit == 1) System.out.print("#" + " ");
                if (digit == 0) System.out.print("  ");
            }
            System.out.println();
        }
    }

    public void writeOnA(){
        for (int i = 0; i < sevenDigitDisplay[3].length; i++) {
            sevenDigitDisplay[0][i] = 1;
        }
    }

    public void writeOnB(){
        for (int i = 0; i < 3; i++) {
            sevenDigitDisplay[i][3] = 1;
        }
    }

    public void writeOnC(){
        for (int i = 3; i < 5; i++) {
            sevenDigitDisplay[i][3] = 1;
        }
    }

    public void writeOnD(){
        for (int i = 0; i < sevenDigitDisplay[3].length; i++) {
            sevenDigitDisplay[4][i] = 1;
        }
    }

    public void writeOnE(){
        for (int i = 2; i < 5; i++) {
            sevenDigitDisplay[i][0] = 1;
        }
    }

    public void writeOnF(){
        for (int i = 0; i < 3; i++) {
            sevenDigitDisplay[i][0] = 1;
        }
    }

    public void writeOnG(){
        for (int i = 0; i < sevenDigitDisplay[3].length; i++) {
            sevenDigitDisplay[2][i] = 1;
        }
    }

    public void setValue(String binaryNumber){
        binaryNumber = checkLengthAndInsert(binaryNumber);
        binaryNumber = validateLengthOfString(binaryNumber);
        checkPowerBit(binaryNumber);
        boolean right = isValueValid(binaryNumber);
        if(right) {
            for (int i = 0; i < binaryNumber.length(); i++) {
                if (binaryNumber.charAt(i) == '1') {
                    switch (i) {
                        case 1 -> writeOnA();
                        case 2 -> writeOnB();
                        case 3 -> writeOnC();
                        case 4 -> writeOnD();
                        case 5 -> writeOnE();
                        case 6 -> writeOnF();
                        case 7 -> writeOnG();
                    }
                }
            }
        }
    }

    private String checkLengthAndInsert(String binaryNumber) {
        if(binaryNumber.length() < 8){
            StringBuilder binaryNumberBuilder = new StringBuilder(binaryNumber);
            while(binaryNumberBuilder.length() <= 8){
                binaryNumberBuilder.insert(0, '0');
            }
            binaryNumber = binaryNumberBuilder.toString();
        }
        return binaryNumber;
    }

    private void checkPowerBit(String binaryNumber) {
        if(binaryNumber.charAt(7) == 0){
            System.out.println("");
        }
    }

    private String validateLengthOfString(String binaryNumber) {
        if(binaryNumber.length() > 8){
            binaryNumber = binaryNumber.substring(0, 8);
        }
        return binaryNumber;
    }

    private boolean isValueValid(String binaryNumber) {
        char[] charArray = binaryNumber.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if((charArray[i] == 1 && charArray[i] == 0)) {
                return false;
            }
//            if(charArray[i] == 0){
//                return true;
//            }
        }
        return true;
    }

    public int covertToBinary(int decimal) {
        String binaryNumber = "";
        int rem = decimal;
        while(rem > 0){
            binaryNumber = (rem % 2) + binaryNumber;
            rem /= 2;
        }
        return Integer.parseInt(binaryNumber);
    }


}


