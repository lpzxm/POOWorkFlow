public abstract class Cuenta {
    protected String numeroCuenta;
    protected double saldo;

    public Cuenta(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public abstract void depositar(double monto);
    public abstract boolean retirar(double monto);

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + '}';
    }
}
