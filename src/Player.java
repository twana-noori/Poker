import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int cash;
    private List<PlayingCard> cardsOnHand = new ArrayList<>();

    public Player(String name, int cash){
        this.name = name;
        this.cash = cash;
    }
    public void setCards (PlayingCard card){
        cardsOnHand.add(card);
    }
    public List<PlayingCard> getCards(){
        return cardsOnHand;
    }
}
