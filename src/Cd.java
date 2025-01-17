public class Cd extends Disco {

    public Cd(String nombre, int capacidad, double velocidadLectura, double velocidadEscritura, String tipo, String contenido) {
        super(nombre, capacidad, velocidadLectura, velocidadEscritura, tipo, contenido);
    }

    @Override
    public void escribir() {
        System.out.println(this.getNombre() + " escribe con láser.");
    }

    @Override
    public void leer() {
        System.out.println(this.getNombre() + " lee con láser.");
    }

}