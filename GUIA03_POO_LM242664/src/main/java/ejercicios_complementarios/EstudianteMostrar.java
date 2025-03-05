package ejercicios_complementarios;

public class EstudianteMostrar {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Juan", "Pérez", "A12345");
        estudiante.agregarMaterias("Matemáticas", "Física", "Química", "Historia", "Programación");

        System.out.println(estudiante.getInformation());
    }
}
