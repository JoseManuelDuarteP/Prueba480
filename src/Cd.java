public class Cd extends Dispositivo {

    public Cd(String nombre, int capacidad, double velocidadLectura, double velocidadEscritura, String tipo) {
        super(nombre, capacidad, velocidadLectura, velocidadEscritura, tipo);
    }

    @Override
    public void escribir() {
        System.out.println(getNombre() + " escribe con láser.");
    }

    @Override
    public void leer() {
        System.out.println(getNombre() + " lee con láser.");
    }

}