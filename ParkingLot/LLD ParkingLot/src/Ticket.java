public class Ticket {
    private Vehicle vehicle;
    private float checkInTime;
    private ParkingSlot parkingSlot;

    public Ticket(Vehicle vehicle, float checkInTime, ParkingSlot parkingSlot) {
        this.vehicle = vehicle;
        this.checkInTime = checkInTime;
        this.parkingSlot = parkingSlot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public float getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(float checkInTime) {
        this.checkInTime = checkInTime;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }
}
