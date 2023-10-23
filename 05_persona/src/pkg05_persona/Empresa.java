package pkg05_persona;

/**
 * Representa a una empresa o negocio
 * @author Gerardo Portillo
 */
public class Empresa {
    //atributos
    public String nombre;
    private Direccion direccion;
    public int telefono;
    //constructor
    public Empresa(String nombre, Direccion direccion, int telefono) {
        //la direccion es obligatoria
        if( direccion == null )
            throw new IllegalArgumentException("Direccion no puede ser null");
        else
            this.direccion = direccion;
        
        this.nombre = nombre;
        this.telefono = telefono;
    }
    //metodos
    public Direccion getDireccion() {
        return this.direccion;
    }
    
}
