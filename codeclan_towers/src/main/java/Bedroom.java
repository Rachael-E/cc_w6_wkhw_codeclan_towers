import java.util.ArrayList;
import java.util.HashMap;

public class Bedroom extends Room {

    private double nightlyRate;
    public BedroomType bedroomType;

    public Bedroom(String roomName, double nightlyRate, BedroomType bedroomType) {
        super(roomName);
        this.nightlyRate = nightlyRate;
        this.bedroomType = bedroomType;

    }

    public double getNightlyRate() {
        return nightlyRate;
    }

    public String getBedroomTypeDescription() {
        return bedroomType.getRoomType();
    }

    public int getRoomCapacity() {
        return bedroomType.getCapacity();
    }

    public boolean isBedRoomOccupied() {
        return (getPeople().size() > 0);
    }

    // returns true if room capacity is equal to people in the room. Returns false if bedroom isn't full//
    public boolean isBedRoomFull(){
        return (getRoomCapacity() == getPeople().size());
    }

}