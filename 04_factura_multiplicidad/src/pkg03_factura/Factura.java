package pkg03_factura;

/**
 * Representa una Factura
 * @author Gerardo Portillo
 */
import java.util.Calendar;  //clase para el manejo de fechas
import java.text.SimpleDateFormat; //clase para dar formato a fecha
public class Factura {
    //atributos
    public int numero;
    public Calendar fecha;
    public Cliente cliente;
    private Producto[] productos;//multiplicidad
                                 //Array que contiene los productos de la factura
    //constructor
    public Factura(int numero, Calendar fecha, Cliente cliente,
                    Producto[] productos){
        //Array productos no puede ser null
        if( productos == null )
            throw new IllegalArgumentException("productos no puede ser null");
        else{
            //Array productos debe tener al menos un elemento
            if( productos.length == 0 )
                throw new IllegalArgumentException("Debe haber al menos un producto");
            else{
                if( productos[0] == null )
                    throw new IllegalArgumentException("Primer producto no puede ser null");
                else
                    this.productos = productos; //se acepta
            }
        }
        
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
    }
    //metodos
    public Producto[] getProductos() {
        return this.productos;
    }
    
    public void imprimir(){
        float subtotal = 0.00f;
        
        System.out.println("********** Factura **********");
        System.out.println("Numero: "+this.numero);
        
        System.out.print("Fecha: ");
        if( this.fecha == null )
            System.out.println("No tiene");
        else{
            SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss a");
            System.out.println( formato.format(this.fecha.getTime()) );
        }
        
        //si cliente es null entonces es consumidor final y no imprimir rtn
        //si cliente no es null imprimir nombre del cliente y su rtn
        System.out.print("Cliente: ");
        if( this.cliente == null )
            System.out.println("Consumidor Final");
        else{
            System.out.println(this.cliente.nombre);
            System.out.println("\tRTN: "+this.cliente.rtn);
        }
        //tabla de productos
        System.out.println("Producto\tPrecio");
        //recorrer Array de Producto
        for( int i = 0; i < productos.length; i++ ){
            //imprimir solo si el item no es nulo
            if( productos[i] != null ){
                System.out.print(this.productos[i].nombre);
                System.out.println("\t"+this.productos[i].precioVenta);
                subtotal += this.productos[i].precioVenta;
            }
        }
        
        //sumario
        System.out.println("Sub-total: "+subtotal);
        System.out.println("ISV 15%: "+subtotal*0.15);
        System.out.println("Total: "+subtotal*1.15);
    }
}
