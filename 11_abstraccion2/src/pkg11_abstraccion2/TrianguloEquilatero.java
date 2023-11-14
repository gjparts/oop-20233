package pkg11_abstraccion2;
public class TrianguloEquilatero extends Figura {
    //atributos
    private double base;
    private double altura;
    //constructor
    public TrianguloEquilatero(double base, double altura){
        super("TrianguloEquilatero");
        this.base = base;
        this.altura = altura;
    }
    //implementar los metodos abstractos
    @Override
    public double calcularArea(){
        return this.altura*this.base/2;
    }
    @Override
    public double calcularPerimetro(){
        return 3*this.base;
    }
    //metodos
    public double getBase() {
        return this.base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return this.altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
