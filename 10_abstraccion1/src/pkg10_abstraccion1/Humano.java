package pkg10_abstraccion1;
public class Humano extends SerVivo {
    //atributos
    public String nombre;
    //constructor
    public Humano(String nombre){
        //construir la super clase
        super("Homo Sapiens");
        //inicializar los atributos de esta clase
        this.nombre = nombre;
    }
    //implementar los metodos abstractos

    @Override
    public void hablar() {
        System.out.println(this.nombre+" dice hola.");
    }
    @Override
    public void dormir() {
        System.out.println("Busca un lugar seguro y se recuesta.");
    }
    @Override
    public void alimentarse() {
        System.out.println("Come de todo.");
    }
    @Override
    public void desplazarse() {
        System.out.println("Camina erguido.");
    } 
}
