/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08_polimorfismo1;

/**
 *
 * @author Gerardo Portillo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //pruebas
        Animal a1 = new Animal("Jirafa", "Mamifero", 4, true);
        a1.imprimir();
        a1.hablar();
        
        Gato g1 = new Gato("Misifus", true, true, 4);
        g1.imprimir();
        g1.hablar();
        g1.ronronear();
        
        Perro p1 = new Perro("Firulais",true, true, 4, "Mixto");
        p1.imprimir();
        p1.hablar();
        p1.jugar();
        p1.analizar();
    }
    
}
