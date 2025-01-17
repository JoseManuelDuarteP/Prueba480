public abstract class Dispositivo {
    private String nombre;
    private int capacidad;
    private double velocidadLectura;
    private double velocidadEscritura;
    private String tipo;

    public Dispositivo
            (String nombre, int capacidad, double velocidadLectura , double velocidadEscritura, String tipo) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.velocidadLectura = velocidadLectura;
        this.velocidadEscritura = velocidadEscritura;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

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

    public double getVelocidadEscritura() {
        return velocidadEscritura;
    }

    public void setVelocidadEscritura(double velocidadEscritura) {
        this.velocidadEscritura = velocidadEscritura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String toString() {
        return "Nombre :" + nombre + " Capacidad: " + capacidad + " Velocidad: " + velocidadLectura;
    }

    //METODOS AQUÍ

    public void girar() {
        System.out.println(this.nombre + " girando");
    }

    public void almacenar() {
        System.out.println(this.nombre + " almacena " + this.capacidad);
    }

    public abstract void escribir();

    public abstract void leer();

    public void informar() {
        System.out.println("Nombre: " + this.nombre + "\n Capacidad: " + this.capacidad
        + "\n Velocidad de lectura: " + this.velocidadLectura + "MB/s"
        + "\n Velocidad de escritura: " + this.velocidadEscritura + "MB/s"
        + "\n Tipo: " + this.tipo);
    }

}
