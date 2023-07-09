import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ParkingFloor {
    String floorName;
    Map<VehicleType, List<ParkingSlot>> parkingSlots;

    public ParkingFloor(String floorName, Map<VehicleType, List<ParkingSlot>> parkingSlot) {
        this.floorName = floorName;
        this.parkingSlots = parkingSlot;
    }

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    public ParkingSlot getAvailableParkingSlot(Vehicle vehicle){
        VehicleType vehicleType = vehicle.getVehicleType();
        for(ParkingSlot parkingSlot: parkingSlots.get(vehicleType)){
            if(parkingSlot.isAvailable()){
                return parkingSlot;
            }
        }
        return null;
    }
}
