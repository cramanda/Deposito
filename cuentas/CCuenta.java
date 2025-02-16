package cuentas;

/**
 * La clase CCuenta representa una cuenta bancaria.
 * En la cual permite realizar operaciones como ingresar dinero, retirar dinero y consultar el saldo.
 */
public class CCuenta {

    private String nombre;   ///< El nombre del titular de la cuenta.
    private String cuenta;   ///< El número de la cuenta bancaria.
    private double saldo;    ///< El saldo actual de la cuenta.
    private double tipoInterés; ///< El tipo de interés aplicado a la cuenta.

    /**
     * Constructor por defecto de la clase CCuenta.
     * Inicializa una nueva cuenta con valores predeterminados.
     */
    public CCuenta() {
    }

    /**
     * Constructor de la clase CCuenta.
     * Inicializa una cuenta con los valores proporcionados.
     *
     * @param nom El nombre del titular de la cuenta.
     * @param cue El número de la cuenta bancaria.
     * @param sal El saldo inicial de la cuenta.
     * @param tipo El tipo de interés aplicado a la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * @return El saldo actual de la cuenta.
     */
    public double estado() {
        return saldo;
    }

    /**
     * Ingresa una cantidad de dinero en la cuenta.
     *
     * @param cantidad La cantidad de dinero a ingresar.
     * @throws Exception Si la cantidad es negativa, se lanza una excepción.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Retira una cantidad de dinero de la cuenta.
     *
     * @param cantidad La cantidad de dinero a retirar.
     * @throws Exception Si la cantidad es negativa o si el saldo es insuficiente, se lanza una excepción.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
