import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private String hotelName;
    private ArrayList<Room> hotelRooms;
    private ArrayList<People> hotelPeople;
    private ArrayList<Bedroom> bedRoom;
    private ArrayList<ConferenceRoom> conferenceRoom;


    public Hotel(String hotelName) {
        this.hotelName = hotelName;
        this.hotelRooms = new ArrayList<>();
        this.hotelPeople = new ArrayList<>();
        this.bedRoom = bedRoom;
        this.conferenceRoom = conferenceRoom;
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


    public void checkParticularGuestintoParticularRoomIfSpace(People guest, Bedroom room) {
        // if room size is greater than amount of guests checking in, allow the room to add the guest.
        if (room.getBedroomCapacity() > getPeopleListFromRoom(room).size()){
        room.addPeopleToRoom(guest);}
    }

    public void checkGuestIntoRoomAndRemoveFromHotel(Bedroom room) {

        room.addPeopleToRoom(this.hotelPeople.remove(0));
    }

    public void checkGuestOutofRoom(Bedroom room) {
        room.removePeopleFromRoom();
    }


    public ArrayList<People> getPeopleListFromRoom(Bedroom room) {
        return room.getPeople();
    }


    // for all People in Arraylist, get their index number, and find and store their name. Then return all names (concatonate?)

//    public String getPersonInfoFromRoom(Room room) {
//        for (int i = 0; i < room.getPeople().size(); i++){
//            (room.getPeople().get(i).getName();
//          }
//
//        return room.getPeople().get(0).getName();
//    }


}
