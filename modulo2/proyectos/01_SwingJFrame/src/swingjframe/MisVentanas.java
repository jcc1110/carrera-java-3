package swingjframe;
import javax.swing.JFrame;

public class MisVentanas extends JFrame {
    // Constructor de la clase
    public MisVentanas() {
        // Utilizando los métodos de JFrame
        super("Mi Segunda Ventana");
        super.setSize(400, 400);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
    }
}
