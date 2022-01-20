import java.util.Arrays;

public class StretchTask2 {
    int[] values;
    int numberOfThrows;
    int numberOfDices;

    public StretchTask2(int numberOfThrows, int numberOfDices) {
        this.numberOfThrows = numberOfThrows;
        this.numberOfDices = numberOfDices;

        values = new int[(numberOfDices*6)+1];
        Dice diceOne = new Dice();
        Dice diceTwo = new Dice();

        for (int i = 0; i < numberOfThrows; i++) {
            int sum = diceOne.throwDice() + diceTwo.throwDice();
            values[sum] = values[sum] + 1;
        }
        printStatistics();
    }
        public void printStatistics(){
        float percentage;
            for (int i=1;i<values.length;i++){
                percentage = (float)values[i]/numberOfThrows*100;
                System.out.printf("Eyes: %d appears %d times(%.2f%%)",i,values[i],percentage);
                for(int j=0; j<(int)Math.round(percentage);j++) {
                    System.out.print('*');
                }
                System.out.println();
            }

        }
    }
