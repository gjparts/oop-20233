package pkg02_smartphone;
public class Main {
    public static void main(String[] args) {
        Operador tigo = new Operador("TIGO","Honduras");
        Operador claro = new Operador("Claro C.A.","Honduras");
        
        Fabricante samsung = new Fabricante("SAMSUNG", "Korea", "Algun Kim");
        Fabricante sony = new Fabricante("Sony", "Japon", "No se");
        Fabricante apple = new Fabricante("Apple", "USA", "Tim Cook");
        
        Bateria b1 = new Bateria(samsung, 4500);
        Bateria b2 = new Bateria(samsung, 3500);
        Bateria b3 = new Bateria(apple, 6000);
        //lo siguiente no se puede hacer:
        //Bateria b4 = new Bateria(null, 6000);
        
        Chip sim1 = new Chip(tigo, 99152959);
        Chip sim2 = new Chip(tigo, 97471717);
        Chip sim3 = new Chip(claro, 33153315);
        Chip sim4 = new Chip(claro, 34345454);
        
        Smartphone iPhone15 = new Smartphone(apple, "iPhone 15", 512, 16, b3, sim1, null);
        iPhone15.imprimir();
        
        Smartphone s1 = new Smartphone(samsung, "Galaxy s21", 256, 8, b1, sim3, sim4);
        s1.imprimir();
    }
    
}
