package hotel;

import people.Guest;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Booking> bookings;
    private ArrayList<DiningRoom> diningRooms;

    public Hotel() {
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.bookings = new ArrayList<>();
        this.diningRooms = new ArrayList<>();
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public void addRoomToBedrooms(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void checkInGuestToRoom(Bedroom bedroom, Guest guest) {
        bedroom.addGuest(guest);
    }

    public void checkOutGuestFromRoom(Bedroom bedroom, Guest guest) {
        bedroom.removeGuest(guest);
    }

    public void bookRoom(int numberOfGuests, int nights) {
        Booking booking = new Booking(numberOfGuests, nights);
        ArrayList<Bedroom> empties = getEmptyRooms();
        for (int i = 0; i < empties.size(); i++) {
            if (empties.get(i).getRoomType() == booking.getRoomType()) {
                this.bookings.add(booking);
                break;
            }
        }
    }

    public ArrayList<Booking> getBookings() {
        return this.bookings;
    }

    public ArrayList<Bedroom> getEmptyRooms() {
        ArrayList<Bedroom> toBeReturned = bedrooms;
        for (int i = 0; i < bookings.size(); i++) {
            Booking currentBooking = bookings.get(i);
            toBeReturned.remove(currentBooking.getBedroom());
        }
        return toBeReturned;
    }
}
