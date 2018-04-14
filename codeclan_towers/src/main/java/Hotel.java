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



    public void checkParticularGuestintoParticularRoom(People guest, Room room){
        room.addPeopleToRoom(guest);
    }

    public void checkGuestIntoRoomAndRemoveFromHotel(Room room) {

        room.addPeopleToRoom(this.hotelPeople.remove(0));
    }




    public void checkGuestOutofRoom(Room room) {
        room.removePeopleFromRoom();
    }

//    public String getPersonInfoFromRoom(Room room) {
//        for (int i = 0; i <= room.getPeople().size(); i++)
//            (room.getPeople().get(i));
//
//        return room.getPeople().get(0).getName();
//    }

//    public String getPersonInfoFromRoom(Room room) {
////        for (int i = 0; i <= room.getPeople().size(); i++)
////            return (room.getPeople().get(i));
//        return room.getPeople().get(0).getName();
//    }


}
