
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
     * @param num a number that the die must roll to
     * @return the number of times it takes for the die to roll to a specified
     * number
     */
    public int counter(int num)
    {
        int currentFaceVal;
        int counter = 0; 
        do
            {
                counter ++;
                currentFaceVal = ((int)Math.random()*6 + 1);
            }
         while (currentFaceVal != num);
        return counter;
    }

}

