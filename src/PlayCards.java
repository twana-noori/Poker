import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Queue;

public class PlayCards {
    private PlayingCardDeck pcd;
    private Queue<PlayingCard> shuffledDeck;
    private boolean cardsBackInStack;
    private int numberOfPlayers;
    private int cardsAtStart;
    private ArrayList<PlayingCard> allCardsOnTable;
    private Player[] players;

    public PlayCards(int cardsAtStart, int numberOfPlayers, boolean cardsBackInStack){
        this.numberOfPlayers = numberOfPlayers;
        this.cardsBackInStack = cardsBackInStack;
        this.cardsAtStart = cardsAtStart;

        players = new Player[numberOfPlayers];
        // Set Names of all players;

        Player player1= new Player("Twana",500);
        players[0] = player1;

        allCardsOnTable = new ArrayList<>();

        pcd = new PlayingCardDeck();
        shuffledDeck=  pcd.getShuffledDeck();
        System.out.println("Your cards");
        dealCards();
        System.out.println("\nThe dealer");
        cardsOnTable("flop");
        //waitSomTime(200);
        cardsOnTable("turn");
        //waitSomTime(200);
        cardsOnTable("river");
        getResult();
    }

    public void dealCards(){

        for (int i=0;i<cardsAtStart;i++) {
            PlayingCard card = shuffledDeck.remove();
            players[0].setCards(card);
            displayCards(card);
        }
    }
    private void cardsOnTable(String cardsOnTable){
        int cardsToShow=0;
        switch (cardsOnTable.toLowerCase()){
            case "flop":
                cardsToShow = 3;
            break;
            case "turn", "river":
                cardsToShow = 1;
                break;
            default:
                System.out.println("Not a valid input!");
                break;
        }
        for(int i=0;i<cardsToShow;i++){
            PlayingCard p = shuffledDeck.remove();
            allCardsOnTable.add(p);
            displayCards(p);
        }
    }
    private void displayCards(PlayingCard card){
        String displayValue = "";
        String displayType = "";

        switch (card.getValue()) {
            case 1:
                displayValue = "A";
                break;
            case 11:
                displayValue = "J";
                break;
            case 12:
                displayValue = "Q";
                break;
            case 13:
                displayValue = "K";
                break;
            default:
                displayValue = Integer.toString(card.getValue());
        }

        switch (card.getType()){
            case HJÄRTER:
                displayType = "\u2665";
                break;

            case SPADER:
                displayType = "\u2660";
                break;
            case RUTER:
                displayType = "\u2666";
                break;
            case KLÖVER:
                displayType = "\u2663";
                break;
        }

        System.out.print(displayValue + ""+ displayType+" ");
    }
    private void getResult(){
        PlayingCard card1 = players[0].getCards().get(0);
        PlayingCard card2 = players[0].getCards().get(1);
        int numberOfSameValueCard1 = 0;
        int numberOfSameValueCard2 = 0;

        for(PlayingCard card : allCardsOnTable) {
            if (card1.getValue() == card.getValue()) {
                numberOfSameValueCard1++;
                System.out.println("HÄR");
            }
            if (card2.getValue() == card.getValue()) {
                numberOfSameValueCard2++;
                System.out.println("ELLER HÄR");
            }

            switch (numberOfSameValueCard1) {
                case 1:
                    System.out.println("Par1");
                    break;
                case 2:
                    System.out.println("Triss1");
            }
            switch (numberOfSameValueCard2) {
                case 1:
                    System.out.println("Par2");
                    break;
                case 2:
                    System.out.println("Triss2");
            }
        }
    }
    private void returnCardToQueue(PlayingCard card){

        if(cardsBackInStack){
            shuffledDeck.add(card);
        }
    }
    private void waitSomTime(long ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
