package pkg08_polimorfismo1;

/**
 * Representa a un perro
 * @author Gerardo Portillo
 */
public class Perro extends Animal {
    //atributos
    public String apodo;
    public String raza;
    //constructor
    public Perro(String apodo, boolean tienePelaje,
                boolean tieneCola, int patas,
                String raza){
        //construir la super clase
        super("Perro", "Canino", patas, tieneCola);
        //llenar los atributos de esta clase
        this.apodo = apodo;
        this.raza = raza;
    }
    //metodos
    public void jugar(){
        System.out.println(this.apodo+" mueve la cola y corre.");
    }
    @Override
    public void hablar(){
        //override completo
        System.out.println("Wuau, Wof, Guau, Bark");
    }
    @Override
    public void imprimir(){
        //override parcial
        super.imprimir();
        //codigo adicional
        System.out.println("Apodo: "+this.apodo);
        System.out.println("Raza: "+this.raza);
    }
    //para tener acceso a miembros privados de la super clase
    //es necesario que exista un get o un set
    public void analizar(){
        System.out.println("En efecto este es un "+this.getEspecie());
    }
}
