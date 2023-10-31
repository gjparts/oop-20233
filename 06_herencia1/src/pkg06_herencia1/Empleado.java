package pkg06_herencia1;

/**
 * Representa a un empleado, hereda de Persona
 * @author Gerardo Portillo
 */
public class Empleado extends Persona {
    //atributos
    public float salario;
    public String cargo;
    //constructor
    //si la super clase tiene un constructor
    //sin parametros, no es necesario ejecutar
    //el constructor de la super clase aqui.
    public Empleado(float salario, String cargo){
        //super(); //ejecucion del constructor sin parametros
        this.salario = salario;
        this.cargo = cargo;
    }
    //metodos
    public void trabajar(){
        System.out.println("Estoy trabajando de "+this.cargo);
    }
}
