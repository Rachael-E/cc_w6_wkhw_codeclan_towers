import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private String hotelName;
    private ArrayList<Room> hotelRooms;
    private ArrayList<People> hotelPeople;
    private ArrayList<Bedroom> bedRoom; //not clear if this should be accessible by Hotel. It's the only way I can access bedroom capacity.
    private ArrayList<ConferenceRoom> conferenceRoom;


    public Hotel(String hotelName) {
        this.hotelName = hotelName;
        this.hotelRooms = new ArrayList<>();
        this.hotelPeople = new ArrayList<>();
        this.bedRoom = bedRoom;
        this.conferenceRoom = conferenceRoom;
    }

    //*** Getter methods for hotel ***//
    public String getHotelName() {
        return hotelName;
    }

    public ArrayList<People> getHotelPeople() {
        return hotelPeople;
    }

    public ArrayList<Room> getHotelRooms() {
        return hotelRooms;
    }

    //*** add a room to the empty array list of rooms in hotel ***//
    public void addRoomToHotel(Room room) {
        this.hotelRooms.add(room);
    }

    //*** add a person to the empty array list of people in hotel ***//
    public void addPeopleToHotel(People person) {
        this.hotelPeople.add(person);
    }

    //*** Check a guest into a particular room if there is space to do so ***//
    //** if room size is greater than amount of guests checking in, allow the room to add the guest. **//
    public void checkGuestintoBedRoomIfSpace(People guest, Bedroom room) {
        if (room.getRoomCapacity() > getPeopleListAsNumberFromRoom(room).size()) {
            room.addPeopleToRoom(guest);
        }
    }

    //*** if the hotel was a lobby, people would be being moved out of the lobby, and into the room.***//
    public void checkGuestIntoRoomAndRemoveFromHotel(Bedroom room) {
        room.addPeopleToRoom(this.hotelPeople.remove(0));
    }

    //*** when the guest leaves, they may walk straight out of the room to check out.***//
    public void checkGuestOutOfRoom(Bedroom room) {
        room.removePeopleFromRoom();
    }

    public ArrayList<People> getPeopleListAsNumberFromRoom(Bedroom room) {
        return room.getPeople();
    }

    //*** For all the guests within a room, loop through their index numbers using a for loop, and return the value of that index number to call the getName method on it, thereby returning a list of names.***//

    public String getPersonInfoFromRoom(Room room) {
        String listOfGuestNames = "";
        for (int i = 0; i < room.getPeople().size(); i++) {
            listOfGuestNames += room.getPeople().get(i).getName() + ", "; //+= has a warning for concatenation?
        }
        return listOfGuestNames;
    }



    //*** Another method to concatonate the names, but this isn't neat.***//
    //  return (room.getPeople().get(0).getName()).concat(room.getPeople().get(1).getName());

}
