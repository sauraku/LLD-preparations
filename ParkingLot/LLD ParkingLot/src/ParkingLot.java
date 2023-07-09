import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParkingLot {
    private static ParkingLot parkingLot;
    private List<ParkingFloor> parkingFloors = null;

    private ParkingLot(){
    }

    public void initialize(List<ParkingFloor> parkingFloors){
        if(this.parkingFloors == null)
            this.parkingFloors = parkingFloors;
        else
            throw new RuntimeException("Parking lot is already initialized");

    }

    public static ParkingLot getInstance(){
        if(parkingLot==null){
            parkingLot = new ParkingLot();
        }
        return parkingLot;
    }

    public ParkingSlot lookForAvailableSlot(Vehicle vehicle){
        for(ParkingFloor parkingFloor: parkingFloors){
            ParkingSlot parkingSlot = parkingFloor.getAvailableParkingSlot(vehicle);
            if(parkingSlot != null)
                return parkingSlot;
        }
        return null;
    }

    public Ticket bookSlot(ParkingSlot parkingSlot, Vehicle vehicle){
        parkingSlot.addVehicle(vehicle);
        Ticket ticket = new Ticket(vehicle, new Date().getTime(), parkingSlot);
        return ticket;
    }

    public float checkout(Ticket ticket){
        ParkingSlot parkingSlot = ticket.getParkingSlot();
        parkingSlot.removeVehicle();
        return parkingSlot.getPrice(new Date().getTime() - ticket.getCheckInTime());
    }
}
