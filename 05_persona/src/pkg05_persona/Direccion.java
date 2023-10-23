package pkg05_persona;

/**
 * Representa una direccion geografica
 * @author Gerardo Portillo
 */
public class Direccion {
    //atributos
    private Barrio colonia;
    public String calle;
    public String avenida;
    public String bloque;
    public String casa;
    //constructor
    public Direccion(Barrio colonia) {
        //colonia no puede ser null (relacion por conmposicion)
        if( colonia != null )
            this.colonia = colonia; //se acepta
        else
            throw new IllegalArgumentException("Colonia no puede ser null");
        
        this.calle = "N/A";
        this.avenida = "N/A";
        this.bloque = "N/A";
        this.casa = "N/A";
    }
    //metodos
    public Barrio getColonia() {
        return this.colonia;
    }
}
