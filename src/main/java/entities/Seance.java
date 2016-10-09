package entities;

import java.util.Date;

/**
 * Created by Katie on 09.10.2016.
 */
public class Seance {

    private Date seanceTime;
    private String seanceRoom;

    public Date getSeanceTime() {
        return seanceTime;
    }

    public void setSeanceTime(Date seanceTime) {
        this.seanceTime = seanceTime;
    }

    public String getSeanceRoom() {
        return seanceRoom;
    }

    public void setSeanceRoom(String seanceRoom) {
        this.seanceRoom = seanceRoom;
    }
}
