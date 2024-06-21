package Model.Figures;

import Model.Interaces.Drawable;

import java.awt.*;

public class Squared {
    private int [] cord_X ={130,370,370,130};
    private int [] cord_Y ={180,180,420,420};
    private int points;

    public Squared() {
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