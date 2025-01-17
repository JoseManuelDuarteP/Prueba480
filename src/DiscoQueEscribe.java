public class DiscoQueEscribe extends DiscoQueAlmacena {
    private double velocidadEscritura;

    //CONSTRUCTOR
    public DiscoQueEscribe(String nombre, String tipo, int capacidad, double velocidadLectura, double velocidadEscritura, String contenido) {
        super(nombre, tipo, capacidad, velocidadLectura, contenido);
        this.velocidadEscritura = velocidadEscritura;
    }

    //GET&SET
    public double getVelocidadEscritura() {
        return velocidadEscritura;
    }

    public void setVelocidadEscritura(double velocidadEscritura) {
        this.velocidadEscritura = velocidadEscritura;
    }

    //METODOS
    public void escribir() {}

}
