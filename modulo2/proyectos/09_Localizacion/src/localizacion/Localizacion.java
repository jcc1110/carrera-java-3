package localizacion;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Localizacion {
    public static void main(String[] args) {       
        // Imprimiendo los lenguajes soportados
        System.out.println("Lenguajes soportados:");
        Locale[] regiones = Locale.getAvailableLocales();
        for (Locale element : regiones) {
            System.out.println(element.getDisplayCountry() + ": " + element.toLanguageTag());
        }
        System.out.println("");
        
        // Estableciendo la localidad
        Locale locale = new Locale("en","US");
        Locale.setDefault(locale);
        
        // Obteniendo el Locale por defecto
        Locale lc = Locale.getDefault();
        
        // Mostrando los valores
        System.out.println("Información del Locale actual:");
        System.out.println("Código del país: " + lc.getCountry());
        System.out.println("Código del lenguaje: " + lc.getLanguage());
        System.out.println("País: " + lc.getDisplayCountry());
        System.out.println("Lenguaje: " + lc.getDisplayLanguage());
        System.out.println("Lenguaje / país: " + lc.getDisplayName());
        System.out.println("Código del país (ISO): " + lc.getISO3Country());
        System.out.println("Código del lenguaje (ISO): " + lc.getISO3Language());
        System.out.println("Códigos (lenguaje / país): " + lc.toLanguageTag());   
        System.out.println("");
        
        // Formateando las fechas
        System.out.println("Formateando las fechas con Locale");
        DateTimeFormatter fDay = DateTimeFormatter.ofPattern("EEEE");
        DateTimeFormatter fMonth = DateTimeFormatter.ofPattern("MMMM", Locale.CHINESE);
        System.out.println("Día: " + LocalDate.now().format(fDay));
        System.out.println("Mes: " + LocalDate.now().format(fMonth));
    }    
}
