package pkg07_herencia2;

/**
 * Representa a un archivo de video
 * @author Gerardo Portillo
 */
import java.util.Calendar;
import java.util.LinkedList;
public class Video extends Media {
    //atributos
    public String codec;
    public int chapters;
    public String[] audio;
    public LinkedList<Subtitle> subtitles;
    //constructor
    public Video(String name, int size, Calendar creationDate,
            Author autor, int duration,
            String codec, int chapters,
            String[] audio, LinkedList<Subtitle> subtitles,
            String type, String extension) {
        //construir la super clase
        super(name, size, creationDate, autor, duration);
        super.extension = extension;
        super.setType(type);
        //incializar los atributos de esta clase
        this.codec = codec;
        this.chapters = chapters;
        this.audio = audio;
        this.subtitles = subtitles;
    }
    
}
