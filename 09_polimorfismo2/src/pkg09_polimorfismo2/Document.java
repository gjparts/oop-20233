package pkg09_polimorfismo2;

/**
 * Representa a un documento
 * @author Gerardo Portillo
 */
import java.util.Calendar;
import java.text.SimpleDateFormat;
public class Document extends Archivo {
    //atributos
    public Author author;
    public Calendar modificationDate;
    public int words;
    //constructor
    public Document(String name, int size, Calendar creationDate,
            Author author, int words) {
        //construir la super clase
        super(name, size, "Document", "doc", creationDate);
        //inicializar los atributos de esta clase:
        this.author = author;
        this.modificationDate = null;
        this.words = words;
    }
    //polimorfismo
    @Override
    public void imprimir(){
        //parcial
        super.imprimir();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
        //imprimir lo nuevo
        System.out.println("Autor: "+this.author.nombre);
        
        System.out.print("Fecha de Modificacion: ");
        if( this.modificationDate != null )
            System.out.println(formato.format(this.modificationDate.getTime()));
        else
            System.out.println("No tiene");
        
        System.out.println("Palabras: "+this.words);
    }
}
