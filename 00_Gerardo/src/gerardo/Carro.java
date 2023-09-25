/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerardo;

/**
 *
 * @author Gerardo Portillo
 */
public class Carro {
    //atributos
    public String marca;
    public String modelo;
    public String color;
    public int anio;
    //constructores
    //constructor sin parametros
    public Carro(){
        //inicializar los atributos
        this.marca = "no tiene";
        this.modelo = "no definido";
        this.color = "no tiene";
        this.anio = 0;
    }
    //constructor con 4 parametros
    public Carro(String marca, String modelo, String color, int anio){
        this.color = color;
        this.marca = marca;
        this.anio = anio;
        this.modelo = modelo;
    }    
    //constructor con 2 parametros
    public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.color = "no determinado";
        this.anio = 0;
    }
}
