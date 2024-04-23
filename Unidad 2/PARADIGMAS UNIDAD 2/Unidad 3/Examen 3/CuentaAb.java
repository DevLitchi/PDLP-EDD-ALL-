abstract class CuentaAb {
    protected double saldo;
    protected String numerodecuenta;
    protected String titular;
    protected String fechadeapertura;
    protected double interes;

    public CuentaAb(double saldo, String numerodecuenta, String titular, String fechadeapertura, double interes) {
        this.saldo = saldo;
        this.numerodecuenta = numerodecuenta;
        this.titular = titular;
        this.fechadeapertura = fechadeapertura;
        this.interes = interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract double calcularinteres(double cantidad);
}
