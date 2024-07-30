package Conductores;

public class Conductor {
    protected String nombre;
    protected String licencia;

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Licencia: " + licencia);
    }
}
