package pkg03_factura;

/**
 * Representa una Factura
 * @author Gerardo Portillo
 */
import java.util.Calendar;  //clase para el manejo de fechas
public class Factura {
    //atributos
    public int numero;
    public String fecha;
    public Cliente cliente;
    private Producto producto1;
    public Producto producto2;
    public Producto producto3;
    public Producto producto4;
    //constructor
    public Factura(int numero, String fecha, Cliente cliente, Producto producto1){
        //producto1 es obligatorio
        if( producto1 == null )
            throw new IllegalArgumentException("producto1 no puede ser null");
        else
            this.producto1 = producto1;
        
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        //los productos del 2 al 4 inicializarlos en null (como buena practica)
        this.producto2 = null;
        this.producto3 = null;
        this.producto4 = null;
    }
    //metodos
    public Producto getProducto1() {
        return this.producto1;
    }
    public Producto getProducto2() {
        return this.producto2;
    }
    public Producto getProducto3() {
        return this.producto3;
    }
    public Producto getProducto4() {
        return this.producto4;
    }
    
    public void imprimir(){
        float subtotal = 0.00f;
        
        System.out.println("********** Factura **********");
        System.out.println("Numero: "+this.numero);
        System.out.println("Fecha: "+this.fecha);
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
        //el producto1 al ser obligatorio no viene null
        System.out.print(this.producto1.nombre);
        System.out.println("\t"+this.producto1.precioVenta);
        subtotal += this.producto1.precioVenta;
        
        //producto2
        if( this.producto2 == null )
            System.out.println("-\t0.00");
        else{
            System.out.print(this.producto2.nombre);
            System.out.println("\t"+this.producto2.precioVenta);
            subtotal += this.producto2.precioVenta;
        }
        //producto3
        if( this.producto3 == null )
            System.out.println("-\t0.00");
        else{
            System.out.print(this.producto3.nombre);
            System.out.println("\t"+this.producto3.precioVenta);
            subtotal += this.producto3.precioVenta;
        }
        //producto4
        if( this.producto4 == null )
            System.out.print("-\t0.00");
        else{
            System.out.print(this.producto4.nombre);
            System.out.println("\t"+this.producto4.precioVenta);
            subtotal += this.producto4.precioVenta;
        }
        
        //sumario
        System.out.println("Sub-total: "+subtotal);
        System.out.println("ISV 15%: "+subtotal*0.15);
        System.out.println("Total: "+subtotal*1.15);
    }
}
