import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Sportello sp = new Sportello();
        List<Richiedente> elencoPersone = new ArrayList<Richiedente>();
        elencoPersone.add(new Richiedente("Mario", sp));
        elencoPersone.add(new Richiedente("Luca", sp));
        elencoPersone.add(new Richiedente("Paola", sp));
        elencoPersone.add(new Richiedente("Filippo", sp));
        elencoPersone.add(new Richiedente("Giorgio", sp));
        for(Richiedente r : elencoPersone)
            r.start();
        
    }
}