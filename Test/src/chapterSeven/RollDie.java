package chapterSeven;

import java.security.SecureRandom;

public class RollDie {

    public final static SecureRandom secureRandom = new SecureRandom();
    private static int[] die = new int[6];
    private static int faceGenerated;


    public static int generateRandomFace() {
        int random =  1 + secureRandom.nextInt(6);
        return random;
    }


    public static int countGeneratedFaces() {
        die[faceGenerated - 1]++;

        return die[faceGenerated - 1];
    }

//    public static int displayFace(int face) {
//
//    }
}
