/**
 * simulates the rolling of a die
 *
 * @author Declinda Perfetti
 * @version November 2019
 */
public class WeightedDie
{
    int faceValue;
    /**
     * gets the value of the rolled die 
     * @return the value of the rolled die
     */ 
    public int getValue()
    {
        return faceValue;
    }

    /**
     * simulates the rolling of the die in which the die is twice as likely to roll a even
     * number rather than an odd number
     */ 
    public void roll()
    {
        faceValue = (int)(Math.random()*6 + 1);
        if (faceValue%2 != 0)
        {
            faceValue = (int)(Math.random()*6 +1);
        }
    }

    /**
     * overrides the Java string method to return the value of the rolled die 
     * as a string
     * @return a string of the face value of the die
     */ 
    @Override
    public String toString()
    {
        return ("" + faceValue);
    }
    public int counter(int num)
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