package swinggraficos;
import java.awt.Container;
import javax.swing.JFrame;

public class SwingGraficos {
    public static void main(String[] args) {
        // Llamando a mi ventana
        JFrame f = new JFrame("Gráficos");
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
        // Contenedor de componentes
        Container cp = f.getContentPane();
        
        // Añado el contenido a la ventana
        cp.add(new Sol());
    }
}
