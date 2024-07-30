import Conductores.ConductorDeCoche;
import Conductores.ConductorDeMoto;
import umg.progra2.vehiculos.Coche;
import umg.progra2.vehiculos.Moto;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "22R", 2024, 4);
        coche.MostrarDetalles();
        ConductorDeCoche conductorDeCoche = new ConductorDeCoche("Juan", "12345", 5);
        conductorDeCoche.mostrarInformacion();

        Moto moto = new Moto("Honda","Motocross",2024,false);
        moto.MostrarDetalles();
        ConductorDeMoto conductorDeMoto = new ConductorDeMoto("Ana", "67890", true);
        conductorDeMoto.mostrarInformacion();
    }
}

