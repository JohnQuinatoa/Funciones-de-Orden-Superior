package Model.Figures;

import Model.Interaces.Drawable;

import java.awt.*;

public class Triangle {

    private int [] cord_X ={250,370,130};
    private int [] cord_Y ={180,420,420};
    private int points;

    public Triangle() {
        points = cord_X.length;
    }

    public void draw(Graphics graphics, Drawable drawable) {
        drawable.draw(graphics);
    }

    public int[] getCord_X() {
        return cord_X;
    }

    public int[] getCord_Y() {
        return cord_Y;
    }

    public int getPoints() {
        return points;
    }

}