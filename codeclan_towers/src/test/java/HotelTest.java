import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private People person1;


    @Before
    public void before(){
        bedroom1 = new Bedroom("Deluxe Cardboard Box", 50);

        person1 = new People("Fat Cat Joe", 1000);
    }

    @Test
    public void personHasName(){
        assertEquals("Fat Cat Joe", person1.getName());
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

//    @Test
//    public void checkBedRoomType(){
//        assertEquals("Single Room", bedroom2.getBedRoomType());
//    }



//        HashMap<BedroomType, Integer> bedroomTypeIntegerHashMap = new HashMap<>();
//        bedroomTypeIntegerHashMap.put(BedroomType.SINGLE, 1);

//        bedroom2 = new Bedroom("Plush Cushion", bedroomTypeIntegerHashMap );

}
