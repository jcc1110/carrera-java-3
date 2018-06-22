package swingeventos;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SwingEventos {
    public static void main(String[] args) {
        // Llamando a mi ventana
        JFrame f = new JFrame("Manejo de Eventos");
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
        // Contenedor de componentes
        Container cp = f.getContentPane();
        
        // Layout a utilizar
        cp.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        // Componentes a nueva ventana
        JLabel etiqueta = new JLabel("Nombre:");
        JTextField texto = new JTextField(20);
        JButton boton = new JButton("Saludar");
        
        // Implementación tradicional
        //boton.addActionListener(new ManejoEvento(texto));
        
        /*boton.addActionListener(new ManejoEvento() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensaje;
                String valor = texto.getText();
                mensaje = (!valor.isEmpty()) ? "Hola, " + valor : "¡Hola mundo!";  
                JOptionPane.showMessageDialog(boton, mensaje);
            }
        });*/
        
        // Implementación de la interfaz requerida
        ActionListener manejoEvento = e -> {
            String mensaje;
            String valor = texto.getText();
            mensaje = (!valor.isEmpty()) ? "Hola, " + valor : "¡Hola mundo!";  
            JOptionPane.showMessageDialog(boton, mensaje);
        };
        boton.addActionListener(manejoEvento);
        
        // Añado mis componentes a la ventana
        cp.add(etiqueta);
        cp.add(texto);
        cp.add(boton);
    }
}
