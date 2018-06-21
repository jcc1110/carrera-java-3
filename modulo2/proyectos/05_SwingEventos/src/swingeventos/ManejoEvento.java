package swingeventos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ManejoEvento implements ActionListener {
    private JTextField texto;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // Mostrando un mensaje de saludo
        JOptionPane.showMessageDialog(null, "¡Hola mundo!" + this.texto.getText());
    }

    public ManejoEvento(JTextField texto) {
        this.texto = texto;
    }
    
    public ManejoEvento() { }
}
