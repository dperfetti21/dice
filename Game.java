
/**
 * simulates rolling of a die in game scenarios
 *
 * @author (Declinda Perfetti)
 * @version (Nov. 2019)
 */
public class Game
{
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
    private int rollTwoDice()
    {
        Die dieOne = new Die();
        dieOne.roll();
        int valOne = dieOne.getValue();
        dieOne.roll();
        int valTwo = dieOne.getValue();
        return valOne + valTwo;
    }
    public int counter(int num)
    {
        num = ((Math.random)*6 +1);
    }
    
}