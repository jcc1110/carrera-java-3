package genericos;

public class ClaseGenerica<T> {
    // Atributo generico
    T atributo;
    
    // Constructor
    public ClaseGenerica(T _atributo) {
        this.atributo = _atributo;
    }
    
    // Método para obtener el tipo de dato
    public void obtenerTipo() {
        System.out.println(
                "T es: "+ this.atributo.getClass().getName() +" y su valor es "+ this.atributo);
    }
}
