public class DiscoDuro extends DiscoQueEscribe {

    public DiscoDuro(String nombre, String tipo, int capacidad, double velocidadLectura, double velocidadEscritura, String contenido) {
        super(nombre, tipo, capacidad, velocidadLectura, velocidadEscritura, contenido);
    }

    @Override
    public void escribir() {
        System.out.println(this.getNombre() + " escribe con cabezal magnético.");
    }

    @Override
    public void leer() {
        System.out.println(this.getNombre() + " lee con cabezal magnético.");
    }

}
