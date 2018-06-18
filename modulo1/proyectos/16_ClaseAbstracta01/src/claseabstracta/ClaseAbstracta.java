package claseabstracta;

public class ClaseAbstracta {
    public static void main(String[] args) {
        // Instancia mi clase Circulo y Rectangulo
        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();
        
        // Utilizo los métodos implementados
        System.out.println("El area de un circulo es: " + circulo.calcularArea(2, 5));
        System.out.println("El area de un rectángulo es: " + rectangulo.calcularArea(46, 50));
        
        // Dibujando las figuras geometricas
        circulo.dibujar();
        rectangulo.dibujar();
    }    
}
