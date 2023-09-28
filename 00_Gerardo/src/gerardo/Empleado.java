package gerardo;

/**
 * Clase que describe a un empleado de la organizacion
 * @author Gerardo Portillo
 * @since 2023-09-28
 */
public class Empleado {
    //atributos
    public String nombre;
    private int edad;
    private char genero;
    private char estadoCivil;
    private char contrato;
    private float salario;
    //constructores
    public Empleado(String nombre, int edad){
        this.nombre = nombre;
        this.setEdad(edad);  //this.edad = edad;
        this.setGenero('O'); //this.genero = 'O';
        this.setEstadoCivil('S'); //this.estadoCivil = 'S';
        this.setContrato('T'); //this.contrato = 'T';
        this.setSalario(0.00f); //this.salario = 0.00f;
    }
    public Empleado(String nombre, int edad, char genero,
                    char estadoCivil, char contrato, float salario){
        //reutilizar constructor de 2 param.
        this(nombre,edad);
        //sobreescribir los demas atributos
        this.setGenero(genero); //this.genero = genero;
        this.setEstadoCivil(estadoCivil); //this.estadoCivil = estadoCivil;
        this.setContrato(contrato);  //this.contrato = contrato;
        this.setSalario(salario); //this.salario = salario;
    }
    //metodos
    /**
     * Imprime el perfil del empleado
     */
    public void imprimir(){
        System.out.println("***********************");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Edad: "+this.edad);
        System.out.print("Genero: ");
        if( this.genero == 'M' ) System.out.println("Masculino");
        if( this.genero == 'F' ) System.out.println("Femenino");
        if( this.genero == 'O' ) System.out.println("Otros");
        
        System.out.print("Estado Civil: ");
        if( this.estadoCivil == 'S' ) System.out.println("Soltero");
        if( this.estadoCivil == 'C' ) System.out.println("Casado");
        if( this.estadoCivil == 'D' ) System.out.println("Divorciado");
        if( this.estadoCivil == 'V' ) System.out.println("Viudo");
        if( this.estadoCivil == 'U' ) System.out.println("Unión Libre");
        
        System.out.print("Contrato: ");
        if( this.contrato == 'T' ) System.out.println("Temporal");
        if( this.contrato == 'P' ) System.out.println("Permanente");
        if( this.contrato == 'H' ) System.out.println("Por Hora");
        
        System.out.println("Salario: "+this.salario);
    }
    //setters y getters
    /**
     * Establece la edad del empleado
     * @param edad un numero entero entre 18 y 80
     */
    public void setEdad(int edad){
        if( edad >= 18 && edad <= 80 )
            this.edad = edad;   //se acepta
        else
            throw new IllegalArgumentException("Edad debe ser entre 18 y 80.");
    }
    /**
     * Retorna la edad del empleado
     * @return un numero entero
     */
    public int getEdad(){
        return this.edad;
    }
    /**
     * Establece el genero del empleado.
     * @param genero un char que puede ser: 
     *                  M = Masculino, 
     *                  F = Femenino, 
     *                  O = Otros.
     */
    public void setGenero(char genero){
        if( genero == 'M' || genero == 'F' || genero == 'O' )
            this.genero = genero;   //se acepta
        else
            throw new IllegalArgumentException("Genero debe ser M, F u O.");
    }
    /**
     * Retorna el genero del empleado.
     * @return un char
     */
    public char getGenero(){
        return this.genero;
    }
    /**
     * Establece el estado civil del empleado.
     * @param estadoCivil debe ser un char:
     *                      S = Soltero, 
     *                      C = Casado, 
     *                      D = Divorciado, 
     *                      V = Viudo, 
     *                      U = Unión Libre
     */
    public void setEstadoCivil(char estadoCivil){
        if( estadoCivil == 'S' || estadoCivil == 'C' || estadoCivil == 'D'
          || estadoCivil == 'V' || estadoCivil == 'U' )
            this.estadoCivil = estadoCivil; //se acepta
        else
            throw new IllegalArgumentException("Estado Civil debe ser S,C,D,V o U.");
    }
    /**
     * Retorna el estado civil del empleado.
     * @return un valor char
     */
    public char getEstadoCivil(){
        return this.estadoCivil;
    }
    /**
     * Establece el tipo de contrato laboral del empleado
     * @param contrato un char que puede ser:
     *                  T = Temporal,
     *                  P = Permanente,
     *                  H = Por hora.
     */
    public void setContrato(char contrato){
        if( contrato == 'T' || contrato == 'P' || contrato == 'H' )
            this.contrato = contrato; //se acepta
        else
            throw new IllegalArgumentException("Contrato debe ser T, H o P.");
    }
    /**
     * Retorna el tipo de contrato laboral del empleado
     * @return un char
     */
    public char getContrato(){
        return this.contrato;
    }
    /**
     * Establece el salario del empleado
     * @param salario un numero float cero o positivo.
     */
    public void setSalario(float salario){
        if( salario >= 0 )
            this.salario = salario; //se acepta
        else
            throw new IllegalArgumentException("Salario debe ser un numero positivo.");
    }
    /**
     * Retorna el valor del salario del empleado
     * @return un numero float.
     */
    public float getSalario(){
        return this.salario;
    }
}
