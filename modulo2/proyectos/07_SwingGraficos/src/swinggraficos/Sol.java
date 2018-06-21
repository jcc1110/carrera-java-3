package swinggraficos;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Sol extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        // Estableciendo el color
        g.setColor(Color.ORANGE);
        
        // Rellenando el Ovalo
        g.fillOval(100, 100, 200, 200);
        
        // Creando las lineas
        for (double i=0; i< (2 * Math.PI); i+=0.1) {
            int xEnd = (int)(200 + 150 * Math.cos(i));
            int yEnd = (int)(200 + 150 * Math.sin(i));
            g.drawLine(200, 200, xEnd, yEnd);
        }
        
        // Estableciendo el color
        g.setColor(Color.BLACK);
        
        // Creando un arco
        g.drawArc(150, 150, 100, 100, 230, 80);
        
        // Creando ovalo
        g.fillOval(150, 150, 20, 20);
        
        // Rellenando el Ovalo
        g.fillOval(230, 150, 20, 20);
    }
}
