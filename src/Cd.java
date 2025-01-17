public class Cd extends DiscoQueEscribe {


    public Cd(String nombre, String tipo, int capacidad, double velocidadLectura, double velocidadEscritura, String contenido) {
        super(nombre, tipo, capacidad, velocidadLectura, velocidadEscritura, contenido);
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