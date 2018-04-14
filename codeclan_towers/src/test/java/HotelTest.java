import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel1;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private DiningRoom diningroom1;
    private ConferenceRoom conferenceroom1;
    private People person1;


    @Before
    public void before() {
        hotel1 = new Hotel("The Kittz");
        person1 = new People("Fat Cat Joe", 2000);
        diningroom1 = new DiningRoom("Sheba", 25);
        conferenceroom1 = new ConferenceRoom("The Clowder", 25, 500);
        bedroom1 = new Bedroom ("Deluxe Empty Ikea Box", 50);
        bedroom2 = new Bedroom ("Plush Pillow Penthouse", 500);

    }

    @Test
    public void hotelHasName(){
        assertEquals("The Kittz", hotel1.getHotelName());
    }

    @Test
    public void hotelStartsNoRooms(){
        assertEquals(0, hotel1.getHotelRooms().size());
    }

    @Test
    public void hotelCanAddRooms(){
        hotel1.addRoomToHotel(bedroom1);
        assertEquals(1, hotel1.getHotelRooms().size());
    }

    @Test
    public void hotelStartsNoPeople(){
        assertEquals(0, hotel1.getHotelPeople().size());
    }

    @Test
    public void hotelStartsNoBedRoomTypes(){
        assertEquals(0, hotel1.getHotelBedRoomTypes().size());
    }












//    @Test
//    public void checkBedRoomType(){
//        assertEquals("Single Room", bedroom2.getBedRoomType());
//    }



//        HashMap<BedroomType, Integer> bedroomTypeIntegerHashMap = new HashMap<>();
//        bedroomTypeIntegerHashMap.put(BedroomType.SINGLE, 1);

//        bedroom2 = new Bedroom("Plush Cushion", bedroomTypeIntegerHashMap );

}
