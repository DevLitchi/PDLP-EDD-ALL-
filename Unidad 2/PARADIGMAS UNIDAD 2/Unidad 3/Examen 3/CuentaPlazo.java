class CuentaPlazo extends CuentaAb {
    private int numAños;

    public CuentaPlazo(double saldo, String numerodecuenta, String titular, String fechadeapertura, double interes,
            int numAños) {
        super(saldo, numerodecuenta, titular, fechadeapertura, interes);
        this.numAños = numAños;
    }

    @Override
    public double calcularinteres(double cantidad) {
        // Calculamos el interés para un plazo fijo, por ejemplo, utilizando un interés
        // simple
        return cantidad * this.interes * this.numAños;
    }

    public int getNumAños() {
        return numAños;
    }

    public void setNumAños(int numAños) {
        this.numAños = numAños;
    }
}