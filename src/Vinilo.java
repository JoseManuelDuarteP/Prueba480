public class Vinilo extends DiscoQueAlmacena {

    public Vinilo(String nombre, String tipo, int capacidad, double velocidadLectura, String contenido) {
        super(nombre, tipo, capacidad, velocidadLectura, contenido);
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
                + "\n Velocidad de lectura: " + this.getVelocidadLectura() + " RPM"
                + "\n Tipo: " + this.getTipo() + "\n Contenido: " + this.getContenido());
    }
}
