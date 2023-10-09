package pkg02_smartphone;

/**
 * Representa a un fabricante de productos
 * @author Gerardo Portillo
 */
public class Fabricante {
    //atributos
    public String nombre;
    public String pais;
    public String contacto;
    //constructor
    public Fabricante(String nombre,
            String pais, String contacto){
        this.nombre = nombre;
        this.pais = pais;
        this.contacto = contacto;
    }
}
