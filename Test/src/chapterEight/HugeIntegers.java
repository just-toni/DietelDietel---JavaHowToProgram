package chapterEight;

import java.io.OptionalDataException;
import java.math.BigInteger;

public class HugeIntegers {


    private int[] array = new int [40];

    public static BigInteger add(HugeIntegers firstHugeInteger, HugeIntegers secondHugeInteger) {
        return firstHugeInteger.getValue().add(secondHugeInteger.getValue());
    }

    public static BigInteger subtract(HugeIntegers firstHugeInteger, HugeIntegers secondHugeInteger) {
        return firstHugeInteger.getValue().subtract(secondHugeInteger.getValue());
    }

    public static BigInteger multiply(HugeIntegers firstHugeInteger, HugeIntegers secondHugeInteger) {
        return firstHugeInteger.getValue().multiply(secondHugeInteger.getValue());
    }

    public static BigInteger divide(HugeIntegers firstHugeInteger, HugeIntegers secondHugeInteger) {
        return firstHugeInteger.getValue().divide(secondHugeInteger.getValue());
    }

    public void parse(String number) {
        int value = array.length - 1;
        for (int i = number.length() -1; i >= 0; i--) {
            array[value--] = Integer.parseInt(String.valueOf(number.charAt(i)));
        }
    }

    public BigInteger getValue() {
        StringBuilder digits = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            digits.append(array[i]);
        }
        return new BigInteger(digits.toString());
    }

    public boolean isEqualTo(HugeIntegers secondHugeInteger) {
        return getValue().equals(secondHugeInteger.getValue());
    }

    public boolean isNotEqualTo(HugeIntegers secondHugeInteger) {
        return !getValue().equals(secondHugeInteger.getValue());
    }

    public boolean isGreaterThan(HugeIntegers hugeInteger) {
        return getValue().compareTo(hugeInteger.getValue()) == 1;
    }

    public boolean isLesserThan(HugeIntegers hugeInteger) {
        return getValue().compareTo(hugeInteger.getValue()) == -1;
    }

    public boolean isGreaterThanOrEqualTo(HugeIntegers hugeInteger) {
        return getValue().compareTo(hugeInteger.getValue()) == 1 || getValue().compareTo(hugeInteger.getValue()) == 0;
    }

    public boolean isLesserThanOrEqualTo(HugeIntegers hugeInteger) {
        return getValue().compareTo(hugeInteger.getValue()) == -1 || getValue().compareTo(hugeInteger.getValue()) == 0;
    }

    public boolean isZero() {
        return getValue().equals(BigInteger.valueOf(0));
    }
}
