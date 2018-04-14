public class DiningRoom extends Room {

    private int capacity;

    public DiningRoom(String roomName, int capacity) {
        super(roomName);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
