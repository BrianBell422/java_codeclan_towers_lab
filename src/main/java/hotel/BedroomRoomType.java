package hotel;

public enum BedroomRoomType {
    SINGLE(1, 40),
    DOUBLE(2, 100);

    private final int capacity;
    private final int rate;

    BedroomRoomType(int capacity, int rate) {
        this.capacity = capacity;
        this.rate = rate;
    }

    public int getcapacity() {
        return capacity;
    }

    public int getRate() {
        return rate;
    }
}
