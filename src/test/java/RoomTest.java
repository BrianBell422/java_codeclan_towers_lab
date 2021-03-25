import hotel.Bedroom;
import hotel.Room;
import hotel.RoomImplementation;
import hotel.BedroomRoomType;
import org.junit.Before;
import org.junit.Test;
import people.Guest;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Guest guest;

    @Before
    public void before() {
        room = new RoomImplementation(2);
        guest = new Guest("John");
    }

    @Test
    public void canAddGuestToRoom() {
        room.addGuest(guest);
        assertEquals(1, room.getGuests().size());
    }

    @Test
    public void canGetRoomCapacity() {
        room = new Bedroom(BedroomRoomType.DOUBLE, 10);
        assertEquals(2, room.getCapacity());
    }
}
