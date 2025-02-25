public class CuentaCorriente extends Cuenta {
    public CuentaCorriente(String numeroCuenta, Integer saldoInicial) {
        super(numeroCuenta, saldoInicial);
    }

    @Override
    public void depositar(double monto) {
        saldo += monto;
    }

    @Override
    public boolean retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            return true;
        }
        return false;
    }
}
