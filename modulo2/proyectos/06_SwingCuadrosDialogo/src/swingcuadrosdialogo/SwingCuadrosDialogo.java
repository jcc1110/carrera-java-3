package swingcuadrosdialogo;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SwingCuadrosDialogo {
    public static void main(String[] args) {
        // Llamando a mi ventana
        JFrame f = new JFrame("Cuadros de Diálogo");
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
        // Contenedor de componentes
        Container cp = f.getContentPane();
        
        // Layout a utilizar
        cp.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        // Componentes a nueva ventana
        JButton avisos = new JButton("Avisos");
        JButton confirmar = new JButton("Confirmación");
        JButton confirmar2 = new JButton("Confirmación 2");
        
        // Eventos
        ActionListener eventoAvisos = e -> {
            JOptionPane.showMessageDialog(
                avisos, 
                "Mensaje de Información",
                "INFORMATION_MESSAGE", 
                JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(
                avisos, 
                "Mensaje de Advertencia",
                "WARNING_MESSAGE", 
                JOptionPane.WARNING_MESSAGE);            
            JOptionPane.showMessageDialog(
                avisos, 
                "Mensaje de Error", 
                "ERROR_MESSAGE", 
                JOptionPane.ERROR_MESSAGE);            
            JOptionPane.showMessageDialog(
                avisos, 
                "Pregunta", 
                "QUESTION_MESSAGE", 
                JOptionPane.QUESTION_MESSAGE);
        };
        avisos.addActionListener(eventoAvisos);
        
        ActionListener eventoConfirmar = e -> {
            String nombre = JOptionPane.showInputDialog(confirmar, "¿Cuál es tu nombre?", "Anthony");
            System.out.println(nombre);
        };
        confirmar.addActionListener(eventoConfirmar);
        
        ActionListener eventoConfirmar2 = e -> {
            int respuesta = JOptionPane.showConfirmDialog(
                confirmar2, 
                "¿Esta seguro/a de realizar esta acción?", 
                "Acción a realizar", 
                JOptionPane.YES_NO_CANCEL_OPTION, 
                JOptionPane.WARNING_MESSAGE);
            System.out.println(respuesta);
        };
        confirmar2.addActionListener(eventoConfirmar2);
        
        // Añado mis componentes a la ventana
        cp.add(avisos);
        cp.add(confirmar);
        cp.add(confirmar2);
    }
}
