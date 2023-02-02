package Observer;

public class SurpiseParty {

    public static void main(String[] args) {

        Concierge concierge = new Concierge();

        concierge.registerObserver(e -> {
            System.out.println("Avisar os convidados.");
            System.out.println("Apagar as luzes.");
            System.out.println("Esperar um pouco.");
            System.out.println("Surpresa!!!");
            System.out.println("Ocorreu em: " + e.getMoment());
        });
        concierge.toMonitor();
    }
}
