package Guia1;

public class LecturaParametros {
    public static void main(String[] args) {
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                System.out.println("Parametro: " + args[i]);
            }
        } else {
            System.out.println("No se ingresaron parametros");
        }
    }
}
