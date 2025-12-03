import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<FactoryDoc> docs = new ArrayList<>(); 

        docs.add(new FactoryTexto());
        docs.add(new FactoryCalculo());
        docs.add(new FactoryPresentacion());

        for(FactoryDoc d : docs){
            d.organizarDocumento();
        }

    }
    
}
