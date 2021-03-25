import hotel.Bedroom;
import hotel.BedroomRoomType;
import hotel.Hotel;
import org.junit.Before;
import org.junit.Test;
import people.Guest;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom room, room2, room3;
    Guest guest

    @Before
    public void before() {
        hotel = new Hotel();
        room = new Bedroom(BedroomRoomType.DOUBLE, 1);
        room2 = new Bedroom(BedroomRoomType.DOUBLE, 2);
        room3 = new Bedroom(BedroomRoomType.DOUBLE, 3);
        hotel.addRoomToBedrooms(room);
        hotel.addRoomToBedrooms(room2);
        hotel.addRoomToBedrooms(room3);
        guest = new Guest("John");
    }

    @Test
    public void checkInGuest() {
        hotel.checkInGuestToRoom(room, guest);
        assertEquals(1, room.getGuests().size());
    }

    @Test
    public void checkOutGuest() {
        hotel.checkInGuestToRoom(room, guest);
        assertEquals(1, room.getGuests().size());
        hotel.checkOutGuestFromRoom(room, guest);
        assertEquals(0, room.getGuests().size());
    }

    @Test
    public void bookRoomMk2(){
        hotel.bookRoom(1, 4);
        assertEquals(0, hotel.getBookings().size());
    }

    @Test
    public void bookDoubleRoom(){
        hotel.bookRoom(2, 3);
        assertEquals(1, hotel.getBookings().size());
    }

//    @Test
//    public void checkRoomBookings() {
//        hotel.bookRoom(room, 2);
//        assertEquals(1, hotel.getBookings().size());
//    }

//    @Test
//    public void checkTotalCost() {
//        assertEquals(120, hotel.bookRoom(room, 3).getTotalCost());
//    }
//
//    @Test
//    public void checkEmpty3Rooms(){
//        assertEquals(3, hotel.getEmptyRooms().size());
//    }
//
//    @Test
//    public void checkEmpty2Rooms(){
//        hotel.bookRoom(room, 2);
//        assertEquals(2, hotel.getEmptyRooms().size());
//    }
//
//    @Test
//    public void checkGuestCantCheckInIfFull() {
//        hotel.bookRoom(room, 2);
//        assertNull(hotel.bookRoom(room, 2));
//    }
//
//    @Test
//    public void checkGuestCheckInIfSpace() {
//        assertEquals(1, hotel.bookRoom(room, 2).getBedroom().getRoomNumber());
//    }
}
