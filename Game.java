
/**
 * simulates rolling of a die in game scenarios
 *
 * @author (Declinda Perfetti)
 * @version (Nov. 2019)
 */
public class Game
{  /**
     * simulates the rolling of a die by two players and prints the player 
     * with the highest score
     */
    public void playGame ()
    {
        int playerOne = rollTwoDice();
        int playerTwo = rollTwoDice();
        System.out.println(playerOne);
        System.out.println(playerTwo);

        if(playerOne == playerTwo)
        {
            System.out.println ("It is a tie");
        }
        if (playerOne > playerTwo)
        {
            System.out.println ("Player 1 Wins");
        }
        if (playerTwo > playerOne)
        {
            System.out.println ("Player 2 Wins");
        }
    }

   /**
     * simulates the rolling of two dice 
     * @return the sum of the values on each dice
     */ 
    private int rollTwoDice()
    {
        Die dieOne = new Die();
        dieOne.roll();
        int valOne = dieOne.getValue();
        dieOne.roll();
        int valTwo = dieOne.getValue();
        return valOne + valTwo;
    }

   /**
     * counts the number of times it takes to roll a specified number
     * @param num a number that the die must roll to (this number is between
     * 1 and 6)
     * @return the number of times it takes for the die to roll to a specified
     * number
     */
    public int counter(int num)
    {
        Die dieTwo = new Die();
        dieTwo.roll();
        int counter = 0;
        int faceValCurrent;
        do
        {
         counter ++;   
         dieTwo.roll();
         faceValCurrent = dieTwo.getValue();
        }
        while (faceValCurrent != num);
        return counter;
    }
    /**
    * simulates the playing of a game in which player 1 will always win and player 2 will
    * not realize what is happening
    */
   public void playUnfairGame ()
   {
     int playerOne = rollTwoDice();
     int playerTwo = rollTwoDice();
     do
     {
         playerOne = rollTwoDice();
     }
     while(playerOne <= playerTwo);
     System.out.println(playerOne);
     System.out.println(playerTwo);
     System.out.println ("player 1 wins");
   }
   /**
    * counts the number of times it will take to roll a weighted die to reach a certain 
    * number
    * @param num the number that the die must be rolled to 
    * @return the number of times it takes to roll the die to the specific number
    */  
   public int weightedCounter(int num)
    {
        WeightedDie dieTwo = new WeightedDie();
        dieTwo.roll();
        int counter = 0;
        int faceValCurrent;
        do
        {
         counter ++;   
         dieTwo.roll();
         faceValCurrent = dieTwo.getValue();
        }
        while (faceValCurrent != num);
        return counter;
    }
}

