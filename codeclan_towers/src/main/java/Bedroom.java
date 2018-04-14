import java.util.ArrayList;
import java.util.HashMap;

public class Bedroom extends Room {

    private HashMap<BedroomType, Integer> type;

    public Bedroom(String roomName){
        super(roomName);

        this.type = new HashMap<>();

    }

    public HashMap<BedroomType, Integer> getType() {
        return type;
    }
}
