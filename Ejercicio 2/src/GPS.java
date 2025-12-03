public class GPS {
    private Envio estrategia;

    public GPS(Envio estrategia) {
        this.estrategia = estrategia;
    }

    //Se aplica patrón Strategy
    public void enviar(Paquete p){
        System.out.println(estrategia.calcularPrecioEnvio(p));;
    }

    public Envio getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(Envio estrategia) {
        this.estrategia = estrategia;
    }
}
