package capitulo7;
//Embaralhamento e distribuição de cartas.
public class DeckOfCardsTest
{
    public static void main(String[] args)
    {
        DeckOfCards myDeckOfCard = new DeckOfCards();
        myDeckOfCard.shuffle();

        for(int i = 1; i <= 52; i++ )
        {
            System.out.printf("%-19s", myDeckOfCard.dealCard());

            if(i % 4 == 0)
                System.out.println();
        }
    }
}
