/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10_abstraccion1;

/**
 * Clase abstracta para definir a un ser vivo
 * @author Gerardo Portillo
 */
public abstract class SerVivo {
    //atributos
    public String especie;
    //constructor
    public SerVivo(String especie){
        this.especie = especie;
    }
    //metodos abstractos (metodos concretos)
    public abstract void hablar();
    public abstract void dormir();
    public abstract void alimentarse();
    public abstract void desplazarse();
    
    //metodos no abstractos
    public void vivir(){
        //por ejemplo, vivir necesita de 3 metodos abstractos para funcionar
        this.desplazarse();
        this.alimentarse();
        this.dormir();
    }
}
