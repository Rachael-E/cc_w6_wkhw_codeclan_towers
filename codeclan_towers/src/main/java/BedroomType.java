public enum BedroomType {

    SINGLE(1, "Single Room"),
    DOUBLE(2, "Double Room"),
    SUITE(5, "Suite"),
    PENTHOUSE(7, "Penthouse");

    private int capacity;
    private String roomType;

    BedroomType(int capacity, String roomType){
        this.capacity = capacity;
        this.roomType = roomType;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getRoomType() {
        return roomType;
    }
}
