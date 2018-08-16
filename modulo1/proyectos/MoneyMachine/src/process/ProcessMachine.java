package process;

public class ProcessMachine {
    // Properties
    private final byte dolar = 100;
    private final byte quarter = 25;
    private final byte dime = 10;
    private final byte nickel = 5;
    private final int centsReceived;
    
    // Constructor
    public ProcessMachine(int centsReceived) {
        this.centsReceived = centsReceived;
    }
    
    // Change Money
    public String changeMoney() {
        // Variables locales
        StringBuilder moneyReturn = new StringBuilder();
        int current = this.centsReceived;
        int dolars = 0;
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int cents = 0;
        
        // Process Change Money
        
        // Dolars
        while( (current - this.dolar) >= 0 ) {
            dolars++;
            current -= this.dolar;
        }
        // Quarter
        while( (current - this.quarter) >= 0 ) {
            quarters++;
            current -= this.quarter;
        }
        // Dime
        while( (current - this.dime) >= 0 ) {
            dimes++;
            current -= this.dime;
        }
        // Nickel
        while( (current - this.nickel) >= 0 ) {
            nickels++;
            current -= this.nickel;
        }
        // Cent
        cents = current;
        
        // Return Message
        moneyReturn
            .append("You introduced ")
            .append(this.centsReceived)
            .append(" cent(s), your return is ")
            .append(dolars).append(" dolar(s) ")
            .append(quarters).append(" quarter(s) ")
            .append(dimes).append(" dime(s) ")
            .append(nickels).append(" cent(s).");
        return moneyReturn.toString();
    }
}
