class CuentaAhorro extends CuentaAb {
    private String numTarjetaCredito;

    public CuentaAhorro(double saldo, String numerodecuenta, String titular, String fechadeapertura, double interes, String numTarjetaCredito) {
        super(saldo, numerodecuenta, titular, fechadeapertura, interes);
        this.numTarjetaCredito = numTarjetaCredito;
    }

    @Override
    public double calcularinteres(double cantidad) {
        return cantidad * this.interes;
    }
}