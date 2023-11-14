/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11_abstraccion2;

/**
 *
 * @author Gerardo Portillo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Figura f1 = new Figura("Algo");
        Rectangulo r = new Rectangulo(12, 20);
        System.out.println("Area de r: "+r.calcularArea());
        System.out.println("Perimetro de r: "+r.calcularPerimetro());
        
        Circulo c = new Circulo(5);
        System.out.println("Area de c: "+c.calcularArea());
        System.out.println("Perimetro de c: "+c.calcularPerimetro());
        
        TrianguloEquilatero t = new TrianguloEquilatero(5,9);
        System.out.println("Area de t: "+t.calcularArea());
        System.out.println("Perimetro de t: "+t.calcularPerimetro());
    }
    
}
