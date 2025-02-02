package Guia2.ejerciciosComplementarios;

import javax.swing.*;

public class VerificarEstadoAlumno {
    public static void main(String[] args) {
        // TODO code application logic here
        while (true){
            try{
                String nombre= JOptionPane.showInputDialog("Ingresa el nombre del alumno a verificar la nota");
                String nota= JOptionPane.showInputDialog("Ingresa la nota del alumno ingresado: ");
                double notaE= Double.parseDouble(nota);

                if (notaE < 0 || notaE > 10){
                    JOptionPane.showMessageDialog(null,"Nota Invalida, no se aceptan numeros negativos","Error",JOptionPane.ERROR_MESSAGE);
                } else if (notaE >= 6.50 && notaE <= 6.99){
                    JOptionPane.showMessageDialog(null, "El alumno con el nombre: "+nombre+" tiene derecho a realizar un examen de suficiencia para aprobar dicha materia", "Derecho a aprobar materia", JOptionPane.INFORMATION_MESSAGE);
                }else if (notaE >= 7.0) {
                    JOptionPane.showMessageDialog(null, "El alumno con el nombre: "+nombre+" aprobo dicha materia con una nota de: " + notaE, "Aprobado", JOptionPane.INFORMATION_MESSAGE);
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
            }
        }
    }
}
