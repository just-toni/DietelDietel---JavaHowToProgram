package chapterSix.Example;

public class Example {

    private static int number1;
    private int number4;
    private int number2;
    private static int number3;

    public static void setNumber1(int number1) {
        Example.number1 = number1;
    }

    public static int getNumber1() {
        return number1;
    }

    public static void setNumber4(int number4a) {
        Example example = new Example();
        example.number4 = number4a;
    }

    public static int getNumber4() {
        Example example = new Example();
        return example.number4;
    }

    public void setNumber3(int number3) {
        this.number3 = number3;
    }

    public int getNumber3() {
        return number3;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getNumber2() {
        return number2;
    }


}
