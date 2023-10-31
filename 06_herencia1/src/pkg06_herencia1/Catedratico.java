package pkg06_herencia1;

/**
 * Representa a un profesor
 * @author Gerardo Portillo
 */
public class Catedratico extends Empleado {
    //atributos
    public String profesion;
    //constructor
    public Catedratico(String nombre, int edad, char genero,
            String profesion, float salario){
        //construir la super clase
        super(salario, "Catedratico");
        //llenar los atributos de la super clase que no van por constructor
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        //inicalizar los atributos de esta clase
        this.profesion = profesion;
    }
    //metodos
    public void educar(){
        System.out.println("Estoy dando clases sobre "+this.profesion);
    }
}
