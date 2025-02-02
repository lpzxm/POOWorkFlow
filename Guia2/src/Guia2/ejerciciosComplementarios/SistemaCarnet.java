package Guia2.ejerciciosComplementarios;

import javax.swing.*;
import java.util.*;
import java.util.Scanner;


public class SistemaCarnet {
    public static void limpiarPantalla() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //Declarando HashMap
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        //Agregando elementos
        hmap.put(1, "Jose Adrian Lopez Medina - LM242664");
        hmap.put(2, "Juan Pedro Hernandez Gomez - HG242622");
        hmap.put(3, "Luis Francisco Garcia Pereira - GP235678");
        hmap.put(4, "Ariana Michelle Sibrian Nuila - SN234567");
        hmap.put(5, "Marcos Eduardo Montano Jocote - MJ225678");

        int opc;
        Scanner sc = new Scanner(System.in);
        do {
            limpiarPantalla();
            System.out.println("Bienvenido al sistema de manejo de alumnos de la materia de POO");
            System.out.println("Elige una de las siguientes opciones:");
            System.out.println("1 - Ingreso de estudiante.");
            System.out.println("2 - Ver estudiante.");
            System.out.println("3 - Buscar Estudiante.");
            System.out.println("4 - Salir.");
            System.out.println(" ");
            System.out.print("Ingresa la opcion que deseas utilizar: ");

            while (!sc.hasNextInt()) {
                System.out.println("⚠️ Error: Debes ingresar un número válido.");
                sc.next();
                System.out.print("➡️ Ingresa una opción válida: ");
            }
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Registro de estudiante nuevo:");
                    sc.nextLine();
                    System.out.print("Ingrese el nombre completo y carnet del estudiante: ");
                    String nuevoEstudiante = sc.nextLine();
                    int nuevoID = hmap.size() + 1;
                    hmap.put(nuevoID, nuevoEstudiante);
                    System.out.println("Estudiante agregado con exito");
                    break;

                case 2:
                    //Mostrando contenido usando Iterator
                    System.out.println("Listado de estudiantes dentro de la materia de POO:");
                    for (Map.Entry<Integer, String> entry : hmap.entrySet()) {
                        System.out.println("ID: "+entry.getKey()+" - "+entry.getValue());
                    }
                    break;
                case 3:
                    System.out.println("Busqueda de estudiante");
                    System.out.print("Ingrese el ID del estudiante a buscar: ");
                    int buscarId = sc.nextInt();
                    if (hmap.containsKey(buscarId)) {
                        System.out.println("Estudiante encontrado: " + hmap.get(buscarId));
                    } else {
                        System.out.println("Estudiante no encontrado");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Error, opcion inválida, intenta nuevamente.");
            }

            if (opc != 4) {
                System.out.print("¿Deseas realizar otra acción? (S/N): ");
                sc.nextLine();
                String respuesta = sc.nextLine().trim().toLowerCase();
                if (!respuesta.equals("s")) {
                    opc = 4;
                }
            }
        } while (opc != 4);
        System.out.println("Fin del programa");
        sc.close();
    }

}
