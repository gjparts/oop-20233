package pkg06_herencia1;
/**
 * Representa a una persona
 * @author Gerardo Portillo
 * @since  2023-10-30
 */
public class Persona {
    //atributos
    public String nombre;
    public int edad;
    public char genero;
    //constructores
    //sin parametros
    public Persona(){
        this.nombre = "No tiene";
        this.edad = 0;
        this.genero = 'N';
    }
    public Persona(String nombre, int edad, char genero){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    //metodos
    public void saludar(){
        System.out.println("Hola soy "+this.nombre);
    }
}
