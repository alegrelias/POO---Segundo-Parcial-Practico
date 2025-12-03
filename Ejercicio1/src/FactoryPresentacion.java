//Se aplica Factory Method
public class FactoryPresentacion extends FactoryDoc{

    @Override
    protected Documento crearDocumento() {
        return new DocumentoPresentacion();
    }
    
}
