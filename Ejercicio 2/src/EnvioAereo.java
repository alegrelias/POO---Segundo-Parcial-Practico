public class EnvioAereo implements Envio{
    //Se aplica patrón Singleton
    private static EnvioAereo instanciaUnica;

    private EnvioAereo(){}

    public static EnvioAereo getInstance(){
        if(instanciaUnica == null){
            instanciaUnica = new EnvioAereo();
        }
        return instanciaUnica;
    }

    //Se aplica patrón Strategy
    @Override
    public double calcularPrecioEnvio(Paquete p) {
        return ( (p.getDistancia() * 1.00) + (p.getPeso() * 3.00) + 20.00 );
    }
    
}
