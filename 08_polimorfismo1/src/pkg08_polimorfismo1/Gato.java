package pkg08_polimorfismo1;

/**
 * Representa a un gato
 * @author Gerardo Portillo
 */
public class Gato extends Animal {
    //atributos
    public String apodo;
    private boolean tienePelaje;
    //constructor
    public Gato(String apodo, boolean tienePelaje,
                boolean tieneCola, int patas){
        //construir la super clase
        super("Gato", "Felino", patas, tieneCola);
        //llenar los atributos de esta clase
        this.apodo = apodo;
        this.tienePelaje = tienePelaje;
    }
    //metodos
    public void ronronear(){
        System.out.println("prrrrrrrrr");
    }
    //Polimorfismo: superponer metodos de la clase padre
    @Override
    public void hablar(){
        //Override completo: no reutilizar el metodo
        //de la clase padre
        System.out.println("miau");
    }
    @Override
    public void imprimir(){
        //Override parcial: reutiliza el metodo
        //de la clase padre y agrega mas codigo
        super.imprimir();
        System.out.println("Apodo: "+this.apodo);
        System.out.println("Tiene pelaje: "+( this.tienePelaje ? "Si" : "No" ) );
    }
}
