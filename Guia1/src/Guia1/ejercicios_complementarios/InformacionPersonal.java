package Guia1.ejercicios_complementarios;

import java.util.Scanner;

public class InformacionPersonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, apellidos, carrera;
        int edad;

        System.out.print("Ingrese sus nombres: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese sus apellidos: ");
        apellidos = sc.nextLine();
        System.out.print("Ingrese su carrera actual: ");
        carrera = sc.nextLine();
        System.out.print("Ingrese su edad: ");
        edad = sc.nextInt();
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera que cursa: " + carrera);
    }
}
