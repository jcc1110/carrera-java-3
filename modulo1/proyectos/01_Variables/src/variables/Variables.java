package variables;

public class Variables {
    // Declaración de mis variables globales
    static byte a = 7;
    static int b = 5;
    
    // Declaración de una constante
    static final double PI = 3.14;

    public static void main(String[] args) {
        // Declaración de mi variable local
        Integer c = 1;
        
        // Presentación de los valores
        System.out.println("El valor de mi variable global es: " + a);
        System.out.println("El valor de mi variable local es: " + b);
        System.out.println("El valor de mi variable referencial es: " + c);
        System.out.println("El valor de mi constante es: " + PI);
        
        // Modificar mi variable global
        a = 12;
        
        // Modificar mi variable local
        c = 20;
        
        // Presentación de los valores
        System.out.println("El valor de mi variable global modificada es: " + a);
        System.out.println("El valor de mi variable local modificada es: " + c);
    }
}
