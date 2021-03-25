package hotel;

import people.Guest;

import java.util.ArrayList;

public class Bedroom extends Room{

    private BedroomRoomType roomType;
    private int roomNumber;

    public Bedroom(BedroomRoomType roomType, int roomNumber) {
        super(roomType.getcapacity());
        this.roomType = roomType;
        this.roomNumber = roomNumber;
    }

    public BedroomRoomType getRoomType() {
        return roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
