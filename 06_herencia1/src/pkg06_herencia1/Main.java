package pkg06_herencia1;
public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Fenestacio", "20012002049", "Sistemas");
        e1.edad = 40;
        e1.genero = 'M';
        e1.saludar();
        e1.estudiar();
        System.out.println(e1.edad);
        
        Persona p1 = new Persona();
        p1.nombre = "Filomeno";
        p1.saludar();
    }
    
}
