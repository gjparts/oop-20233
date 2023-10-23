package pkg05_persona;
/**
 * Representa un diploma o certificado emitido por
 * una organizacion.
 * @author Gerardo Portillo
 */
public class Diploma {
    //atributos
    public String institucion;
    public String nombre;
    //constructor
    public Diploma(String institucion, String nombre) {
        this.institucion = institucion;
        this.nombre = nombre;
    }
}
