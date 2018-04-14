import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private String hotelName;
    private ArrayList<Room> hotelRooms;
    private ArrayList<People> hotelPeople;


    public Hotel(String hotelName){
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

    public void addRoomToHotel(Room room){
        this.hotelRooms.add(room);
    }

    public void addPeopleToHotel(People person){
        this.hotelPeople.add(person);
    }

//    public void addHotelPeopleToHotelBedRoom(People person){
//     this.hotelRooms.add(person);

//    }

    //public Hotel(String roomName, HashMap<BedroomType, Integer> type){
//        super(roomName);
//        this.type = type;
//     }
//    public Integer getBedRoomType() {
//        return type.get(BedroomType.SINGLE.getRoomType());
//    }


}
