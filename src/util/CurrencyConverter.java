package util;

public class CurrencyConverter {
    
    public static double dollarToReal(double dollarPrice, double dollarQuantity) {
        return (dollarPrice * dollarQuantity) + (dollarPrice * dollarQuantity * 0.06);
    }

    
}
