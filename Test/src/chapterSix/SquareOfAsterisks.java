package chapterSix;

public class SquareOfAsterisks {
    private static int input;

    public static void setFirstInput(int input) {
        if(input > 0)
            SquareOfAsterisks.input = input;
    }

    public static int getFirstInput() {
        return input;
    }

    public static String squareOfAsterisks(int input) {
        String asterisks = "";
        for(int i = 0; i < input; i++){
            for(int j = 0;  j < input; j++){
                asterisks += "*";
            }
            asterisks += "\n";
        }
        return asterisks;
    }
}
