package View;

import Controler.Controller;

import java.awt.*;
import java.awt.event.*;
import java.util.Locale;

import javax.swing.*;

public class Window extends JFrame{
    JPanel lienzo = new JPanel();
    Controller controller = new Controller();
    static boolean isPressedTriangle = false;
    static boolean isPressedSquared = false;
    static boolean isPressedCircle = false;

    public Window() {
        super("Figuras");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);

        lienzo.setBackground(new Color(10, 10, 10));
        lienzo.setLayout(null);

        // Crear el botón Limpiar
        JButton clean = new JButton("Limpiar ");
        clean.setBounds(170, 35, 160, 60); // Establecer la ubicación y el tamaño
        clean.setFont(new Font("Brush Script", Font.ITALIC, 20));
        clean.setBackground(new Color(245, 245, 220));
        lienzo.add(clean);

        // Agregar un Listener para el boton Triangulo
        clean.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isPressedTriangle = false;
                isPressedSquared = false;
                isPressedCircle = false;
                repaint();
            }
        });

        // Crear el botón Triangulo
        JButton triangle = new JButton("TRIÁNGULO ");
        triangle.setBounds(520, 65, 160, 100); // Establecer la ubicación y el tamaño
        triangle.setFont(new Font("Brush Script", Font.ITALIC, 20));
        triangle.setBackground(new Color(135,206,235));
        triangle.setForeground(Color.BLACK);
        lienzo.add(triangle);

        // Agregar un Listener para el boton Triangulo
        triangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isPressedTriangle = true;
                isPressedSquared = false;
                isPressedCircle = false;
                repaint();
            }
        });

        // Crear el botón Cuadrdo
        JButton squared = new JButton("CUADRADO ");
        squared.setBounds(520, 235, 160, 100); // Establecer la ubicación y el tamaño
        squared.setFont(new Font("Brush Script", Font.ITALIC, 20));
        squared.setBackground(new Color(250, 128, 144));
        squared.setForeground(Color.WHITE);
        lienzo.add(squared);

        // Agregar un Listener para el boton Cuadrado
        squared.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isPressedSquared = true;
                isPressedTriangle = false;
                isPressedCircle = false;
                repaint();
            }
        });

        // Crear el botón Circulo
        JButton circle = new JButton("CÍRCULO ");
        circle.setBounds(520, 405, 160, 100); // Establecer la ubicación y el tamaño
        circle.setFont(new Font("Brush Script", Font.ITALIC, 20));
        circle.setBackground(new Color(255, 223, 0));
        lienzo.add(circle);

        // Agregar un Listener para el boton Circulo
        circle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isPressedCircle = true;
                isPressedTriangle = false;
                isPressedSquared = false;
                repaint();
            }
        });

        setContentPane(lienzo);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        controller.draw(g);
    }

    public static boolean isIsPressedTriangle() {
        return isPressedTriangle;
    }

    public static boolean isIsPressedSquared() {
        return isPressedSquared;
    }

    public static boolean isIsPressedCircle() {
        return isPressedCircle;
    }
}
