import java.util.Random;
public class Baraja {
    public static void main(String[] args){
        Random rnd=new Random();
        Deck deck=new Deck();
        Card carta;
        int i=rnd.nextInt(51);
        carta=deck.quitarCarta(i);
        System.out.println("Carta obtenida:" +carta);
        //Hola
    }
}