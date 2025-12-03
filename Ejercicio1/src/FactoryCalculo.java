//Se aplica Factory Method
public class FactoryCalculo extends FactoryDoc{

    @Override
    protected Documento crearDocumento() {
        return new DocumentoCalculo();
    }
    
}
