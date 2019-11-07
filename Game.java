
/**
 * simulates rolling of a die in game scenarios
 *
 * @author (Declinda Perfetti)
 * @version (Nov. 2019)
 */
public class Game
{
    public int playGame ()
    {
        Die dieOne = new Die();
        int valOne = dieOne.getValue();
        int valTwo = dieOne.getValue();
        return valOne + valTwo;
    }
}