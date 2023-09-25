package gerardo;

/**
 * Una clase que describe a una persona.
 * @author Gerardo Portillo
 * @since 2023-09-25
 */
public class Persona {
    //atributos
    public String nombre;
    public int edad;
    public char genero;
    public String ciudad;
    public boolean trabaja;
    //constructores
    public Persona(String nombre, char genero){
        this.nombre = nombre;
        this.genero = genero;
        this.edad = 0;
        this.ciudad = "No definida";
        this.trabaja = false;
    }
    public Persona(String nombre, int edad, char genero,
                    String ciudad, boolean trabaja){
        //reutilizar constructor de dos parametros
        this(nombre, genero);
        //llenar los otros atributos
        this.edad = edad;
        this.ciudad = ciudad;
        this.trabaja = trabaja;
    }
    //metodos
    /**
     * metodo para imprimir el perfil de la persona
     */
    public void imprimir(){
        System.out.println("**************************");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Edad: "+this.edad);
        //imprimir el genero
        System.out.print("Genero: ");
        if( this.genero == 'M' ) System.out.println("Masculino");
        if( this.genero == 'F' ) System.out.println("Femenino");
        if( this.genero == 'O' ) System.out.println("Otro");
        
        System.out.println("Ciudad: "+this.ciudad);
        System.out.println("Trabaja: "+( this.trabaja == true ? "Si" : "No" ) );
    }
    /**
     * Imprime un mensaje de saludo
     * @param enIngles si es true saluda en inglés sino pues en español
     */
    public void saludar(boolean enIngles){
        System.out.println( ( enIngles == true ? "Hi " : "Hola " )+this.nombre );
    }
}
