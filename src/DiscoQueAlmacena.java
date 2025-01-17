public abstract class DiscoQueAlmacena extends Disco {
    private int capacidad;
    private double velocidadLectura;
    private String contenido;

    //CONSTRUCTOR
    public DiscoQueAlmacena(String nombre, String tipo, int capacidad, double velocidadLectura, String contenido) {
        super(nombre, tipo);
        this.capacidad = capacidad;
        this.velocidadLectura = velocidadLectura;
        this.contenido = contenido;
    }

    //GET&SET
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getVelocidadLectura() {
        return velocidadLectura;
    }

    public void setVelocidadLectura(double velocidadLectura) {
        this.velocidadLectura = velocidadLectura;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    //METODOS
    public void almacenar() {
        System.out.println(this.getNombre() + " almacena " + this.capacidad + " GB");
    }

    public void leer() {}

    public void informar() {
        System.out.println("Nombre: " + this.getNombre() + "\n Capacidad: " + this.capacidad + " GB"
                + "\n Velocidad de lectura: " + this.velocidadLectura + " MB/s"
                + "\n Tipo: " + this.getTipo() + "\n Contenido: " + this.contenido);
    }

}
