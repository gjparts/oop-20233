package pkg06_herencia1;

/**
 * Representa a un practicante en la empresa
 * @author Gerardo Portillo
 */
public class Practicante extends Empleado {
    //atributos
    public int meses;
    //constructor
    public Practicante(String nombre, int edad, char genero, int meses){
        //construir la super clase
        super(0, "Practicante");
        //llenar los atributos de la super clase que no estan en
        //su constructor (puede usar this o puede usar super)
        this.nombre = nombre;
        this.edad = edad;
        super.genero = genero;
        //llenar los atributos de esta clase
        this.meses = meses;
    }
}
