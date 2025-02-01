package Guia1.ejercicios_complementarios;

import javax.swing.*;

public class InformacionPersonalWindowed {
    public static void main(String[] args) {
        String nombre, apellidos, carrera;
        int edad;

        nombre = JOptionPane.showInputDialog("Ingrese sus nombres");
        apellidos = JOptionPane.showInputDialog("Ingrese sus apellidos");
        carrera = JOptionPane.showInputDialog("Ingrese su carrera actual");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));

        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nApellidos: " + apellidos + "\nEdad: " + edad + "\nCarrera que cursa: " + carrera);
    }
}
