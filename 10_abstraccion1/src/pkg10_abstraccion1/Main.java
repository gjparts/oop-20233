package pkg10_abstraccion1;
public class Main {
    public static void main(String[] args) {
        //No se puede instanciar clases abstractas
        //por medios convencionales
        //SerVivo s1 = new SerVivo("Cactus");
        //Si se puede instanciar una clase abstracta
        //si Usted implementa los metodos abstractos
        //en tiempo de ejecucion:
        /*
        SerVivo s2 = new SerVivo("Cactus"){
            @Override
            public void hablar(){
                
            }
            @Override
            public void desplazarse(){
                
            }
            @Override
            public void alimentarse(){
                
            }
            @Override
            public void dormir(){
                
            }
        };*/
        Gato g1 = new Gato("Misifus");
        g1.vivir();
        g1.hablar();
        g1.alimentarse();
        g1.dormir();
        g1.desplazarse();
        
        Humano h1 = new Humano("Gerardo");
        h1.hablar();
        h1.vivir();
    }
    
}
