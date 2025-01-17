public class Main {
    public static void main(String[] args) {

        Cd cd = new Cd("CD de Paco","CD-ROM",12,100,100,"Fotos de boda");
        cd.informar();
        cd.escribir();

        DiscoDuro discoDuro = new DiscoDuro("Unidad C","Kingstone",250,500,500,"Juegos y videos");
        discoDuro.informar();
        discoDuro.escribir();

        BlueRay blueRay = new BlueRay("BlueRay de Manolo","BD-R",20,150,150,"Blancanieves");
        blueRay.informar();
        blueRay.girar();

        Rueda rueda = new Rueda("Rueda","Madera");
        rueda.girar();

        Vinilo vinilo = new Vinilo("Éxitos de Beethoven","LP",22,33,"8ª sinfonía de Beethoven");
        vinilo.informar();
        vinilo.leer();
    }
}
