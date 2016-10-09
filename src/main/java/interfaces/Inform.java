package interfaces;

import entities.Reservations;
import entities.Seance;

import java.util.Date;

/**
 * Created by Katie on 09.10.2016.
 */
public interface Inform {

    Seance getSeance(Date date);

    Reservations getInfo (String reservationNumber);

    boolean removeReservation(Reservations reservations);
}
