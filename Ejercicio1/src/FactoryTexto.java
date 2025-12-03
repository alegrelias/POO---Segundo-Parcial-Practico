//Se aplica Factory Method
public class FactoryTexto extends FactoryDoc{

    @Override
    protected Documento crearDocumento() {
        return new DocumentoTexto();
    }
    
}
