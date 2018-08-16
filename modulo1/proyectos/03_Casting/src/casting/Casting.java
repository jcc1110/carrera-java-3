package casting;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Casting {
    public static void main(String[] args) {
        // Declarando las variables necesarias
        byte a = 12;
        Byte b = 10;
        Double c = 12.9458957;
        
        // Realizando el Casting primitivos y referenciales
        // Implicitos
        Short aConvertido = (short)a;
        Long bConvertido = b.longValue();
        // Explicitos
        Integer cConvertido = c.intValue();
        
        // Formateo de decimales
        NumberFormat formatoDec = new DecimalFormat("#0.00");
        System.out.println("Formateando los decimales: " + formatoDec.format(c));
        
        // Presentando los valores
        System.out.println("El valor Short es: " + aConvertido + " - " + aConvertido.getClass());
        System.out.println("El valor Long es: " + bConvertido + " - " + bConvertido.getClass());
        System.out.println("El valor Integer es: " + cConvertido + " - " + cConvertido.getClass());
    }
}
