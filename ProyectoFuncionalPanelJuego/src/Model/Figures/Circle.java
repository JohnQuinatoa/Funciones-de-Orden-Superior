package Model.Figures;

import Model.Interaces.Drawable;

import java.awt.*;

public class Circle {

    private int x;
    private int y;
    private int width;
    private int height;

    public Circle() {
        this.x = 130;
        this.y = 180;
        this.width = 240;
        this.height = 240;
    }

    public void draw(Graphics graphics, Drawable drawable) {
        drawable.draw(graphics);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

}