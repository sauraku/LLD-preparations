public class ParkingSlot {
    private VehicleType slotType;
    private Vehicle vehicle;
    private boolean isAvailable = true;
    private float rate;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ParkingSlot(VehicleType slotType, float rate, String name) {
        this.slotType = slotType;
        this.rate = rate;
        this.name = name;
    }

    public VehicleType getSlotType() {
        return slotType;
    }

    public void setSlotType(VehicleType slotType) {
        this.slotType = slotType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void addVehicle(Vehicle vehicle){
        isAvailable = false;
        this.vehicle = vehicle;
    }

    public void removeVehicle(){
        isAvailable = true;
        this.vehicle = null;
    }

    public float getPrice(float totalTime){
        return this.rate * totalTime;
    }

}
