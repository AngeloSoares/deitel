//Programa de jogo de dados utilizando arrays em vez de swicth.
package capitulo7;
import java.security.SecureRandom;

public class RollDie
{
    public static void main(String[] args)
    {
      SecureRandom randomNumbers = new SecureRandom();
      int[] frequency = new int[7];

      for(int roll = 1; roll <= 600000; roll++)
        ++frequency[1+randomNumbers.nextInt(6)];

      System.out.printf("%s%10s%n", "Face", "Frequancy");

      for(int face = 1; face < frequency.length; face++)
        System.out.printf("%4d%10d%n", face, frequency[face]);
    }
}
