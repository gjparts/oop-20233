package pkg05_persona;

public class Main {
    public static void main(String[] args) {
        //Barrios
        Barrio cabanas = new Barrio("Cabañas", "Este", "21104");
        Barrio villassol = new Barrio("Villas del Sol","Oeste","1234");
        Barrio jardines = new Barrio("Jardines del Valle","Oeste","4567");
        //Direcciones
        Direccion d1 = new Direccion(cabanas);
        d1.avenida = "15";
        d1.calle = "15";
        d1.casa = "1033";
        Direccion d2 = new Direccion(jardines);
        d2.avenida = "bulevar principal";
        Direccion d3 = new Direccion(villassol);
        d3.calle = "carretera a la UNAH-VS";
        
        
    }
}
