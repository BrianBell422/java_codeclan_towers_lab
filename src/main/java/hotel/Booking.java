package hotel;

public class Booking {

    private Bedroom bedroom;
    private int nights;
    private int numberOfGuests;

    public Booking(int numberOfGuests, int nights) {
        this.numberOfGuests = numberOfGuests;
        this.nights = nights;
    }


    public BedroomRoomType getRoomType(){
        if (this.numberOfGuests == 1){
            return BedroomRoomType.SINGLE;
        } else if (this.numberOfGuests == 2){
            return BedroomRoomType.DOUBLE;
        } else {
            return null;
        }
    }

    public int getTotalCost(){
        return this.bedroom.getRoomType().getRate() * this.nights;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }
}
