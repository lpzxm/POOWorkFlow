package ejercicios_complementarios.CalculadoraAvanzada;

public class CalculadoraAvanzada {
    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public int factorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El factorial no esta permitido para numeros negativos");
        }
        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public double opuesto(double numero) {
        return -numero;
    }
}
