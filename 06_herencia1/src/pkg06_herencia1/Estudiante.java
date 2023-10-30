package pkg06_herencia1;

/**
 * Representa a un estudiante, hereda de Persona
 * @author Gerardo Portillo
 */
public class Estudiante extends Persona {
    //atributos
    public String cuenta;
    public String carrera;
    //constructor
    public Estudiante(String nombre, String cuenta, String carrera){
        //construir la super clase (clase padre)
        super(nombre, 0, 'N');
        //inicializar los atributos de la clase hijo
        this.cuenta = cuenta;
        this.carrera = carrera;
    }
    //metodos
    public void estudiar(){
        System.out.println("Estoy estudiando "+this.carrera);
    }
}
