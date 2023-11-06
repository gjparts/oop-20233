package pkg07_herencia2;

/**
 * Representa a un documento
 * @author Gerardo Portillo
 */
import java.util.Calendar;
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
}
