package pkg02_captura2;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a,b,c,d, e;
        System.out.print("Digitar a: ");
        a = s.nextDouble();
        System.out.print("Digitar b: ");
        b = s.nextDouble();
        System.out.print("Digitar c: ");
        c = s.nextDouble();
        System.out.print("Digitar d: ");
        d = s.nextDouble();
        System.out.print("Digitar e: ");
        e = s.nextDouble();
        
        //solucion
        System.out.println("Resultado: "+( (a-b)/(Math.sqrt(c+d)-Math.PI)+e ));
    }
    
}
