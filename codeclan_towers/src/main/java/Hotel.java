import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private String hotelName;
    private ArrayList<Room> hotelRooms;
    private ArrayList<People> hotelPeople;
    private HashMap<BedroomType, Integer> hotelBedRoomTypes;

    public Hotel(String hotelName){
        this.hotelName = hotelName;
        this.hotelRooms = new ArrayList<>();
        this.hotelPeople = new ArrayList<>();
        this.hotelBedRoomTypes = new HashMap<>();
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

    public HashMap<BedroomType, Integer> getHotelBedRoomTypes() {
        return hotelBedRoomTypes;
    }

    public void addRoomToHotel(Room room){
        this.hotelRooms.add(room);

    }

    //public Hotel(String roomName, HashMap<BedroomType, Integer> type){
//        super(roomName);
//        this.type = type;
//     }
//    public Integer getBedRoomType() {
//        return type.get(BedroomType.SINGLE.getRoomType());
//    }


}
