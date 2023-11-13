package pkg09_polimorfismo2;

/**
 * Representa a un archivo de subtitulos
 * @author Gerardo Portillo
 */
public class Subtitle {
    //atributos
    public String language;
    public Author author;
    //constructor
    public Subtitle(String language, Author author) {
        this.language = language;
        this.author = author;
    }
}
