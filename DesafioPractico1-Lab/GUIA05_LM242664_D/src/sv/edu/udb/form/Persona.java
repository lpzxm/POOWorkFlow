package sv.edu.udb.form;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.util.StringTokenizer;

public class Persona extends JFrame {
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtEdad;
    private JButton btnObtenerDatos;
    private JButton btnLimpiar;
    private JPanel pnlPersona;
    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblEdad;
    private JLabel lblTelefono;
    private JLabel lblSexo;
    private JTextField txtTelefono;
    private JComboBox<String> comboBox1;
    private JTable tblDatos;
    DefaultTableModel modelo;
    private static final String DATOS_CSV = "datos.csv";

    public Persona(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(pnlPersona);
        this.setMinimumSize(new Dimension(900, 700));
        this.setLocationRelativeTo(null);

        String[] columns = {"Id", "Nombre", "Edad", "Telefono", "Sexo"};
        modelo = new DefaultTableModel(null, columns);
        tblDatos.setModel(modelo);
        obtenerDatosArchivo();

        btnObtenerDatos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnObtenerDatos();
            }
        });

        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnLimpiar();
            }
        });

        tblDatos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                tblObtenerDato(e);
            }
        });
    }

    private void obtenerDatosArchivo() {
        try (BufferedReader br = new BufferedReader(new FileReader(DATOS_CSV))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea, ",");
                String id = st.nextToken();
                String nombre = st.nextToken();
                String edad = st.nextToken();
                String telefono = st.nextToken();
                String sexo = st.nextToken();
                modelo.addRow(new Object[]{id, nombre, edad, telefono, sexo});
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo csv no encontrado, se creara uno nuevo");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void guardarenArchivo(String id, String nombres, String edad, String telefono, String sexo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(DATOS_CSV, true))) {
            bw.write(id + "," + nombres + "," + edad + "," + telefono + "," + sexo);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void tblObtenerDato(MouseEvent e) {
        int fila = tblDatos.rowAtPoint(e.getPoint());
        if (fila > -1) {
            txtId.setText(modelo.getValueAt(fila, 0).toString());
            txtNombre.setText(modelo.getValueAt(fila, 1).toString());
            txtEdad.setText(modelo.getValueAt(fila, 2).toString());
            txtTelefono.setText(modelo.getValueAt(fila, 3).toString());
            comboBox1.setSelectedItem(modelo.getValueAt(fila, 4).toString());
        }
    }

    private void btnObtenerDatos() {
        String id = txtId.getText();
        String nombres = txtNombre.getText();
        String edad = txtEdad.getText();
        String telefono = txtTelefono.getText();
        String sexo = comboBox1.getSelectedItem().toString();

        if (id.isEmpty() || nombres.isEmpty() || edad.isEmpty() || telefono.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, llena todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Object[] newRow = {id, nombres, edad, telefono, sexo};
        modelo.addRow(newRow);

        guardarenArchivo(id, nombres, edad, telefono, sexo);

        JOptionPane.showMessageDialog(null, "Datos Guardados:\nID: " + id +
                "\nNombres: " + nombres + "\nEdad: " + edad + "\nTeléfono: " + telefono + "\nSexo: " + sexo);

        btnLimpiar();
    }

    private void btnLimpiar() {
        txtId.setText("");
        txtNombre.setText("");
        txtEdad.setText("");
        txtTelefono.setText("");
        comboBox1.setSelectedIndex(0);
    }

    public static void main(String[] args) {
        JFrame frame = new Persona("Ingreso de Datos");
        frame.setVisible(true);
    }
}
