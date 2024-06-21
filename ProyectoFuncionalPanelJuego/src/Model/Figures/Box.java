package Model.Figures;

import Model.Interaces.Drawable;

import java.awt.*;

public class Box {

    private int [] cord_X ={100,400,400,100};
    private int [] cord_Y ={150,150,450,450};
    private int points;

    public Box() {
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