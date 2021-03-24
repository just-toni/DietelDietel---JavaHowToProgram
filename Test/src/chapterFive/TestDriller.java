package chapterFive;

public class TestDriller {
    private int input;

    public int showPrice(int input) {
            if (input >= 1 && input <= 4) {
                return input * 1500;
            }
            if (input >= 5 && input <= 9) {
                return input * 1400;
            }
            if (input >= 10 && input < 30) {
                return input * 1200;
            }
            if (input >= 30 && input <= 49) {
                return input * 1100;
            }
            if (input >= 50 && input <= 99) {
                return input * 1000;
            }
            if (input >= 100 && input <= 199) {
                return input * 900;
            }
            if (input >= 200) {
                return input * 800;
            }
        return 0;
    }
}
