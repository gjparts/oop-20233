package pkg08_polimorfismo1;

/**
 * Representa a un animal generico
 * @author Gerardo Portillo
 */
public class Animal {
    //atributos
    private String nombre;
    private String especie;
    private int patas;
    private boolean tieneCola;
    //constructor
    public Animal(String nombre, String especie,
                  int patas, boolean tieneCola) {
        this.nombre = nombre;
        this.especie = especie;
        this.patas = patas;
        this.tieneCola = tieneCola;
    }
    //metodos
    public void imprimir(){
        System.out.println("***** "+this.nombre+" *****");
        System.out.println("Especie: "+this.especie);
        System.out.println("Patas: "+this.patas);
        System.out.println("Tiene cola: "+( this.tieneCola ? "Si" : "No") );
    }
    public void hablar(){
        System.out.println(this.nombre+" se comunica.");
    }
}
