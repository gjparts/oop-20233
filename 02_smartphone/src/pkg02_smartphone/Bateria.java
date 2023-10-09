package pkg02_smartphone;

/**
 * Representa una bateria para smartphone o equipo electronico.
 * @author Gerardo Portillo
 */
public class Bateria {
    //atributos
    private Fabricante marca;
    public float miliAmperios;
    //constructor
    public Bateria(Fabricante marca, float miliAmperios){
        //asegurarse que la marca no sea null (asociacion por composicion)
        if( marca == null )
            throw new IllegalArgumentException("marca no puede ser NULL");
        else
            this.marca = marca; //se acepta
        
        this.miliAmperios = miliAmperios;
    }
    //metodos
    /**
     * Devuelve el fabricante de la bateria
     * @return un objeto de clase Fabricante
     */
    public Fabricante getMarca(){
        return this.marca;
    }
}
