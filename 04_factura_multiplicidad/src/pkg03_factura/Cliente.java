package pkg03_factura;

/**
 * Representa a un cliente
 * @author Gerardo Portillo
 */
public class Cliente {
    //atributos
    public String nombre;
    public int telefono;
    public int rtn;
    public String correo;
    //constructor
    public Cliente(String nombre, int telefono, int rtn, String correo){
        this.nombre = nombre;
        this.telefono = telefono;
        this.rtn = rtn;
        this.correo = correo;
    }
}
