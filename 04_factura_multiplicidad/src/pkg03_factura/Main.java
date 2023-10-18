package pkg03_factura;
import java.util.Calendar;
public class Main {
    public static void main(String[] args) {
        CategoriaProducto cp1 = new CategoriaProducto("Bebidas", "1A");
        CategoriaProducto cp2 = new CategoriaProducto("Vegetales", "6B");
        
        Producto p1 = new Producto("Refresco 3L", cp1, 45);
        Producto p2 = new Producto("Agua Litro", cp1, 20);
        Producto p3 = new Producto("Tomate Lb", cp2, 21);
        Producto p4 = new Producto("Lechuga Unidad", cp2, 14);
        
        Cliente c1 = new Cliente("Filomeno Colinas", 123, 77777, "no tiene");
        
        //crear un objeto fecha
        Calendar fecha1 = Calendar.getInstance();
        /*año, mes, dia, mes se numera de 0 a 11*/
        fecha1.set(2023, 1, 28);
        
        //Array de productos para f1
        Producto[] pf1 = { p1, p2, null, p2, p1, p3, p4 };
        Factura f1 = new Factura(1, fecha1, null, pf1);
        f1.imprimir();
        
        Calendar fecha2 = Calendar.getInstance();
        fecha2.set(2023,10,13,17,30);
        
        //tambien se puede pasar un Array creandolo directamente
        //en el parametro del constructor. (in-line declaration)
        Factura f2 = new Factura(2, fecha2, c1, new Producto[]{ p2,p4,p3,p1 });
        f2.imprimir();
        //imprimir cuantos productos hay en f2
        System.out.print("cantidad de productos en f2: ");
        System.out.println( f2.getProductos().length );
        //numero de telefono del cliente en f2:
        System.out.print("Telefono de cliente en f2: ");
        System.out.println( f2.cliente.telefono );
        
        Calendar fecha3 = Calendar.getInstance();
        fecha3.set(2023, 10, 17);
        fecha3.add(Calendar.DAY_OF_MONTH, 10); //suma 27 dias
        fecha3.add(Calendar.MONTH, 2); //sumar 2 meses
        fecha3.add(Calendar.YEAR, -2); //restar 2 años
        
        System.out.println( fecha3.getTime() );
    }
    
}
