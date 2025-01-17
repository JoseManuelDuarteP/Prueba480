public abstract class DiscoQueEscribe extends DiscoQueAlmacena {
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

    @Override
    public void informar() {
        System.out.println("Nombre: " + this.getNombre() + "\n Capacidad: " + this.getCapacidad() + " GB"
                + "\n Velocidad de lectura: " + this.getVelocidadLectura() + " MB/s"
                + "\n Velocidad de lectura: " + this.getVelocidadEscritura() + " MB/s"
                + "\n Tipo: " + this.getTipo() + "\n Contenido: " + this.getContenido());
    }

}
