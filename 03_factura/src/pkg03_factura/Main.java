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
        
        Factura f1 = new Factura(1, fecha1, null, p1);
        f1.producto2 = p2;
        f1.producto3 = null;
        f1.producto4 = p2;
        f1.imprimir();
        
        Calendar fecha2 = Calendar.getInstance();
        fecha2.set(2023,10,13,17,30);
        
        Factura f2 = new Factura(2, fecha2, c1, p2);
        f2.producto2 = p4;
        f2.producto3 = p3;
        f2.producto4 = p1;
        f2.imprimir();
        
        Calendar fecha3 = Calendar.getInstance();
        fecha3.set(2023, 10, 17);
        fecha3.add(Calendar.DAY_OF_MONTH, 10); //suma 27 dias
        fecha3.add(Calendar.MONTH, 2); //sumar 2 meses
        fecha3.add(Calendar.YEAR, -2); //restar 2 años
        
        System.out.println( fecha3.getTime() );
    }
    
}
