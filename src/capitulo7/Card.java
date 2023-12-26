package capitulo7;

//Classe CARD representa uma carta do baralho.
public class Card
{
    private final String face;
    private final String suit;

    public Card(String face, String suit)
    {
        this.face = face;
        this.suit = suit;
    }

    public String toString()
    {
        return face + " de " + suit;
    }
}
