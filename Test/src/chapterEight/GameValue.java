package chapterEight;

public enum GameValue {
    X,
    O,
    EMPTY;


    @Override
    public String toString() {
        String value = "";
        switch (this){
            case X -> {
                value = "X";
            }
            case O -> {
                value = "O";
            }
            case EMPTY -> {
                value = "EMPTY";
            }
        }
        return value;
    }
}
