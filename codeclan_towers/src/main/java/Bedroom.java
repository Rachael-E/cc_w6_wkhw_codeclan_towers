import java.util.ArrayList;
import java.util.HashMap;

public class Bedroom extends Room {

    private double nightlyRate;

    public Bedroom(String roomName, double nightlyRate) {
        super(roomName);
        this.nightlyRate = nightlyRate;

    }

    public double getNightlyRate() {
        return nightlyRate;
    }
}