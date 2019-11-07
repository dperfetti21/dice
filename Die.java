
/**
 * simulates the rolling of a die
 *
 * @author Declinda Perfetti
 * @version November 2019
 */
public class Die
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
    * simulates the rolling of the die
    */ 
   public void roll()
   {
       faceValue = (int)(Math.random()*7);
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


    