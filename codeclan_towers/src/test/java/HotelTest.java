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
    private People person2;



    @Before
    public void before() {
        hotel1 = new Hotel("The Kittz");
        person1 = new People("Fat Cat Joe", 2000);
        person2 = new People("Kitty Minaj", 1000);
        diningroom1 = new DiningRoom("Sheba", 25);
        conferenceroom1 = new ConferenceRoom("The Clowder", 25, 500);
        bedroom1 = new Bedroom ("Deluxe Empty Ikea Box", 50, BedroomType.SINGLE);
        bedroom2 = new Bedroom ("Plush Pillow Penthouse", 500, BedroomType.PENTHOUSE);

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
    public void hotelCanAddPeople(){
        hotel1.addPeopleToHotel(person1);
        assertEquals(1, hotel1.getHotelPeople().size());
    }

    @Test
    public void hotelCanAddPeopleToARoomAndRemoveFromHotel(){
        hotel1.addPeopleToHotel(person1);
        hotel1.checkGuestIntoRoomAndRemoveFromHotel(bedroom1);
        assertEquals(0, hotel1.getHotelPeople().size());
        assertEquals(1, bedroom1.getPeople().size());
    }

    @Test
    public void hotelCanAddParticularPersonToAParticularRoom(){
        hotel1.checkParticularGuestintoParticularRoom(person1, bedroom1);
        assertEquals(1, bedroom1.getPeople().size());
    }

    @Test
    public void hotelCanCheckGuestOutOfRoom(){
        hotel1.checkParticularGuestintoParticularRoom(person1, bedroom1);
        hotel1.checkGuestOutofRoom(bedroom1);
        assertEquals(0, bedroom1.getPeople().size());
    }

    @Test
    public void hotelCanGetGuestInfo(){
        hotel1.checkParticularGuestintoParticularRoom(person1, bedroom1);
        hotel1.checkParticularGuestintoParticularRoom(person2, bedroom1);
        assertEquals(2, hotel1.getPeopleListFromRoom(bedroom1).size());
//        assertEquals("Fat Cat Joe", hotel1.getPersonInfoFromRoom(bedroom1));
    }














//    @Test
//    public void checkBedRoomType(){
//        assertEquals("Single Room", bedroom2.getBedRoomType());
//    }



//        HashMap<BedroomType, Integer> bedroomTypeIntegerHashMap = new HashMap<>();
//        bedroomTypeIntegerHashMap.put(BedroomType.SINGLE, 1);

//        bedroom2 = new Bedroom("Plush Cushion", bedroomTypeIntegerHashMap );

}
