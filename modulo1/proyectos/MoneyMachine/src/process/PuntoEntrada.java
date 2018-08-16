package process;

public class PuntoEntrada {
    public static void main(String[] args) {
        
        ProcessMachine pm = new ProcessMachine(167);
        System.out.println(pm.changeMoney());
        
    }
}
