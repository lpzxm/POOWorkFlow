package GUIA3;
import javax.swing.JOptionPane;

public class Empleado {
    private String nombre;
    private String apellido;

    //Metodo que permite mostrar el contenido de los atributos
    public void mostrardatos()
    {
        JOptionPane.showConfirmDialog(null,nombre +" "+apellido);
    }
    //Metodo que permite cambiar los datos de dlos atributos
    public void ingresodatos()
    {
        nombre=JOptionPane.showInputDialog("Ingrese el Nombre");
        apellido=JOptionPane.showInputDialog("Ingrese el Apellido");
    }

}
//Clase profesor que hereda de Empleado
class Profesor extends Empleado {
    int sueldo;
    public void mostrar2()
    {
        mostrardatos();//Metodo heredado de Empleado
        JOptionPane.showMessageDialog(null,sueldo);
    }

    public void ingreso2()
    {
        ingresodatos();//Metodo heredado de Empleado
        String s=JOptionPane.showInputDialog("Ingrese el sueldo");
        sueldo= Integer.parseInt(s);
    }

}
