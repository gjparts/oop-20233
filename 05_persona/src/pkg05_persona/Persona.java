package pkg05_persona;
/**
 * Representa a una persona
 * @author Gerardo Portillo
 */
public class Persona {
    //atributos
    public String identidad;
    public String nombre;
    public int telefono;
    public Direccion direccion;
    public Empresa empresaLabora;
    public Mascota[] mascotas; //multiplicidad, arreglo de Mascota
    //constructor
    public Persona(String identidad, String nombre, int telefono) {
        this.identidad = identidad;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = null;
        this.empresaLabora = null;
        this.mascotas = null;
    }
    //metodos
    public void imprimir(){
        System.out.println("********************");
        System.out.println("Identidad: "+this.identidad);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Telefono: "+this.telefono);
        //imprimir la direccion dependiendo si viene
        System.out.print("Dirección: ");
        if( this.direccion == null )
            System.out.println("No tiene");
        else{
            System.out.println("Colonia: "+this.direccion.getColonia().nombre);
            System.out.println("\tCalle:"+this.direccion.calle);
            System.out.println("\tAvenida:"+this.direccion.avenida);
            System.out.println("\tBloque:"+this.direccion.bloque);
            System.out.println("\tCasa:"+this.direccion.casa);
        }
        //imprimir la empresa donde labora
        System.out.print("Empresa donde labora: ");
        if( this.empresaLabora == null )
            System.out.println("No labora para empresa.");
        else{
            System.out.println(this.empresaLabora.nombre);
            System.out.println("Colonia: "+this.empresaLabora.getDireccion().getColonia().nombre);
            System.out.println("\tCalle:"+this.empresaLabora.getDireccion().calle);
            System.out.println("\tAvenida:"+this.empresaLabora.getDireccion().avenida);
            System.out.println("\tBloque:"+this.empresaLabora.getDireccion().bloque);
            System.out.println("\tCasa:"+this.empresaLabora.getDireccion().casa);
        }
        //imprimir el array de mascotas
        System.out.println("Mascotas: ******");
        if( this.mascotas == null )
            System.out.println("\tNo tiene mascotas");
        else{
            //si tiene mascotas, recorrer el Array
            for( int i = 0; i < this.mascotas.length; i++ ){
                //validar si cada mascota es diferente de null
                //si es asi la imprimimos sino la ignoramos
                if( this.mascotas[i] != null ){
                    System.out.println("\tNombre: "+this.mascotas[i].nombre);
                    System.out.println("\tEspecie: "+this.mascotas[i].especie);
                    System.out.println();
                }
            }
        }
    }    
}
