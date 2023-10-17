package pkg03_factura;

public class Main {
    public static void main(String[] args) {
        CategoriaProducto cp1 = new CategoriaProducto("Bebidas", "1A");
        CategoriaProducto cp2 = new CategoriaProducto("Vegetales", "6B");
        
        Producto p1 = new Producto("Refresco 3L", cp1, 45);
        Producto p2 = new Producto("Agua Litro", cp1, 20);
        Producto p3 = new Producto("Tomate Lb", cp2, 21);
        Producto p4 = new Producto("Lechuga Unidad", cp2, 14);
        
        Cliente c1 = new Cliente("Filomeno Colinas", 123, 77777, "no tiene");
        
        Factura f1 = new Factura(1, "2023-13-10", null, p1);
        f1.producto2 = p2;
        f1.producto3 = null;
        f1.producto4 = p2;
        f1.imprimir();
        
        Factura f2 = new Factura(2, "2023-13-10", c1, p2);
        f2.producto2 = p4;
        f2.producto3 = p3;
        f2.producto4 = p1;
        f2.imprimir();
    }
    
}
