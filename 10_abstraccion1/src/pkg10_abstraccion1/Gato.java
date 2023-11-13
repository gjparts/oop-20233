package pkg10_abstraccion1;
public class Gato extends SerVivo {
    //atributos
    public String apodo;
    //consturctor
    public Gato(String apodo){
        //construir la super clase
        super("Felino");
        //atributos de esta clase
        this.apodo = apodo;
    }
    //implementar los metodos abstractos (obligatorio)
    @Override
    public void dormir(){
        System.out.println("Se sienta sobre cualquier cosa y descansa.");
    }
    @Override
    public void desplazarse(){
        System.out.println("Camina de forma sigilosa.");
    }
    @Override
    public void alimentarse(){
        System.out.println("Come alimentos gatunos.");
    }
    @Override
    public void hablar(){
        System.out.println("Miau");
    }
}
