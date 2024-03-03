package banco;

public class CtaCorriente {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldocuenta
     */
    public double getSaldocuenta() {
        return saldocuenta;
    }

    /**
     * @param saldocuenta the saldocuenta to set
     */
    public void setSaldocuenta(double saldocuenta) {
        this.saldocuenta = saldocuenta;
    }

    /**
     * @return the interes
     */
    public double getInteres() {
        return interes;
    }

    /**
     * @param interes the interes to set
     */
    public void setInteres(double interes) {
        this.interes = interes;
    }
    private String nombre;
    private String cuenta;
    private double saldocuenta;
    private double interes;

    public CtaCorriente()
    {
    }
    public CtaCorriente(String nombre, String cuenta, double saldo, double interes)
    {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldocuenta = saldo;
        this.interes = interes;
    }
        public void ingresar(double cantidad) throws IllegalArgumentException
    {
        if (cantidad<0)
            throw new IllegalArgumentException("No se puede ingresar una cantidad negativa");
        setSaldocuenta(getSaldocuenta() + cantidad);
    }

    public void retirar(double cantidad) throws IllegalArgumentException
    {
        if (cantidad <= 0)
            throw new IllegalArgumentException ("No se puede retirar una cantidad negativa");
        if (getSaldocuenta()< cantidad)
            throw new IllegalArgumentException ("No se hay suficiente saldo");
        setSaldocuenta(getSaldocuenta() - cantidad);
    }
}