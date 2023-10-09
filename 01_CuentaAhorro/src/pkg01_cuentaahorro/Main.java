package pkg01_cuentaahorro;

/**
 *
 * @author Gerardo Portillo
 */
import java.util.Scanner;
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        CuentaAhorro c1 = new CuentaAhorro("Gerardo", "231231321");
        int opcion;
        do{
            System.out.println("*********************************");
            System.out.println("1- Depositar");
            System.out.println("2- Retirar");
            System.out.println("3- Consultar Saldo");
            System.out.println("4- Salir");
            System.out.print("Digitar la opcion deseada: ");
            opcion = s.nextInt();
            System.out.println("*********************************");
            
            if( opcion == 1 ){
                try{
                    System.out.print("Digite el monto a depositar: ");
                    c1.depositar( s.nextFloat() );
                }catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
            }
            if( opcion == 2 ){
                try{
                    System.out.print("Digite el monto a retirar: ");
                    c1.retirar( s.nextFloat() );
                }catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
            }
            if( opcion == 3 )
                System.out.println("El saldo actual es: "+c1.getSaldo());
            
        }while(opcion != 4);
        
    }
    
}
