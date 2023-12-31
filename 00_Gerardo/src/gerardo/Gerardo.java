/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerardo;

/**
 *
 * @author Gerardo Portillo
 */
public class Gerardo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro c1 = new Carro();
        
        System.out.println( c1 );
        System.out.println( c1.marca );
        System.out.println( c1.modelo );
        System.out.println( c1.color );
        System.out.println( c1.anio );
        
        c1.marca = "Toyota";
        System.out.println( c1.marca );
        
        Carro c2 = new Carro("Honda", "Civic", "Negro", 2004);
        System.out.println("*******************************");
        System.out.println( c2.marca );
        System.out.println( c2.modelo );
        System.out.println( c2.color );
        System.out.println( c2.anio );
        
        c2.anio = 2012;
        System.out.println( c2.anio );
        
        Carro c3 = new Carro("Hyundai", "Accent");
        System.out.println("*******************************");
        System.out.println( c3.marca );
        System.out.println( c3.modelo );
        System.out.println( c3.color );
        System.out.println( c3.anio );
        
        //pruebas
        Producto p1 = new Producto("P0001", "Coca Cola 3LT", "Coca Cola", 15, false);
        System.out.println( p1.nombre );
        System.out.println( p1.codigo );
        System.out.println( p1.fabricante );
        System.out.println( p1.importado );
        System.out.println( p1.existencias );
        
        Persona pe1 = new Persona("Gerardo", 40, 'O', "SPS", true);
        pe1.setGenero('M');
        pe1.imprimir();
        pe1.saludar(true);
        pe1.saludar(false);
        
        Persona pe2 = new Persona("Filomeno Colinas", 'M');
        pe2.imprimir();
        System.out.println("El genero de pe2 es "+pe2.getGenero());
        
        Persona pe3 = new Persona("Kurco Bain", 25, 'M', "Seatle", false);
        System.out.println("La edad de pe3 es "+pe3.getEdad());
        System.out.println("El genero de pe3 es "+pe3.getGenero());
        
        Empleado e1 = new Empleado("Gerardo",40);
        e1.setGenero('M');
        e1.imprimir();
        
        Empleado e2 = new Empleado("Estevancito Maravilla", 70,
                            'M', 'C', 'P', 40000);
        e2.imprimir();
    }
    
}
