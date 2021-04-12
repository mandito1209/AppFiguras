public class Card {
    // instance variables - replace the example below with your own
    private int valor;
    private char figura;

    public Card()
    {
        valor=0;
        figura='♣';
    }
    /**
     * Constructor for objects of class Card
     */
    public Card(int valor,char figura)
    {
        // initialise instance variables
        this.valor=valor;
        this.figura=figura;
    }

    public String toString()
    {
        String valorC;
        switch(valor){
            case 1: valorC="A";
                break;
            case 11: valorC="J";
                break;
            case 12: valorC="Q";
                break;
            case 13: valorC="K";
                break;
            default: valorC=valor+"";
                break;
        }
        return valorC+figura;
    }
    public void setValor(int valor)
    {
        this.valor=valor;
    }
    public int getValor()
    {
        return valor;
    }
    public void setFigura(char figura)
    {
        this.figura=figura;
    }
    public char getFigura()
    {
        return figura;
    }
}
