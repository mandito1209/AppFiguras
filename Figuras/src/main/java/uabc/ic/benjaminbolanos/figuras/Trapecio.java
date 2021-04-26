package uabc.ic.benjaminbolanos.figuras;

import java.awt.Polygon;
import java.awt.Rectangle;

/**
 *
 * @author Benjamin Bolaños
 * @version 2021.04.25
 */
public class Trapecio {
    private int base1;
    private int altura;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;
    private Canvas canvas;
    
    public Trapecio(int base1, int altura, int xPosition, int yPosition, String color, Canvas canvas){
        this.base1=base1;
        this.color=color;
        this.canvas=canvas;
        this.xPosition=xPosition;
        this.yPosition=yPosition;
        this.altura=altura;
    }
    
    public void makeVisible()
    {
        isVisible = true;
        draw();
    }
    
    public void makeInvisible()
    {
        erase();
        isVisible = false;
    }
    
    public void changeColor(String newColor)
    {
        color = newColor;
        draw();
    }
    
    private void draw()
    {
        if(isVisible) {
            int[] xPos={xPosition,xPosition,xPosition+altura,xPosition+altura};
            int[] yPos={yPosition,yPosition+base1,yPosition-Math.round(base1/8)+1,yPosition+base1+Math.round(base1/8)+1};
            canvas.draw(this, color,
                        new Polygon(xPos, yPos, 4));
            canvas.wait(10);
        }
    }
    
    private void erase()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
}
    
