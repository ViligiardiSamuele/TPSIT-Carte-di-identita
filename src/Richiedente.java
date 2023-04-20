import javax.sound.sampled.SourceDataLine;

public class Richiedente extends Thread {
    private Sportello sp;

    Richiedente(String name, Sportello sp) {
        super(name);
        this.sp = sp;
    }
    @Override
    public void run() {
        try {
            String nome = Thread.currentThread().getName();
            System.out.println(nome + " richiede il modulo");
            sp.rilasciaModulo();
            Thread.sleep((long) (int) ((Math.random() * 5000) + 1));
            System.out.println(nome + " richiede la stampa della carta di identita'");
            sp.stampa();
            System.out.println(nome + " ha finito: Grazie arrivedenrci!");
        } catch (Exception e) {
            
        }
    }
}
