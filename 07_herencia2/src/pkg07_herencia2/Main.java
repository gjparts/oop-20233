package pkg07_herencia2;
import java.util.Calendar;
public class Main {

    public static void main(String[] args) {
        Calendar f1 = Calendar.getInstance();
        f1.set(2023, 10, 2);
        Archivo a1 = new Archivo("algo", 12, "Text File",
                "txt", f1);
        a1.imprimir();
    }
    
}
