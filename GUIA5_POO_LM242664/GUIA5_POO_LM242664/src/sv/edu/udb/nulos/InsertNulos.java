package sv.edu.udb.nulos;
import java.sql.ResultSet;
import java.sql.SQLException;
import sv.edu.udb.util.Conexion;


public class InsertNulos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here

        Conexion con = new Conexion();
        //String sql1 = "insert into empleados values(8,'','Torres',null)";
        String sql2 = "insert into empleados values(10,'','Torres',null);";
        String sql3 = "insert into empleados values(6,null,'Rodriguez',null);";

//
        //con.setQuery(sql1);
        con.setQuery(sql2);
        con.setQuery(sql3);

        String sql = "select Nombre from empleados ";
        ResultSet rs ;

        con.setRs(sql);
        rs= con.getRs();

        String nombre;

        while (rs.next()){
            nombre=rs.getString(1);

            if (nombre == null){
                System.out.println("Nombre 'Null': " + nombre);
            }else if(nombre.equals("")){
                System.out.println("Nombre Vacio: " + nombre);
            }else{
                System.out.println("Nombre Con Datos: " + nombre);
            }


        }
        con.cerrarConexion();
    }

}
