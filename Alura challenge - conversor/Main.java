import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione una opción:");
        System.out.println("1. Dolar a Peso Argentino");
        System.out.println("2. Dolar a Peso Colombiano");
        System.out.println("3. Dolar a Real Brasileño");
        System.out.println("4. Peso Argentino a Dolar");
        System.out.println("5. Peso Colombiano a Dolar");
        System.out.println("6. Real Brasileño a Dolar");
        System.out.println("7. Salir");
        System.out.print("Ingrese el número de opción deseada: ");
        int opcion = scanner.nextInt();

        System.out.print("Ingrese el valor a convertir: ");
        double valor = scanner.nextDouble();

        ExchangeRateConverter converter = new ExchangeRateConverter();
        double valorConvertido = 0;

        switch (opcion) {
            case 1:
                valorConvertido = converter.dolarAPesoArgentino(valor);
                System.out.println("Dólar Convertido a Peso Argentino: $" + valorConvertido);
                break;
            case 2:
                valorConvertido = converter.dolarAPesoColombiano(valor);
                System.out.println("Dólar Convertido a Peso Colombiano: $" + valorConvertido);
                break;
            case 3:
                valorConvertido = converter.dolarARealBrasileño(valor);
                System.out.println("Dólar Convertido a Real Brasileño: $" + valorConvertido);
                break;
            case 4:
                valorConvertido = converter.pesoArgentinoADolar(valor);
                System.out.println("Peso Argentino Convertido a Dólar: $" + valorConvertido);
                break;
            case 5:
                valorConvertido = converter.pesoColombianoADolar(valor);
                System.out.println("Peso Colombiano Convertido a Dólar: $" + valorConvertido);
                break;
            case 6:
                valorConvertido = converter.realBrasileñoADolar(valor);
                System.out.println("Real Brasileño Convertido a Dólar: $" + valorConvertido);
                break;
            case 7:
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}