package pkg09_polimorfismo2;
import java.util.Calendar;
import java.util.LinkedList;
public class Main {

    public static void main(String[] args) {
        Calendar f1 = Calendar.getInstance();
        f1.set(2023, 10, 2);
        Author gerardo = new Author("Gerardo Portillo", "califik.com", "g@g.com");
        
        Archivo a1 = new Archivo("algo", 12, "Text File",
                "txt", f1);
        a1.imprimir();
        
        Document d1 = new Document("tesis", 156085, f1, gerardo, 45);
        //d1.modificationDate = f1;
        d1.imprimir();
        
        Media m1 = new Media("clip", 234567890, f1, gerardo, 15);
        m1.imprimir();
        
        Audio au1 = new Audio("One", 456789, f1, gerardo, 212, "Metallica", 
                "...And Justice For All", 1990, 4, "AUDIO/MPEGLAYER3", "mp3");
        au1.imprimir();
        
        String canales[] = {"Ingles","Español",null,"Ruso"};
        LinkedList<Subtitle> subtitulos = new LinkedList();
        subtitulos.add(new Subtitle("Ingles", gerardo));
        subtitulos.add(null);
        subtitulos.add(new Subtitle("Ruso", new Author("GNula.org", "", "")));
        
        Video v1 = new Video("Akira", 567890123, f1, gerardo, 140, 
                "Matroska Video", 8, canales, subtitulos, 
                "VIDEO/MPEGLAYER4", "mp4");
        v1.imprimir();
    }
    
}
