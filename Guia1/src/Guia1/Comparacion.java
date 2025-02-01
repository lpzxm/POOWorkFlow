package Guia1;
import javax.swing.JOptionPane;

public class Comparacion {
    public static void main(String[] args) {
        String primernumero;
        String segundonumero;
        String resultado;
        int numero1;
        int numero2;

        primernumero = JOptionPane.showInputDialog("Digite el primer entero");
        segundonumero = JOptionPane.showInputDialog("Digite el segundo entero");

        numero1 = Integer.parseInt(primernumero);
        numero2 = Integer.parseInt(segundonumero);

        resultado = "";
        if (numero1 == numero2) {
            resultado = resultado + numero1 + "==" + numero2;
        } else if (numero1 != numero2) {
            resultado= resultado + numero1 + " != " + numero2;
        } else if (numero1 < numero2) {
            resultado= resultado + "\n" + numero1 + " < " + numero2;
        } else if (numero1 > numero2) {
            resultado= resultado + "\n" + numero1 + " > " + numero2;
        } else if (numero1 <= numero2) {
            resultado= resultado + "\n" + numero1 + " <= " + numero2;
        } else if (numero1 >= numero2) {
            resultado= resultado + "\n" + numero1 + " >= " + numero2;
        }

        JOptionPane.showConfirmDialog(null, resultado,"Resultado",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
