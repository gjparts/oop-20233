package pkg09_polimorfismo2;
/**
 * Representa un archivo de multimedios
 * @author Gerardo Portillo
 */
import java.util.Calendar;
public class Media extends Archivo {
    //atributos
    public Author autor;
    public int duration;
    //constructor
    public Media(String name, int size, Calendar creationDate,
            Author autor, int duration) {
        //construir la super clase
        super(name, size, "Media file", "", creationDate);
        //inicializar los atributos de esta clase
        this.autor = autor;
        this.duration = duration;
    }
    //metodos
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Autor: "+this.autor.nombre);
        System.out.println("Duracion: "+this.duration);
    }
}
