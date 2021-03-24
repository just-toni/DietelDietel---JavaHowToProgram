package FirstSetOfTddPractice.Cryptography;

public class Cryptography {
    private int input;
    private int fourthDigit;
    private int thirdDigit;
    private int secondDigit;

    public void collectInput(int input) {
        if (input >= 1000 && input <= 9999) {
            this.input = input;
        }
    }

    public int getInput() {
        return input;
    }

    public void separateFourthDigit(int input) {
        fourthDigit = input % 10;
    }

    public int getFourthDigit() {
        return fourthDigit;
    }

    public void separateThirdDigit(int input) {
        input = input / 10;
        thirdDigit = input % 10;
    }

    public int getThirdInput() {
        return thirdDigit;
    }

    public void separateSecondDigit(int input) {
        input = input / 100;
        secondDigit = input % 10;
    }


    public int getSecondInput() {
        return secondDigit;
    }

    public void separateFirstDigit(int input) {
        input = input / 1000;
        this.input = input;
    }

    public int encryptFourthDigit() {
        return (getFourthDigit() + 7) % 10;
    }

    public int encryptThirdDigit() {
        return (getThirdInput() + 7) % 10;

    }

    public int encryptSecondDigit() {
        return (getSecondInput() + 7) % 10;
    }

    public int encryptFirstDigit() {
        return (getInput() + 7) % 10;
    }

    public void separateAllDigits(int input) {
        separateFirstDigit(input);
        separateSecondDigit(input);
        separateThirdDigit(input);
        separateFourthDigit(input);
    }

    public String getSeparatedDigits() {
        String value = "" + getInput() + getSecondInput() + getThirdInput() + getFourthDigit();
        return value;
    }

    public String getEncryptedDigits() {
        String value = "" + encryptThirdDigit() + encryptFourthDigit() + encryptFirstDigit() + encryptSecondDigit();
        return value;
    }
}


