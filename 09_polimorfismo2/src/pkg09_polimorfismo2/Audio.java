package pkg09_polimorfismo2;

/**
 * Representa a un archivo de sonido
 * @author Gerardo Portillo
 */
import java.util.Calendar;
public class Audio extends Media {
    //atributos
    public String artist;
    public String album;
    public int year;
    public int track;
    //constructor
    public Audio(String name, int size, Calendar creationDate,
            Author autor, int duration,
            String artist, String album, int year, int track,
            String type, String extension) {
        //construir la super clase
        super(name, size, creationDate, autor, duration);
        super.extension = extension;
        super.setType(type);
        
        //inicializar los atributos de esta clase
        this.artist = artist;
        this.album = album;
        this.year = year;
        this.track = track;
    }
    //metodos
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Artista: "+this.artist);
        System.out.println("Album: "+this.album);
        System.out.println("Año: "+this.year);
        System.out.println("Pista: "+this.track);
    }
}
