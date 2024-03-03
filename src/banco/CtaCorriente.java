package banco;

/** Esta clase ejecuta los métodos relacionados con la gestión 
 * de la cuenta corriente del banco.
 * @version 1.2
 */
public class CtaCorriente {
    /** Este método retorna el nombre del beneficiario de la cuenta.
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /** Este método recibe como parámetro el nombre el nombre de beneficiario 
     * de la cuenta(String) y lo actualiza.
     * @param nombre nombre del beneficiario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** Este método devuelve el identificador de cuenta.
     * @return cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /** Este método recibe como parámetro el identificador de cuenta (String) 
     * y lo actualiza.
     * @param cuenta identificador de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**Este método devuelve el saldo de la cuenta en un momento dado.
     * @return saldocuenta
     */
    public double getSaldocuenta() {
        return saldocuenta;
    }

    /**  Este método recibe como parámetro el saldo de la cuenta (double)
     * y lo actualiza.
     * @param saldocuenta saldo de la cuenta
     */
    public void setSaldocuenta(double saldocuenta) {
        this.saldocuenta = saldocuenta;
    }

    /**Este método devuelve la tasa de interés aplicada a una cuenta 
     * en un momento dado.
     * @return interes
     */
    public double getInteres() {
        return interes;
    }

    /** Este método recibe como parámetro la tasa de interés (double) a aplicar 
     * en la cuenta y la actualiza.
     * @param interes tasa de interés
     */
    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    private String nombre;
    private String cuenta;
    private double saldocuenta;
    private double interes;

     /** Este método recibe como parámetro el nombre del beneficiario (String)
     * el identificador de la cuenta (String), el saldo de esta (double),
     * los intereses aplicados (double).
     * Con estos datos, el método construye la cuenta, asignándolos a 
     * las variables necesarias. 
     * @param nombre nombre del beneficiario
     * @param cuenta identificador de la cuenta
     * @param saldo saldo de la cuenta
     * @param interes tasa de interes
     */
    public CtaCorriente(String nombre, String cuenta, double saldo, double interes)
    {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldocuenta = saldo;
        this.interes = interes;
    }
    
    /** Este método recibe como parámetro la cantidad a ingresar en la cuenta
     * (double). Comprueba si la cantidad es mayor/igual que cero, si no lo es
     * lanza una excepción. Luego, suma la cantidad preexistente a la
     * cantidad ingresada y modifica el saldo de la cuenta.
     * @param cantidad cantidad a ingresar
     * @throws IllegalArgumentException si la cantidad es negativa
     * 
     */
        public void ingresar(double cantidad) throws IllegalArgumentException         
    {
        if (cantidad<0)
            throw new IllegalArgumentException("No se puede ingresar una cantidad negativa");
        setSaldocuenta(getSaldocuenta() + cantidad);
    }

        /**  Este método recibe como parámetro la cantidad a retirar en la cuenta
     * (double). Comprueba si la cantidad es mayor/igual que cero, si no lo es
     * lanza una excepción. Luego, resta a la cantidad preexistente a la
     * cantidad ingresada y modifica el saldo de la cuenta.
     * Si la cantidad a retirar es mayor a la cantidad preexistente, lanza 
     * la excepción con un mensaje informativo. 
     * @param cantidad cantidad a retirar
     * @throws  IllegalArgumentException si la cantidad es negativa
     * @throws IllegalArgumentException si el saldo de la cuenta es menor que la
     * cantidad a retirar
     */
    public void retirar(double cantidad) throws IllegalArgumentException
    {
        if (cantidad <= 0)
            throw new IllegalArgumentException ("No se puede retirar una cantidad negativa");
        if (getSaldocuenta()< cantidad)
            throw new IllegalArgumentException ("No se hay suficiente saldo");
        setSaldocuenta(getSaldocuenta() - cantidad);
    }
}