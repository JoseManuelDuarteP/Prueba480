public class Main {
    public static void main(String[] args) {

        Cd cd = new Cd("CD de Paco",12,100,100,"CD-ROM","Fotos de boda");
        cd.informar();
        cd.escribir();

        DiscoDuro discoDuro = new DiscoDuro("Unidad C",250,500,500,"Kingstone","Juegos y videos");
        discoDuro.informar();
        discoDuro.escribir();

        BlueRay blueRay = new BlueRay("BlueRay de Manolo",20,150,150,"BD-R","Blancanieves");
        blueRay.informar();
        blueRay.girar();
    }
}
