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
        //Empresas
        Empresa e1 = new Empresa("Leche SULA", d3, 12345678);
        Empresa e2 = new Empresa("Dilex", d2, 7777777);
        Empresa e3 = new Empresa("Robert's Tire",d1,123456);
        //Personas
        Persona p1 = new Persona("1234123412345", "Acsel Rosado", 12313213);
        p1.direccion = d1;
        p1.imprimir();
        
        Persona p2 = new Persona("32133123","Curco Bain",3243242);
        p2.empresaLabora = e2;
        p2.direccion = new Direccion( new Barrio("Las Brisas","Este","20000") );
        p2.direccion.calle = "Cerca del parque";
        //ponerle dos mascotas a p2
        Mascota firulais = new Mascota("Firulais Perez", "Perro");
        Mascota misifus = new Mascota("Misifus", "Gato");
        Mascota[] arr1 = { firulais, misifus };
        p2.mascotas = arr1;
        p2.imprimir();
        
        Persona p3 = new Persona("1321313", "Estebancito Maravilla", 3121322);
        Mascota rapaz = new Mascota("Ave Rapaz", "Halcón");
        p3.mascotas = new Mascota[]{rapaz, new Mascota("Terry","Lobo")};
        p3.imprimir();
        
        Persona p4 = new Persona("7868767", "Edmundo Dantés", 97979797);
        p4.diplomas.push( new Diploma("INFOP","torno y Fresa") );
        Diploma di1 = new Diploma("UDEMY", "CSS basico");
        p4.diplomas.push( di1 );
        p4.imprimir();
        
        Persona p5 = new Persona("1","Zeus",1111111);
        Persona p6 = new Persona("2","Hera",2222222);
        Persona p7 = new Persona("3","Ares",3333333);
        Persona p8 = new Persona("4","Atenea",444444);
        
        p5.conyuge = p6;
        p5.hijos.push(p7);
        p5.hijos.push(p8);
        p5.hijos.push( new Persona("5","Hercules",564564) );
        p5.imprimir();
        
        p6.conyuge = p5;
        p6.hijos = p5.hijos;
        p6.imprimir();
        
        p6.hijos.push( new Persona("6","Perseo",32132143) );
        p6.imprimir();
        p5.imprimir();
    }
}
