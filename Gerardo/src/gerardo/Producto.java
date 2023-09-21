package gerardo;

public class Producto {
    //atributos
    public String codigo;
    public String nombre;
    public String fabricante;
    public int existencias;
    public boolean importado;
    //constructores
    public Producto(){
        this.codigo = "No tiene";
        this.nombre = "No tiene";
        this.fabricante = "No tiene";
        this.existencias = 0;
        this.importado = false;
    }
    public Producto(String codigo, String nombre, String fabricante, boolean importado){
        //ejecutar el constructor sin parametros
        this();
        //luego llenar lo que viene por parametros
        this.codigo = codigo;
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.importado = importado;
    }
    public Producto(String codigo,
                    String nombre,
                    String fabricante,
                    int existencias,
                    boolean importado){
        //ejecutar el constructor de 4 parametros
        this(codigo, nombre, fabricante, importado);
        //luego llenar lo que viene por parametros
        this.existencias = existencias;
    }
}
