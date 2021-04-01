import java.util.Scanner;

public class Example3 {

    public Example3 (){}

    public Example3(int num1){
        num1 = 9;
    }

    public Example3(int num4, int num7){
        num4 = 0;
        num7 = 8;
    }

    public static int add(int number1, int number2){
        return 0;
    }

    public static int add(String number1, int number2){
        return 0;
    }

    public static int add(int number1, String number2){
        return 0;
    }

    public static void add(String number2, String number1){
//        return 0;
    }

    public static void add(String red, double blue){

    }

    public static int add(int number1, int number2, int number3){
        return 9;
    }

    public static int add(int number1, int number2, int number3, int number4 ){
        return -1;
    }
}


class ExampleTest{
    public static void main(String[] args) {
        int result1 = Example3.add(1,3);
        int result2 = Example3.add(2, 3, 4);
        int result3 = Example3.add(1, 2, 3, 4);
        int result4 = Example3.add("read", 8);

        Example3 example = new Example3();
        Example3 example1 = new Example3(6, 8);
        Example3 example2 = new Example3(4);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
    }
}
