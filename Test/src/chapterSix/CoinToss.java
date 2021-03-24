package chapterSix;

import java.security.SecureRandom;

public class CoinToss {

    private static final SecureRandom secureRandom = new SecureRandom();
    private static int headCount;
    private static CoinFace faceType;
    private static int tailCount;

    public static int flipCoin() {
        int face = 1 + secureRandom.nextInt(2);
        return face;
    }

    public static int displayFace(int face) {
        switch(face){
            case 0:
                faceType = CoinFace.HEAD;
                headCount++;
                break;
            case 1:
                faceType = CoinFace.TAIL;
                tailCount++;
                break;
        }
        return face;
    }


    public static int getHeads() {
        return headCount;
    }

    public static int getTails() {
        return tailCount;
    }
}
