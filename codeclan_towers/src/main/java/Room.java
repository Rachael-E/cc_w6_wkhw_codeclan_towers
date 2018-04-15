import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Room {
    private String roomName;
    private ArrayList<People> people;

    public Room(String roomName) {
        this.roomName = roomName;
        this.people = new ArrayList<>();
    }

    public String getRoomName() {
        return roomName;
    }

    public ArrayList<People> getPeople() {
        return people;
    }


    public void addPeopleToRoom(People person) {
        this.people.add(person);
    }

    public void removePeopleFromRoom() {
        this.people.clear();
    }


}
