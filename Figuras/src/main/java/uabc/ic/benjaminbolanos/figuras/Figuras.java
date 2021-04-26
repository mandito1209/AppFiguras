package uabc.ic.benjaminbolanos.figuras;

import java.awt.Color;

/**
 *
 * @author Benjamin Bolaños
 * @version 2021.04.25
 */
public class Figuras {
    
    private Canvas canvas;
    private Square cuadrados[];
    private Circle circulos[];
    private Triangle triangulos[];
    private Trapecio trapecios[];
    
    public Figuras(){
        Canvas canvas=new Canvas("Figurinhas",800,800,new Color(175,246,238));
        canvas.setVisible(true);
        Square cuadrados[]=new Square[5];
        Circle circulos[]=new Circle[5];
        Triangle triangulos[]=new Triangle[5];
        Trapecio trapecios[]=new Trapecio[5];
    }
    
    public Square cuadradoRandom(){
        int posXY=(int) (Math.random() * 750);
        int size=(int) (Math.random() * 50 + 1);
        String color=colorRandom();
        Square cuadrado=new Square(size, posXY, posXY,color, canvas);
        return cuadrado;
    }
    
    public Circle circuloRandom(){
        int diametro=(int) (Math.random() * 50);
        int posXY=(int) (Math.random() * 750);
        String color=colorRandom();
        Circle circulo=new Circle(diametro, posXY, posXY, color, canvas);
        return circulo;
    }
    
    public Triangle trianguloRandom(){
        int posXY=(int) (Math.random() * 750);
        int altura=(int) (Math.random() * 50);
        int base=(int) (Math.random() * 50);
        String color=colorRandom();
        Triangle triangulo=new Triangle(altura,base, posXY, posXY, color, canvas);
        return triangulo;
    }
    
    public Trapecio trapecioRandom(){
        int posXY=(int) (Math.random() * 750);
        int altura=(int) (Math.random() * 50 + 1);
        int base=(int) (Math.random() * 40 + 1);
        String color=colorRandom();
        Trapecio trapecio=new Trapecio(base,altura, posXY, posXY, color, canvas);
        return trapecio;
    }
    
    public String colorRandom(){
        String color;
        int codigo=(int) (Math.random() * 7 + 1);
        switch(codigo){
            case 1: color="red";
                    break;
            case 2: color="black";
                    break;
            case 3: color="blue";
                    break;
            case 4: color="yellow";
                    break;
            case 5: color="green";
                    break;
            case 6: color="magenta";
                    break;
            case 7: color="orange";
                    break;
            default:color="black";
                    break;
        }
        return color;
    }
    
    public void crearFiguras(){
        for(int i=0;i<5;i++){
            cuadrados[i]=cuadradoRandom();
            circulos[i]=circuloRandom();
            trapecios[i]=trapecioRandom();
            triangulos[i]=trianguloRandom();
        }
    }
    
    public void mostrarFiguras(){
        for(int i=0;i<5;i++){
            cuadrados[i].makeVisible();
            circulos[i].makeVisible();
            trapecios[i].makeVisible();
            triangulos[i].makeVisible();
        }
    }
}
