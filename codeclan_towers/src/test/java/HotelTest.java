import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    private Bedroom bedroom1;
    private People person1;

    @Before
    public void before(){
        bedroom1 = new Bedroom("Deluxe Cardboard Box");
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

}
