public class CuentaAhorro extends Cuenta {
    private double tasaInteres = 0.006;

    public CuentaAhorro(String numeroCuenta, double saldoInicial) {
        super(numeroCuenta, saldoInicial);
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public boolean retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    public void aplicarInteresMensual(){
        saldo += saldo * tasaInteres;
    }
}
