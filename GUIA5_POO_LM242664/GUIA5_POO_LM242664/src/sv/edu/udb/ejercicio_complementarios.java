package sv.edu.udb;

import javax.swing.*;
import java.sql.*;

public class ejercicio_complementarios {
    private static final String URL = "jdbc:mysql://localhost:3306/ejercicio_comp_lm242664";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        while (true) {
            String opcion = JOptionPane.showInputDialog(null,
                    "Seleccione una opción:\n1. CRUD Alumno\n2. CRUD Materia\n3. CRUD Alumno-Materia\n4. Salir",
                    "Menú", JOptionPane.QUESTION_MESSAGE);
            switch (opcion) {
                case "1": crudAlumno(); break;
                case "2": crudMateria(); break;
                case "3": crudAlumnoMateria(); break;
                case "4": System.exit(0);
                default: JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        }
    }

    private static void crudAlumno() {
        String opcion = JOptionPane.showInputDialog("1. Agregar\n2. Actualizar\n3. Eliminar\n4. Listar");
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
            switch (opcion) {
                case "1":
                    int id = Integer.parseInt(JOptionPane.showInputDialog("ID Alumno:"));
                    String nombre = JOptionPane.showInputDialog("Nombre:");
                    String apellido = JOptionPane.showInputDialog("Apellido:");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad:"));
                    String direccion = JOptionPane.showInputDialog("Dirección:");
                    String sql = "INSERT INTO alumno VALUES (?, ?, ?, ?, ?)";
                    PreparedStatement ps = con.prepareStatement(sql);
                    ps.setInt(1, id);
                    ps.setString(2, nombre);
                    ps.setString(3, apellido);
                    ps.setInt(4, edad);
                    ps.setString(5, direccion);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Alumno agregado correctamente");
                    break;
                case "2":
                    int idUpdate = Integer.parseInt(JOptionPane.showInputDialog("ID del Alumno a actualizar:"));
                    String nombreUpdate = JOptionPane.showInputDialog("Nuevo Nombre:");
                    String sqlUpdate = "UPDATE alumno SET Nombre=? WHERE Cod_alumno=?";
                    ps = con.prepareStatement(sqlUpdate);
                    ps.setString(1, nombreUpdate);
                    ps.setInt(2, idUpdate);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Alumno actualizado");
                    break;
                case "3":
                    int idDelete = Integer.parseInt(JOptionPane.showInputDialog("ID del Alumno a eliminar:"));
                    String sqlDelete = "DELETE FROM alumno WHERE Cod_alumno=?";
                    ps = con.prepareStatement(sqlDelete);
                    ps.setInt(1, idDelete);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Alumno eliminado");
                    break;
                case "4":
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery("SELECT * FROM alumno");
                    StringBuilder alumnos = new StringBuilder("Lista de Alumnos:\n");
                    while (rs.next()) {
                        alumnos.append(rs.getInt(1)).append(" - ")
                                .append(rs.getString(2)).append(" ")
                                .append(rs.getString(3)).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, alumnos.toString());
                    break;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    private static void crudMateria() {
        String opcion = JOptionPane.showInputDialog("1. Agregar\n2. Actualizar\n3. Eliminar\n4. Listar");
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
            switch (opcion) {
                case "1":
                    int id = Integer.parseInt(JOptionPane.showInputDialog("ID Materia:"));
                    String nombre = JOptionPane.showInputDialog("Nombre:");
                    String descripcion = JOptionPane.showInputDialog("Descripción:");
                    String sql = "INSERT INTO materia VALUES (?, ?, ?)";
                    PreparedStatement ps = con.prepareStatement(sql);
                    ps.setInt(1, id);
                    ps.setString(2, nombre);
                    ps.setString(3, descripcion);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Materia agregada correctamente");
                    break;
                case "2":
                    int idUpdate = Integer.parseInt(JOptionPane.showInputDialog("ID de la Materia a actualizar:"));
                    String nombreUpdate = JOptionPane.showInputDialog("Nuevo Nombre:");
                    String sqlUpdate = "UPDATE materia SET Nombre=? WHERE Cod_materia=?";
                    ps = con.prepareStatement(sqlUpdate);
                    ps.setString(1, nombreUpdate);
                    ps.setInt(2, idUpdate);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Materia actualizada");
                    break;
                case "3":
                    int idDelete = Integer.parseInt(JOptionPane.showInputDialog("ID de la Materia a eliminar:"));
                    String sqlDelete = "DELETE FROM materia WHERE Cod_materia=?";
                    ps = con.prepareStatement(sqlDelete);
                    ps.setInt(1, idDelete);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Materia eliminada");
                    break;
                case "4":
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery("SELECT * FROM materia");
                    StringBuilder materias = new StringBuilder("Lista de Materias:\n");
                    while (rs.next()) {
                        materias.append(rs.getInt(1)).append(" - ")
                                .append(rs.getString(2)).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, materias.toString());
                    break;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    private static void crudAlumnoMateria() {
        int idAlumno = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del Alumno:"));
        int idMateria = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la Materia:"));
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "INSERT INTO alumno_materia VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Relación Alumno-Materia agregada correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}