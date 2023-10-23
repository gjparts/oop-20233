package pkg05_persona;

/**
 * Representa a un barrio o colonia
 * @author Gerardo Portillo
 */
public class Barrio {
    //atributos
    public String nombre;
    public String zona;
    public String codigoPostal;
    //constructor
    public Barrio(String nombre, String zona, String codigoPostal) {
        this.nombre = nombre;
        this.zona = zona;
        this.codigoPostal = codigoPostal;
    }
}
