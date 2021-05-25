package Card;

public class Card {

    private final Suit suits;
    private final Faces faces;

    public Card(Faces faces, Suit suits) {
        this.suits = suits;
        this.faces = faces;
    }

    public Suit getSuits() {
        return suits;
    }

    public Faces getFaces() {
        return faces;
    }

    @Override
    public String toString() {
        return faces + " OF " + suits;
    }
}
