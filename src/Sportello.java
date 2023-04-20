public class Sportello {
    private boolean occupato = false;

    Sportello() {
    }

    public synchronized void rilasciaModulo() {
        String nome = Thread.currentThread().getName();
        System.out.println(nome + " prende il modulo");
    }

    public synchronized void stampa() {
        try {
            String nome = Thread.currentThread().getName();
            while (occupato) {
                wait();
            }
            occupato = true;
            System.out.println(nome + " in attesa di ricevere la carta d'identita'");
            Thread.sleep((long) (int) ((Math.random() * 3000) + 1));
            System.out.println(nome + " ha finito: Grazie e arrivederci!");
            occupato = false;
            notifyAll();

        } catch (Exception e) {
        }
    }
}
