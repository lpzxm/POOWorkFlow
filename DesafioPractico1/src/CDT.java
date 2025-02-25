public class CDT {
    private String numeroCDT;
    private double monto;
    private double interesPersonalizado;

    public CDT(String numeroCDT, double monto, double interesPersonalizado) {
        this.numeroCDT = numeroCDT;
        this.monto = monto;
        this.interesPersonalizado = interesPersonalizado;
    }

    public double calcularGanancia(int meses) {
        return monto * interesPersonalizado * meses;
    }

    @Override
    public String toString() {
        return numeroCDT + "\t" + monto + "\t" + interesPersonalizado;
    }
}
