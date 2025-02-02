package Guia2.ejerciciosComplementarios;

import javax.swing.*;
import java.util.Random;

public class TiendaDescuentos {
    public static void main(String[] args) {
        while (true){
            Random random = new Random();
            int numeroAleatorio = random.nextInt(3) + 1;
            try{
                String costo= JOptionPane.showInputDialog("Ingresa el total a pagar para aplicar a un descuento");
                switch (numeroAleatorio){
                    case 1:
                        double descuento=Double.parseDouble(costo)*0.10;
                        double total=Double.parseDouble(costo)-descuento;
                        JOptionPane.showMessageDialog(null,"Felicidades, obtuviste una bolita roja. Tu descuento es de 10%. Tu total a pagar es: "+total+". Dile al personal respectivo sobre tu descuento!!","Descuento",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 2:
                        double descuento2 =Double.parseDouble(costo)*0.05;
                        double total2=Double.parseDouble(costo)- descuento2;
                        JOptionPane.showMessageDialog(null,"Felicidades, obtuviste una bolita verde. Tu descuento es de 5%. Tu total a pagar es: "+total2+". Dile al personal respectivo sobre tu descuento!!","Descuento",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null,"Obtuviste una bolita blanca, lastimosamene no recibiste ningun descuento, gracias por participar!","Descuento",JOptionPane.INFORMATION_MESSAGE);
                    default:
                        JOptionPane.showMessageDialog(null,"Error en algun dato de entrada","Error",JOptionPane.ERROR_MESSAGE);
                        break;

                }
            }catch(Exception e){
                System.out.println("Error en algun dato de entrada");
                JOptionPane.showMessageDialog(null,"Error en algun dato de entrada","Error",JOptionPane.ERROR_MESSAGE);
                String seleccion=(String) JOptionPane.showInputDialog(
                        null,
                        "Desea Salir",
                        "Seleccione una opcion",
                        JOptionPane.QUESTION_MESSAGE,
                        null, // null para icono defecto
                        new Object[] { "Si", "No" },
                        "si");
                if (seleccion.equals("Si")){
                    System.exit(0);
                    break;
                }
            }//fin de catch
        }//fin de while
    }
}
