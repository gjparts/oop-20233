package pkg07_herencia2;

/**
 * Representa un archivo
 * @author Gerardo Portillo
 */
import java.util.Calendar;
import java.text.SimpleDateFormat;
public class Archivo {
    //atributos
    public String name;
    public int size;
    private String type;
    public String extension;
    public Calendar creationDate;
    //constructor
    public Archivo(String name, int size, String type,
            String extension, Calendar creationDate) {
        this.name = name;
        this.size = size;
        this.type = type;
        this.extension = extension;
        this.creationDate = creationDate;
    }
    //metodos
    public String getType() {
        return this.type;
    }
    public void setType(String type){
        if( type.trim().length() == 0 )
            throw new IllegalArgumentException("Type debe venir lleno");
        else
            this.type = type; //se acepta
    }
    public void imprimir(){
        System.out.println("***** ARCHIVO *****");
        System.out.println("Nombre: "+this.name);
        System.out.println("Tamaño en bytes: "+this.size);
        System.out.println("Tipo: "+this.type);
        System.out.println("Extension: "+this.extension);
        
        System.out.print("Fecha de creación: ");
        if( this.creationDate == null )
            System.out.println("No tiene");
        else{
            SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
            System.out.println( formato.format(this.creationDate.getTime()) );
        }
    }
}
