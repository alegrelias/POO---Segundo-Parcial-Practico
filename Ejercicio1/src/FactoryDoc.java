//Se aplica Factory Method
public abstract class FactoryDoc {
    
    protected abstract Documento crearDocumento();

    public void organizarDocumento(){

        Documento d = crearDocumento();

        d.mostrarFormato();
    }

}
