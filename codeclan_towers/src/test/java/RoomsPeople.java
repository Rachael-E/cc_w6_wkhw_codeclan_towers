import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class RoomsPeople {
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private People person1;
    private People person2;
    private DiningRoom diningroom1;
    private ConferenceRoom conferenceRoom1;


    @Before
    public void before() {
        bedroom1 = new Bedroom("Deluxe Cardboard Box", 50, BedroomType.SINGLE);
        bedroom2 = new Bedroom("Plush Pillow Penthouse", 500, BedroomType.PENTHOUSE);
        diningroom1 = new DiningRoom("Sheba Restaurant", 25);
        conferenceRoom1 = new ConferenceRoom("The Clowder", 25, 100);

        person1 = new People("Fat Cat Joe", 1000);

        person2 = new People("Kitty Minaj", 1000);
    }

    @Test
    public void personHasName() {
        assertEquals("Fat Cat Joe", person1.getName());
    }

    @Test
    public void personCanSetWallet() {
        person1.setWallet(2500);
        assertEquals(2500, person1.getWallet(), 0.1);
    }

    @Test
    public void bedroomHasName() {
        assertEquals("Deluxe Cardboard Box", bedroom1.getRoomName());
    }

    @Test
    public void bedroomStartsNoGuests() {
        assertEquals(0, bedroom1.getPeople().size());
    }

    @Test
    public void bedroomHasNightlyRate() {
        assertEquals(50, bedroom1.getNightlyRate(), 0.1);
    }

    @Test
    public void bedroomHasType() {
        assertEquals("Single Room", bedroom1.getBedroomTypeDescription());
    }

    @Test
    public void bedroomHasCapacity() {
        assertEquals(1, bedroom1.getRoomCapacity());
    }

    @Test
    public void bedroomHasGuest() {
        bedroom1.addPeopleToRoom(person1);
        assertEquals(1, bedroom1.getPeople().size());
    }

    @Test
    public void bedroomCanRemoveGuest() {
        bedroom1.removePeopleFromRoom();
        assertEquals(0, bedroom1.getPeople().size());
    }

    @Test
    public void diningRoomHasCapacity() {
        assertEquals(25, diningroom1.getCapacity());
    }

    @Test
    public void diningroomHasName() {
        assertEquals("Sheba Restaurant", diningroom1.getRoomName());
    }

    @Test
    public void conferenceRoomHasName() {
        assertEquals("The Clowder", conferenceRoom1.getRoomName());
    }

    @Test
    public void conferenceRoomHasCapacity() {
        assertEquals(25, conferenceRoom1.getCapacity());
    }

    @Test
    public void conferenceRoomHasDailyRate() {
        assertEquals(100, conferenceRoom1.getDailyRate(), 0.1);
    }

    @Test
    public void conferenceRoomCanSetRate() {
        conferenceRoom1.setDailyRate(200);
        assertEquals(200, conferenceRoom1.getDailyRate(), 0.1);
    }

    @Test
    public void checkIfBedRoomIsOccupied(){
        bedroom1.addPeopleToRoom(person1);
        assertEquals(true, bedroom1.isBedRoomOccupied());
    }

    @Test
    public void checkIfBedRoomIsNotFull(){
        bedroom2.addPeopleToRoom(person1);
        assertEquals(false, bedroom2.isBedRoomFull());
    }
//
    @Test
    public void checkIfBedRoomIsFull(){
        bedroom1.addPeopleToRoom(person1);
        assertEquals(true, bedroom1.isBedRoomFull());
    }


}
