package capitulo7;
//Classe DeckOfCards representa um baralho da classe Cards.
import java.security.SecureRandom;
public class DeckOfCards
{
    private Card[] deck; //array de objetos Cards.
    private int currentCard; //índice da próxima Card a ser distribuída (0-51);
    private static final int  NUMBER_OF_CARDS = 52; //numero constate de Cards.
    //gerador de número aleatório:
    private static final SecureRandom randomNumbers = new SecureRandom();

    //construtor preenche baralho de cartas
    public DeckOfCards()
    {

        String[] faces = {"Ás","Dois", "Três", "Quatro", "Cinco", "Seis",
                "Sete", "Oito", "Nove", "Dez", "Valete", "Rainha", "Rei"};
        String[] suits = {"Copas", "Ouros", "Paus", "Espadas"};

        deck = new Card[NUMBER_OF_CARDS];
        currentCard = 0;

        //Preenche  baralho com objetos Cards
        for(int count = 0; count < deck.length; count++)
            deck[count] =  new Card(faces[count % 13], suits[count / 13]);

    }

    public void shuffle()
    {
        currentCard = 0;

        for(int first = 0; first < deck.length; first++)
        {
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    public Card dealCard()
    {
        if(currentCard < deck.length)
            return deck[currentCard++];
        else
            return null;
    }


}
