import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String id;
    private List<Cuenta> cuentas;

    public Cliente(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.cuentas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCuenta(Cuenta cuenta){
        cuentas.add(cuenta);
    }

    public void mostrarCuentas(){
        System.out.println("Cuentas de " +cuentas+":");
        for (Cuenta cuenta : cuentas) {
            System.out.println(cuenta);
        }
    }
}
