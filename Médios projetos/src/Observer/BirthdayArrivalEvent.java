package Observer;

import java.util.Date;

public class BirthdayArrivalEvent {

    private final Date moment;

    public BirthdayArrivalEvent(Date moment) {
        this.moment = moment;
    }

    public Date getMoment() {
        return moment;
    }
}
