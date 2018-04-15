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
    private People person3;
    private People person4;
    private People person5;
    private People person6;
    private People person7;
    private People person8;



    @Before
    public void before() {
        hotel1 = new Hotel("The Kittz");
        person1 = new People("Fat Cat Joe", 2000);
        person2 = new People("Kitty Minaj", 1000);
        person3 = new People("Meowyance", 1000);
        person4 = new People("Paw-Z", 1000);
        person5 = new People("Snoop Catty Cat", 1000);
        person6 = new People("Purr Daddy", 1000);
        person7 = new People("Mick Jaguar", 1000);
        person8 = new People("Missy Pawelliot", 1000);

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
    public void hotelCanAddAndRemovePeopleFromHotel(){
        hotel1.addPeopleToHotel(person1);
        hotel1.checkGuestIntoRoomAndRemoveFromHotel(bedroom1);
        assertEquals(0, hotel1.getHotelPeople().size());
        assertEquals(1, bedroom1.getPeople().size());
    }

    @Test
    public void hotelCanAddGuestToBedRoom(){
        hotel1.checkGuestintoBedRoomIfSpace(person1, bedroom1);
        assertEquals(1, bedroom1.getPeople().size());
    }

    @Test
    public void hotelCannotAddPersonToRoomIfFull(){
        hotel1.checkGuestintoBedRoomIfSpace(person1, bedroom1);
        hotel1.checkGuestintoBedRoomIfSpace(person2, bedroom1);
        assertEquals(1, bedroom1.getPeople().size());
    }

    @Test
    public void hotelCanCheckGuestOutOfRoom(){
        hotel1.checkGuestintoBedRoomIfSpace(person1, bedroom1);
        hotel1.checkGuestOutOfRoom(bedroom1);
        assertEquals(0, bedroom1.getPeople().size());
    }

    @Test
    public void hotelCanGetGuestInfoAsNumber(){
        hotel1.checkGuestintoBedRoomIfSpace(person1, bedroom2);
        hotel1.checkGuestintoBedRoomIfSpace(person2, bedroom2);
        hotel1.checkGuestintoBedRoomIfSpace(person3, bedroom2);
        hotel1.checkGuestintoBedRoomIfSpace(person4, bedroom2);
        hotel1.checkGuestintoBedRoomIfSpace(person5, bedroom2);
        hotel1.checkGuestintoBedRoomIfSpace(person6, bedroom2);
        hotel1.checkGuestintoBedRoomIfSpace(person7, bedroom2);
        assertEquals(7, hotel1.getPeopleListAsNumberFromRoom(bedroom2).size());

    }

    @Test
    public void hotelCanGetGuestNames(){
        hotel1.checkGuestintoBedRoomIfSpace(person1, bedroom2);
        hotel1.checkGuestintoBedRoomIfSpace(person2, bedroom2);
        assertEquals("Fat Cat Joe, Kitty Minaj, ", hotel1.getPersonInfoFromRoom(bedroom2));
    }



}
