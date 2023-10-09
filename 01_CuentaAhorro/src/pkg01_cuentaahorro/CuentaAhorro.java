package pkg01_cuentaahorro;
/**
 * Describe una cuenta de ahorro
 * @author  Gerardo Portillo
 * @since   2023-09-29
 */
public class CuentaAhorro {
    //atributos
    public String nombreCliente; 
    public String numeroCuenta;
    private float saldo;
    //constructores
    public CuentaAhorro(String nombreCliente, String numeroCuenta){
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.00f;
    }
    //metodos
    /**
     * Devuelve el saldo disponible en la cuenta
     * @return un numero float
     */
    public float getSaldo(){
        return this.saldo;
    }
    /**
     * Deposita un monto determinado en la cuenta de ahorro
     * @param monto la cantidad a depositar, debe ser mayor que cero.
     */
    public void depositar(float monto){
        if( monto > 0 )
            this.saldo += monto; //se acepta
        else
            throw new IllegalArgumentException("Solo se permite montos mayores a CERO.");
    }
    /**
     * Retira un monto determinado de la cuenta de ahorro
     * @param monto la cantidad a retirar, debe ser mayor que cero, 
     *              no se permite retirar mas de lo que tiene disponible.
     */
    public void retirar(float monto){
        if( monto <= 0 )
            throw new IllegalArgumentException("Solo se permite montos mayores a CERO.");
        else{
            if( monto > saldo )
                throw new IllegalArgumentException("No se puede retirar mas de lo que hay.");
            else
                this.saldo -= monto; //se acepta
        }
    }
}
