package gettersetter;

public class Persona {
    // Atributos
    private String nombre;
    private String apellido;
    private int edad;

    // Constructor
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public String nombreCompleto() {
        return this.getNombre() + " " + this.getApellido() + " tiene " + this.getEdad() + " años";
    }

    // Métodos: Get/Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
