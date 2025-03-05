package ejercicios_complementarios.sistemaAnimales;

class Animal {
    protected String nombre;
    protected int edad;
    protected String alimento;

    public Animal(String nombre, int edad, String alimento) {
        this.nombre = nombre;
        this.edad = edad;
        this.alimento = alimento;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Alimento: " + alimento);
    }
}

class Gallo extends Animal {
    private String colorPlumas;

    public Gallo(String nombre, int edad, String alimento, String colorPlumas) {
        super(nombre, edad, alimento);
        this.colorPlumas = colorPlumas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Color de Plumas: " + colorPlumas);
    }
}

class Perro extends Animal {
    private String colorPelaje;

    public Perro(String nombre, int edad, String alimento, String colorPelaje) {
        super(nombre, edad, alimento);
        this.colorPelaje = colorPelaje;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Color de Pelaje: " + colorPelaje);
    }
}

class Gato extends Animal {
    private String colorOjos;

    public Gato(String nombre, int edad, String alimento, String colorOjos) {
        super(nombre, edad, alimento);
        this.colorOjos = colorOjos;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Color de Ojos: " + colorOjos);
    }
}

class Hamster extends Animal {
    private int cantidadPulgas;

    public Hamster(String nombre, int edad, String alimento, int cantidadPulgas) {
        super(nombre, edad, alimento);
        this.cantidadPulgas = cantidadPulgas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Cantidad de Pulgas: " + cantidadPulgas);
    }
}

public class Main {
    public static void main(String[] args) {
        Gallo gallo = new Gallo("Pico", 3, "Granos", "Rojo");
        Perro perro = new Perro("Max", 5, "Croquetas", "Marrón");
        Gato gato = new Gato("Michi", 2, "Pescado", "Verde");
        Hamster hamster = new Hamster("Bolita", 1, "Semillas", 10);

        System.out.println("\nDatos de los animales:");
        gallo.mostrarDatos();
        System.out.println("-----------------");
        perro.mostrarDatos();
        System.out.println("-----------------");
        gato.mostrarDatos();
        System.out.println("-----------------");
        hamster.mostrarDatos();
    }
}

