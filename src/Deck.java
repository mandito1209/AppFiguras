import java.util.ArrayList;

public class Deck {
    // instance variables - replace the example below with your own
    private ArrayList<Card> deck;

    /**
     * Constructor for objects of class Deck
     */
    public Deck()
    {
        // Inicializar variables
        deck=new ArrayList(52);
        for(int i=1;i<14;i++){
            Card carta=new Card(i,'♦');
            deck.add(carta);
        }
        for(int i=1;i<14;i++){
            Card carta=new Card(i,'♠');
            deck.add(carta);
        }
        for(int i=1;i<14;i++){
            Card carta=new Card(i,'♥');
            deck.add(carta);
        }
        for(int i=1;i<14;i++){
            Card carta=new Card(i,'♣');
            deck.add(carta);
        }
    }

    public void mostrarCartas()
    {
        Card[] array=new Card[deck.size()];
        deck.toArray(array);
        System.out.println("\f");
        int i=0;
        for (Card item: array) {
            System.out.println(" "+item.toString());
            i++;
        }
    }
    public void revolverBaraja()
    {
        int numero;
        for(int i=0;i<deck.size();i++){
            numero = (int) (Math.random() * (deck.size()-1));
            Card cartaAux=deck.get(i);
            deck.set(i,deck.get(numero));
            deck.set(numero,cartaAux);
        }

    }
    public Card quitarCarta()
    {
        int i=(deck.size()-1);
        Card carta=deck.get(i);
        deck.remove(i);
        return carta;
    }
    public Card quitarCarta(int i)
    {
        Card carta=deck.get(i);
        deck.remove(i);
        return carta;
    }
    public ArrayList quitarCartas()
    {
        ArrayList<Card> mano;
        mano= new ArrayList(5);
        for(int i=0;i<5;i++){
            int c=(deck.size()-1);
            mano.add(deck.get(c));
            deck.remove(c);
        }
        return mano;
    }
}
