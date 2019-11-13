/**
 * simulates the rolling of a weighted die
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
        faceValue = (int)(Math.random()*9 + 1);
        if (faceValue == 7)
        {
            faceValue = 2;
        }
        if (faceValue == 8)
        {
            faceValue = 4;
        }
        if (faceValue == 9)
        {
            faceValue = 6;
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
}