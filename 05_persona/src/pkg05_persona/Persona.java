package pkg05_persona;
/**
 * Representa a una persona
 * @author Gerardo Portillo
 */
import java.util.LinkedList; //importar lista vinculada
public class Persona {
    //atributos
    public String identidad;
    public String nombre;
    public int telefono;
    public Direccion direccion;
    public Empresa empresaLabora;
    public Mascota[] mascotas; //multiplicidad, arreglo de Mascota
    public LinkedList<Diploma> diplomas; //multiplicidad, lista vinculada de objetos Diploma    
    //clase con atributos de la misma clase es referencia circular
    //sigue siendo asociacion, en este caso agregacion.
    public Persona conyuge;
    public LinkedList<Persona> hijos; //multiplicidad
    //constructor
    
    public Persona(String identidad, String nombre, int telefono) {
        this.identidad = identidad;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = null;
        this.empresaLabora = null;
        this.mascotas = null;
        //inicializar la lista vinculada para los diplomas
        //asi ya esta lista para su uso
        this.diplomas = new LinkedList();
        this.conyuge = null;
        this.hijos = new LinkedList();
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
        //imprimir el LinkedList de diplomas
        System.out.println("Diplomas: ************");
        if( this.diplomas == null )
            System.out.println("\tNo tiene diplomas");
        else{
            if( this.diplomas.size() == 0 )
                System.out.println("\tNo tiene diplomas");
            else{
                //si hay diplomas, recorrerlos e imprimir los que no sean null
                for( int i = 0; i < this.diplomas.size(); i++ ){
                    if( this.diplomas.get(i) != null ){
                        System.out.println("\tInstitucion: "+this.diplomas.get(i).institucion);
                        System.out.println("\tNombre: "+this.diplomas.get(i).nombre);
                        System.out.println();
                    }
                }
            }
        }
        
        //imprimir los datos del conyuge
        System.out.print("Conyuge: ");
        if( conyuge == null )
            System.out.println("No tiene");
        else{
            System.out.println(this.conyuge.nombre);
            System.out.println("\tIdentidad: "+this.conyuge.identidad);
            System.out.println("\tTelefono: "+this.conyuge.telefono);
        }
        
        //imprimir el LinkedList de hijos
        System.out.println("Hijos: ************");
        if( this.hijos == null )
            System.out.println("\tNo tiene hijos");
        else{
            if( this.hijos.size() == 0 )
                System.out.println("\tNo tiene hijos");
            else{
                //si hay hijos, recorrerlos e imprimir los que no sean null
                for( int i = 0; i < this.hijos.size(); i++ ){
                    if( this.hijos.get(i) != null ){
                        System.out.println("\tNombre: "+this.hijos.get(i).nombre);
                        System.out.println();
                    }
                }
            }
        }
    }    
}
