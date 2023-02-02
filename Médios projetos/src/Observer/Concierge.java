package Observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Concierge {

    private List<ObservantArrivalOfTheBirthtdayBoy> observer = new ArrayList<>();

    public void registerObserver(ObservantArrivalOfTheBirthtdayBoy o) {
        observer.add(o);
    }

    public void toMonitor() {
        Scanner inputScanner = new Scanner(System.in);
        String value = "";

        while (!"sair".equalsIgnoreCase(value)) {

            System.out.print("Aniversariante cheogu ?");
            value = inputScanner.nextLine();

            BirthdayArrivalEvent event = new BirthdayArrivalEvent(new Date());

            if ("sim".equalsIgnoreCase(value)) {
                observer.stream().forEach(o -> o.hasArrived(event));
                value = "sair";
            } else {
                System.out.println("alarme falso");
            }
        }
        inputScanner.close();
    }
}
