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
        
        Persona pe1 = new Persona("Gerardo", 40, 'M', "SPS", true);
        pe1.imprimir();
        pe1.saludar(true);
        pe1.saludar(false);
        
        Persona pe2 = new Persona("Filomeno Colinas", 'M');
        pe2.imprimir();
    }
    
}
