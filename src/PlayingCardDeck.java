import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class PlayingCardDeck {
    private final int numberOfCards = 13;
    private PlayingCard[] allCards = new PlayingCard[numberOfCards*4];
    private Queue<PlayingCard> cardsInQueue;
    private CardType[] cardTypes = {CardType.HJÄRTER,CardType.RUTER,CardType.KLÖVER,CardType.SPADER};

    public PlayingCardDeck(){

        int k =-1;
        for(int i=0;i<allCards.length;i++){
            if(i%13==0) {
                k++;
            }
            allCards[i] = new PlayingCard((i%13)+1,cardTypes[k]);
        }
    }
    public Queue<PlayingCard> getShuffledDeck(){
        int random;

        for (int i=0;i< allCards.length;i++){
            random = (int)(Math.random()*(allCards.length-1));
            PlayingCard tmp = allCards[random];
            allCards[random] = allCards[i];
            allCards[i] = tmp;
        }
        return getCardsInQueue(allCards);
    }

    private Queue<PlayingCard> getCardsInQueue(PlayingCard[] cards){
        cardsInQueue = new LinkedList<>();

        for(PlayingCard p : cards){
            cardsInQueue.add(p);
        }
        return cardsInQueue;
    }
}
