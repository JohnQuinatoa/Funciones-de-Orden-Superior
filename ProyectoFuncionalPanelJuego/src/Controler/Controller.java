package Controler;

import Model.Figures.Circle;
import Model.Figures.Box;
import Model.Figures.Squared;
import Model.Figures.Triangle;
import View.Window;

import java.awt.*;

public class Controller {

    Box box = new Box();
    Squared squared = new Squared();
    Triangle triangle = new Triangle();
    private int width = squared.getCord_X()[1] - squared.getCord_X()[0];
    Circle circle = new Circle();

    public Controller() {

    }

    public void draw(Graphics graphics){

        box.draw(graphics, graphics1 -> {
            graphics1.setColor(Color.WHITE);
            graphics1.drawPolygon(box.getCord_X(), box.getCord_Y(), box.getPoints());
        });

        if(Window.isIsPressedTriangle()){

            triangle.draw(graphics, graphics1 -> {
                graphics1.setColor(Color.BLUE);
                graphics1.fillPolygon(triangle.getCord_X(), triangle.getCord_Y(), triangle.getPoints());
            });

        }else if(Window.isIsPressedSquared()){

            squared.draw(graphics, graphics1 -> {
                graphics1.setColor(Color.RED);
                graphics1.fillPolygon(squared.getCord_X(), squared.getCord_Y(), squared.getPoints());
            });

        }else if(Window.isIsPressedCircle()){

            circle.draw(graphics, graphics1 -> {
                graphics1.setColor(Color.YELLOW);
                graphics1.fillOval(circle.getX(), circle.getY(), circle.getWidth(), circle.getHeight());
            });

        }

    }

}