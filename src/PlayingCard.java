public class PlayingCard {
    private int value;
    private CardType type;
    private boolean isShown = false;

    public PlayingCard(int value, CardType type){
        this.value = value;
        this.type = type;

        //Test
    }

    public int getValue() {
        return value;
    }

    public CardType getType() {
        return type;
    }

    public boolean isShown() {
        return isShown;
    }

    public void setShown(boolean shown) {
        isShown = shown;
    }
}
