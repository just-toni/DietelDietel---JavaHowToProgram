package Stack;

public class Card {

    private final String face;
    private final String suits;

    public Card(String face, String suits) {
        this.face = face;
        this.suits = suits;
    }

    @Override
    public String toString() {
        return face + " of " + suits;
    }
}
