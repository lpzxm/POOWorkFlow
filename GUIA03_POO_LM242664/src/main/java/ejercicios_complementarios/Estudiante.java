package ejercicios_complementarios;
import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String carnet;
    private List<String> materias;

    Estudiante (String nombre, String apellido, String carnet) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carnet = carnet;
        this.materias = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        if (!nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede estar vacío");
        }
    }

    public void setApellido(String apellido) {
        if (!apellido.trim().isEmpty()) {
            this.apellido = apellido;
        } else {
            System.out.println("El apellido no puede estar vacío");
        }
    }

    public void setCarnet(String carnet) {
        if (!carnet.trim().isEmpty()) {
            this.carnet = carnet;
        } else {
            System.out.println("El carnet no puede estar vacío");
        }
    }

    public void agregarMaterias(String... materias) {
        if (this.materias.size() + materias.length <= 5) {
            for (String materia : materias) {
                this.materias.add(materia);
            }
        } else {
            System.out.println("No puedes inscribir más de 5 materias");
        }
    }

    public String getInformation() {
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nCarnet: " + carnet + "\nMaterias: " + materias;
    }


}
