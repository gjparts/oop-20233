package gerardo;

/**
 * Una clase que describe a una persona.
 * @author Gerardo Portillo
 * @since 2023-09-25
 */
public class Persona {
    //atributos
    public String nombre;
    private int edad;
    private char genero;
    public String ciudad;
    public boolean trabaja;
    //constructores
    public Persona(String nombre, char genero){
        this.nombre = nombre;
        this.setGenero(genero); //escribir el atributo por medio de su set
        this.setEdad(0); //escribir el atributo por medio de su set
        this.ciudad = "No definida";
        this.trabaja = false;
    }
    public Persona(String nombre, int edad, char genero,
                    String ciudad, boolean trabaja){
        //reutilizar constructor de dos parametros
        this(nombre, genero);
        //llenar los otros atributos
        this.setEdad(edad); //escribir el atributo por medio de su set
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
    /**
     * Establece el genero de la persona
     * @param genero solo se permite M, F, O (mayusculas)
     */
    public void setGenero(char genero){
        //validacion del dato enviado
        if( genero == 'M' || genero == 'F' || genero == 'O' )
            this.genero = genero; //se acepta
        else
            throw new IllegalArgumentException("Genero debe ser M, F, O");
    }
    /**
     * Devuelve el genero de la persona
     * @return un valor char
     */
    public char getGenero(){
        return this.genero;
    }
    /**
     * Establece la edad de la persona
     * @param edad un entero entre 0 y 150
     */
    public void setEdad(int edad){
        if( edad >= 0 && edad <= 150 )
            this.edad = edad; //se acepta
        else
            throw new IllegalArgumentException("Edad debe ser entre 0 y 150");
    }
    /**
     * Devuelve la edad de la persona
     * @return un numero entero
     */
    public int getEdad(){
        return this.edad;
    }
}


