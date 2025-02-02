package Guia2.ejerciciosComplementarios;

import javax.swing.*;

public class SentenciaWhileModificado {
    public static void main(String[] args)
    {
        String leer;
        double sueldo, mayor=Double.MIN_VALUE,menor=Double.MAX_VALUE;
        int i=1, numEmpleados = 0, contador=0;



        while(numEmpleados<=0) {
            try {
                leer = JOptionPane.showInputDialog("Ingresa el numero de empleados a ingresar:");
                numEmpleados = Integer.parseInt(leer);

                if (numEmpleados <= 0) {
                    JOptionPane.showMessageDialog(null, "El número de empleados debe ser mayor a 0.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "El número de empleados debe ser mayor a 0.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        while(i<=numEmpleados) {
            sueldo = -1;

            while (sueldo < 0) {
                leer= JOptionPane.showInputDialog("Ingrese el Sueldo del Empleado " +i);
                sueldo= Double.parseDouble(leer);

                if (sueldo <=0) {
                    JOptionPane.showMessageDialog(null, "El sueldo no puede ser negativo. Inténtelo nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            if(sueldo>300) {
                contador = contador + 1;
            } else if(sueldo>mayor){
                mayor=sueldo;
            } else if (sueldo<menor){
                menor=sueldo;
            }
            i=i+1;
        }
        JOptionPane.showMessageDialog(null, " El sueldo Mayor es de $: " + mayor +
                "\nEl sueldo Menor es de $: " + menor +
                "\n"+ contador + " Empleado/s tienen un sueldo mayor de $300");
    }

}
