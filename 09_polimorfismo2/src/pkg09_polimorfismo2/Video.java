package pkg09_polimorfismo2;

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
    //metodos
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Codec: "+this.codec);
        System.out.println("Capitulos: "+this.chapters);
        //imprimir los canales de audio
        System.out.println("Pistas de audio: ");
        if( this.audio != null ){
            if( this.audio.length > 0 ){
                for( int i = 0; i < this.audio.length; i++ ){
                    if( this.audio[i] != null )
                        System.out.println("\t"+this.audio[i]);
                }
            }
            else
                System.out.println("\tNo tiene.");
        }
        //imprimir los subtitulos disponibles
        System.out.println("Subtitulos disponibles: ");
        if( this.subtitles != null ){
            if( this.subtitles.size() > 0 ){
                for( int i = 0; i < this.subtitles.size(); i++ ){
                    if( this.subtitles.get(i) != null ){
                        System.out.print("\t"+this.subtitles.get(i).language);
                        System.out.println(" ("+this.subtitles.get(i).author.nombre+")");
                    }
                }
            }
            else
                System.out.println("\tNo tiene.");
        }
    }
}
