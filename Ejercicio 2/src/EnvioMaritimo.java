public class EnvioMaritimo implements Envio{
    //Se aplica patrón Singleton
    private static EnvioMaritimo instanciaUnica;

    private EnvioMaritimo(){}

    public static EnvioMaritimo getInstance(){
        if(instanciaUnica == null){
            instanciaUnica = new EnvioMaritimo();
        }
        return instanciaUnica;
    }

    //Se aplica patrón Strategy
    @Override
    public double calcularPrecioEnvio(Paquete p) {
        return ( (p.getDistancia() * 0.10) + (p.getPeso() * 5.00) ) + 50.00; //precio del contenedor 50.00
    }
    
}
