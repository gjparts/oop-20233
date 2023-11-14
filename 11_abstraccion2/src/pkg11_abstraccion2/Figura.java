package pkg11_abstraccion2;
public abstract class Figura {
    //atributos
    private String nombre;
    //constructor
    public Figura(String nombre){
        this.nombre = nombre;
    }
    //metodos abstractos
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    //metodo
    public String getNombre() {
        return this.nombre;
    }
}
