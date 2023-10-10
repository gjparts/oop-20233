/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_smartphone;

/**
 * Representa un SIM Card para telefonia celular
 * @author Gerardo Portillo
 */
public class Chip {
    //atributos
    private Operador proveedor;
    public int numeroTelefonico;
    //constructor
    public Chip(Operador proveedor, int numeroTelefonico){
        if( proveedor == null )
            throw new IllegalArgumentException("Debe definir el proveedor");
        else
            this.proveedor = proveedor; //se acepta
        
        
        this.numeroTelefonico = numeroTelefonico;
    }
    //metodos
    /**
     * Devuelve el proveedor de servicios telefonicos asignado a este Chip
     * @return un objeto de clase Operador
     */
    public Operador getProveedor(){
        return this.proveedor;
    }
}
