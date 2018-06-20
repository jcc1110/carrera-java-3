package streams;
import java.util.ArrayList;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        // Definio una nombres de tipo String        
        List<String> nombres = new ArrayList();
        nombres.add("Anthony");
        nombres.add("Candy");
        nombres.add("Terry");
        nombres.add("Carlos");
        
        // Utilizo los filtros Streams
        System.out.println("Busco los nombres que comiencen con la letra C");
        nombres.stream().filter(x -> x.startsWith("C")).forEach(System.out::println);
        System.out.println("");
        
        // Ordeno la nombres
        System.out.println("Se ordena la lista");
        nombres.stream().sorted().forEach(System.out::println);
        System.out.println("");
        
        // Recorro y manipulo la nombres
        System.out.println("Manipula cada elemento");
        nombres.stream().map(String::toUpperCase).forEach(System.out::println);
        System.out.println("");
        
        // Limitar resultados
        System.out.println("Limito los resultados");
        nombres.stream().limit(2).forEach(System.out::println);
        System.out.println("");
        
        // Contar elementos
        System.out.println("Cantidad de elementos");
        System.out.println(nombres.stream().count());
    }
}
