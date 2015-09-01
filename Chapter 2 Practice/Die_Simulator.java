import java.util.Random;

public class Die_Simulator
{
   public static void main(String[] args)
   {
       Random die = new Random();
       int random = die.nextInt(6);
       random+=1;
       System.out.println("The number rolled is " + random);
    }
}