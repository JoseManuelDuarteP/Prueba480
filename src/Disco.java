public abstract class Disco {
    private String nombre;
    private String tipo;

    //CONSTRUCTOR
    public Disco
            (String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    //GET&SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //TIPO: CD, SSD, HDD...

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String toString() {
        return "Nombre :" + nombre + " Tipo: " + tipo;
    }

    //METODOS AQUÍ

    public void girar() {
        System.out.println(this.nombre + " girando");
    }

}
