/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_captura1;

/**
 *
 * @author Gerardo Portillo
 */
import java.util.Scanner;   //importar clase Scanner
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*crear un nuevo objeto de clase Scanner
        cuyo origen sea el input de sistema o sea la consola*/
        Scanner lector = new Scanner(System.in);
        //declarar variables de trabajo
        int a,b;
        //hacer los input
        System.out.print("Digitar a: ");
        a = lector.nextInt();
        System.out.print("Digitar b: ");
        b = lector.nextInt();
        //procesamiento y salida
        System.out.println( "La suma de ambos valores es: "+(a+b) );
    }
    
}
