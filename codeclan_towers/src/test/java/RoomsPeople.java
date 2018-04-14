import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class RoomsPeople {
    private Bedroom bedroom1;
    private People person1;
    private DiningRoom diningroom1;
    private ConferenceRoom conferenceRoom1;


    @Before
    public void before(){
        bedroom1 = new Bedroom("Deluxe Cardboard Box", 50);
        diningroom1 = new DiningRoom("Sheba Restaurant", 25);
        conferenceRoom1 = new ConferenceRoom("The Clowder", 25, 100);

        person1 = new People("Fat Cat Joe", 1000);
    }

    @Test
    public void personHasName(){
        assertEquals("Fat Cat Joe", person1.getName());
    }

    @Test
    public void personCanSetWallet(){
        person1.setWallet(2500);
        assertEquals(2500, person1.getWallet(), 0.1);
    }

    @Test
    public void bedroomHasName(){
        assertEquals("Deluxe Cardboard Box", bedroom1.getRoomName());
    }

    @Test
    public void bedroomStartsNoGuests(){
        assertEquals(0, bedroom1.getPeople().size());
    }

    @Test
    public void bedroomHasNightlyRate(){
        assertEquals(50, bedroom1.getNightlyRate(), 0.1);

    }

    @Test
    public void diningRoomHasCapacity(){
        assertEquals(25, diningroom1.getCapacity());
    }

    @Test
    public void diningroomHasName(){
        assertEquals("Sheba Restaurant", diningroom1.getRoomName());
    }

    @Test
    public void conferenceRoomHasName(){
        assertEquals("The Clowder", conferenceRoom1.getRoomName());
    }

    @Test
    public void conferenceRoomHasCapacity(){
        assertEquals(25, conferenceRoom1.getCapacity());
    }

    @Test
    public void conferenceRoomHasDailyRate(){
        assertEquals(100, conferenceRoom1.getDailyRate(), 0.1);
    }

    @Test
    public void conferenceRoomCanSetRate(){
        conferenceRoom1.setDailyRate(200);
        assertEquals(200, conferenceRoom1.getDailyRate(), 0.1);
    }



}
