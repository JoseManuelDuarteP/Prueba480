public class Vinilo extends Disco {

    public Vinilo(String nombre, int capacidad, double velocidadLectura, double velocidadEscritura, String tipo, String contenido) {
        super(nombre, capacidad, velocidadLectura, velocidadEscritura, tipo, contenido);
    }

    @Override
    public void leer() {
        System.out.println(this.getNombre() + " lee con punta de diamante.");
    }

    @Override
    public void almacenar() {
        System.out.println(this.getNombre() + " almacena " + this.getCapacidad() + " minutos de música.");
    }

    @Override
    public void informar() {
        System.out.println("Nombre: " + this.getNombre() + "\n Capacidad: " + this.getCapacidad() + " minutos de música"
                + "\n Velocidad de lectura: " + this.getVelocidadLectura() + "RPM"
                + "\n Velocidad de escritura: " + this.getVelocidadEscritura() + "RPM"
                + "\n Tipo: " + this.getTipo() + "\n Contenido: " + this.getContenido());
    }
}
