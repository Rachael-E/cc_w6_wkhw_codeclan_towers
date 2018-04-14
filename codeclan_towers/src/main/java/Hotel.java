import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private String hotelName;
    private ArrayList<Room> hotelRooms;
    private ArrayList<People> hotelPeople;


    public Hotel(String hotelName) {
        this.hotelName = hotelName;
        this.hotelRooms = new ArrayList<>();
        this.hotelPeople = new ArrayList<>();
    }

    public String getHotelName() {
        return hotelName;
    }

    public ArrayList<People> getHotelPeople() {
        return hotelPeople;
    }

    public ArrayList<Room> getHotelRooms() {
        return hotelRooms;
    }

    public void addRoomToHotel(Room room) {
        this.hotelRooms.add(room);
    }

    public void addPeopleToHotel(People person) {
        this.hotelPeople.add(person);
    }


    public void checkParticularGuestintoParticularRoom(People guest, Room room) {
        // if room size is equal to or less than amount of guests checking in, allow the room to add the guest.

        room.addPeopleToRoom(guest);
    }

    public void checkGuestIntoRoomAndRemoveFromHotel(Room room) {

        room.addPeopleToRoom(this.hotelPeople.remove(0));
    }

    public void checkGuestOutofRoom(Room room) {
        room.removePeopleFromRoom();
    }


    public ArrayList<People> getPeopleListFromRoom(Room room) {
        return room.getPeople();
    }


    // for all People in Arraylist, get their index number, and return their name by concatonating the strings.

//    public String getPersonInfoFromRoom(Room room) {
//        for (int i = 0; i < room.getPeople().size(); i++){
//            (room.getPeople().get(i).getName();
//          }
//
//        return room.getPeople().get(0).getName();
//    }


}
