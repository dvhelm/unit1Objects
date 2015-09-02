import java.util.Random;

public class Die_Simulator
{
   public static void main(String[] args)
   {
       //Option A
       Random die = new Random();
       int random = die.nextInt(6);
       random+=1;
       System.out.println("The number rolled is " + random ) ;
       //Option B
       double dieValue2 = Math.random(); // Returns a double between 0 (inclusive) and 1 (exclusive)
       dieValue2 *= 6; //range [0,6)
       dieValue2 += 1; //range [1,7)
       System.out.println("The number rolled is " + (int) dieValue2 ); //prints 1,2,3,4,5,6
    }
}