public class ConferenceRoom extends Room {

    private int capacity;
    private double dailyRate;

    public ConferenceRoom(String roomName, int capacity, double dailyRate) {
        super(roomName);
        this.capacity = capacity;
        this.dailyRate = dailyRate;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }
}
