public class Main {
    public static void main(String[] args) {

        Paquete paquete = new Paquete(10, 100);

        GPS miGps = new GPS(EnvioTerrestre.getInstance());

        System.out.print("Precio del envío en la ruta terrestre: $");
        miGps.enviar(paquete);
        
        miGps.setEstrategia(EnvioAereo.getInstance());;

        System.out.print("Precio del envío en la ruta aerea: $");
        miGps.enviar(paquete);
    }
}
