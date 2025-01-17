public class DiscoDuro extends Dispositivo {

    public DiscoDuro(String nombre, int capacidad, double velocidadLectura, double velocidadEscritura, String tipo, String contenido) {
        super(nombre, capacidad, velocidadLectura, velocidadEscritura, tipo, contenido);
    }

    @Override
    public void escribir() {
        System.out.println(this.getNombre() + " escribe con cabezal magnético.");
    }

    @Override
    public void leer() {
        System.out.println(this.getNombre() + " escribe con cabezal magnético.");
    }

}
