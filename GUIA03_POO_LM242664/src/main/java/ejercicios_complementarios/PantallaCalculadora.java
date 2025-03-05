package ejercicios_complementarios;
import ejercicios_complementarios.CalculadoraAvanzada.CalculadoraAvanzada;
import ejercicios_complementarios.CalculadoraBasica.CalculadoraBasica;


public class PantallaCalculadora {
    public static void main(String[] args) {
        CalculadoraBasica cbasica = new CalculadoraBasica();
        CalculadoraAvanzada cavanzada = new CalculadoraAvanzada();

        System.out.println("Suma: " + cbasica.suma(5, 3));
        System.out.println("Resta: " + cbasica.resta(5, 3));
        System.out.println("Multiplicación: " + cbasica.multiplicacion(5, 3));
        System.out.println("División: " + cbasica.division(6, 3));

        System.out.println("Potencia: " + cavanzada.potencia(2, 3));
        System.out.println("Factorial: " + cavanzada.factorial(4));
        System.out.println("Opuesto: " + cavanzada.opuesto(-5));
    }
}
