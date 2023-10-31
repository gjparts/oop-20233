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
        
        Empleado t1 = new Empleado(24000, "Programador JR");
        t1.saludar();
        t1.trabajar();
        
        Practicante pr1 = new Practicante("Mario Baracus", 78, 'M', 2);
        pr1.saludar();
        pr1.trabajar();
        
        Catedratico c1 = new Catedratico("Gerardo", 42, 'M', "Programacion", 15000);
        c1.saludar();
        c1.trabajar();
        c1.educar();
    }
    
}
