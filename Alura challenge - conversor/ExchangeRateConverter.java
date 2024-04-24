import java.util.HashMap;
import java.util.Map;

public class ExchangeRateConverter {
    private final Map<String, Double> exchangeRates;

    public ExchangeRateConverter() {
        exchangeRates = new HashMap<>();
        exchangeRates.put("USD-ARS", 98.5);
        exchangeRates.put("USD-COP", 3800.0);
        exchangeRates.put("USD-BRL", 5.3);
    }

    public double dolarAPesoArgentino(double valor) {
        return valor * exchangeRates.get("USD-ARS");
    }

    public double dolarAPesoColombiano(double valor) {
        return valor * exchangeRates.get("USD-COP");
    }

    public double dolarARealBrasileño(double valor) {
        return valor * exchangeRates.get("USD-BRL");
    }

    public double pesoArgentinoADolar(double valor) {
        return valor / exchangeRates.get("USD-ARS");
    }

    public double pesoColombianoADolar(double valor) {
        return valor / exchangeRates.get("USD-COP");
    }

    public double realBrasileñoADolar(double valor) {
        return valor / exchangeRates.get("USD-BRL");
    }
}