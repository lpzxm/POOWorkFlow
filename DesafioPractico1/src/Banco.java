import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente("Sofia Lopez", "123456");

        CuentaCorriente cc = new CuentaCorriente("CC-0011", 1000);
        CuentaAhorro ca = new CuentaAhorro("CC-0012", 2000);
        CDT cdt = new CDT("CDT-0013", 5000, 0.05);

        cliente.agregarCuenta(cc);
        cliente.agregarCuenta(ca);

        while (true) {
            System.out.println("\n--- Simulador Bancario ---");
            System.out.println("1. Depositar en cuenta corriente");
            System.out.println("2. Retirar de cuenta corriente");
            System.out.println("3. Depositar en cuenta de ahorro");
            System.out.println("4. Retirar de cuenta de ahorro");
            System.out.println("5. Aplicar interés a cuenta de ahorro");
            System.out.println("6. Ver cuentas");
            System.out.println("7. Calcular ganancia CDT");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();
            double monto;

            switch (opcion) {
                case 1:
                    System.out.print("Monto a depositar en cuenta corriente: ");
                    monto = sc.nextDouble();
                    cc.depositar(monto);
                    break;
                case 2:
                    System.out.print("Monto a retirar de cuenta corriente: ");
                    monto = sc.nextDouble();
                    if (cc.retirar(monto)) {
                        System.out.println("Retiro exitoso.");
                    } else {
                        System.out.println("Fondos insuficientes.");
                    }
                    break;
                case 3:
                    System.out.print("Monto a depositar en cuenta de ahorro: ");
                    monto = sc.nextDouble();
                    ca.depositar(monto);
                    break;
                case 4:
                    System.out.print("Monto a retirar de cuenta de ahorro: ");
                    monto = sc.nextDouble();
                    if (ca.retirar(monto)) {
                        System.out.println("Retiro exitoso.");
                    } else {
                        System.out.println("Fondos insuficientes.");
                    }
                    break;
                case 5:
                    ca.aplicarInteresMensual();
                    System.out.println("Interés aplicado.");
                    break;
                case 6:
                    cliente.mostrarCuentas();
                    break;
                case 7:
                    System.out.print("Ingrese meses para calcular ganancias del CDT: ");
                    int meses = sc.nextInt();
                    System.out.println("Ganancia estimada: $" + cdt.calcularGanancia(meses));
                    break;
                case 8:
                    System.out.println("Gracias por usar el simulador bancario.");
                    sc.close();
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
