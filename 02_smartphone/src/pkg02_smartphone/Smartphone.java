/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_smartphone;

/**
 * Representa a un SmartPhone
 * @author Gerardo Portillo
 */
public class Smartphone {
    //atributos
    private Fabricante marca;
    private String modelo;
    private int almacenamiento;
    private int ram;
    private Bateria bateria;
    public Chip chip1;
    public Chip chip2;
    //constructor
    public Smartphone(Fabricante marca, String modelo, int almacenamiento,
            int ram, Bateria bateria, Chip chip1, Chip chip2){
        if( marca == null )
            throw new IllegalArgumentException("Marca no puede ser null");
        else
            this.marca = marca;
        
        if( bateria == null )
            throw new IllegalArgumentException("Bateria no puede ser null");
        else
            this.bateria = bateria;
        
        this.modelo = modelo;
        this.almacenamiento = almacenamiento;
        this.ram = ram;
        this.chip1 = chip1;
        this.chip2 = chip2;
    }
    //metodos
    public Fabricante getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getAlmacenamiento() {
        return this.almacenamiento;
    }

    public int getRam() {
        return this.ram;
    }

    public Bateria getBateria() {
        return this.bateria;
    }
    
    public void imprimir(){
        System.out.println("****************** Smartphone ******************");
        System.out.println("Fabricante: "+this.marca.nombre);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Almacenamiento: "+this.almacenamiento+"GB");
        System.out.println("RAM: "+this.ram+"GB");
        System.out.println("Bateria: ");
        System.out.println("\tMarca:"+this.bateria.getMarca().nombre);
        System.out.println("\tMiliamperios: "+this.bateria.miliAmperios);
        //imprimir lo chips (los cuales son opcionales)
        System.out.print("Chip 1: ");
        if( this.chip1 == null )
            System.out.println("No tiene");
        else{
            System.out.println("\n\tOperador: "+this.chip1.getProveedor().nombre);
            System.out.println("\tNumero: "+this.chip1.numeroTelefonico);
        }
        System.out.print("Chip 2: ");
        if( this.chip2 == null )
            System.out.println("No tiene");
        else{
            System.out.println("\n\tOperador: "+this.chip2.getProveedor().nombre);
            System.out.println("\tNumero: "+this.chip2.numeroTelefonico);
        }
    }
}
