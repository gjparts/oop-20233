package pkg03_factura;

/**
 * Representa una Factura
 * @author Gerardo Portillo
 */
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
        System.out.println("********** Factura **********");
        System.out.println("Numero: "+this.numero);
        System.out.println("Fecha: "+this.fecha);
        //si cliente es null entonces es consumidor final y no imprimir rtn
        //si cliente no es null imprimir nombre del cliente y su rtn
        
    }
}
