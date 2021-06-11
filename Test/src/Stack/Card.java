package Stack;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if(!this.getClass().equals(obj.getClass())){
            return false;
        }
        Card comparisonCard = (Card) obj;
        return this.face ==  (comparisonCard.face) || this.suits == (comparisonCard.suits);
    }

}
