package Card;

public class CardGame {
    private int numberOfPlayers;
    private int numberOfCardsToDeal;

    public CardGame(int numberOfPlayers, int numberOfCardsToDeal) {
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfCardsToDeal = numberOfCardsToDeal;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public int getNumberOfCardsToDeal() {
        return numberOfCardsToDeal;
    }


}
