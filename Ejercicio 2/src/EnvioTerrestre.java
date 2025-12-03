public class EnvioTerrestre implements Envio{
    //Se aplica patrón Singleton
    private static EnvioTerrestre instanciaUnica;

    private EnvioTerrestre(){}

    public static EnvioTerrestre getInstance(){
        if(instanciaUnica == null){
            instanciaUnica = new EnvioTerrestre();
        }
        return instanciaUnica;
    }

    //Se aplica patrón Strategy
    @Override
    public double calcularPrecioEnvio(Paquete p) {
        return ( (p.getDistancia() * 0.50) + (p.getPeso() * 1.50) );
    }
    
}
