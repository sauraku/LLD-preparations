import java.util.*;

public class Main {

    public static void main(String[] args) {

        // initialization
        ParkingSlot ps1 = new ParkingSlot( VehicleType.TwoWheeler, 1.1f , "s1");
        ParkingSlot ps2 = new ParkingSlot( VehicleType.TwoWheeler, 1.1f , "s2");
        ParkingSlot ps3 = new ParkingSlot( VehicleType.FourWheeler, 2.1f , "s3");
        ParkingSlot ps4 = new ParkingSlot( VehicleType.FourWheeler, 2.1f , "s4");

        Map<VehicleType, List<ParkingSlot>> map1 = new HashMap<>();
        map1.put(VehicleType.TwoWheeler, Arrays.asList(ps1));
        map1.put(VehicleType.FourWheeler, Arrays.asList(ps3));

        Map<VehicleType, List<ParkingSlot>> map2 = new HashMap<>();
        map2.put(VehicleType.TwoWheeler, Arrays.asList(ps2));
        map2.put(VehicleType.FourWheeler, Arrays.asList(ps4));

        ParkingFloor pf1 =  new ParkingFloor("first floor", map1);
        ParkingFloor pf2 =  new ParkingFloor("second floor", map2);

        ParkingLot parkingLot = ParkingLot.getInstance();
        parkingLot.initialize(Arrays.asList(pf1, pf2));


        // driver code
        Vehicle v1 = new Vehicle("wheeler-2", VehicleType.TwoWheeler);
        Vehicle v2 = new Vehicle("wheeler-4-1", VehicleType.FourWheeler);
        Vehicle v3 = new Vehicle("wheeler-4-2", VehicleType.FourWheeler);
        Vehicle v4 = new Vehicle("wheeler-4-3", VehicleType.FourWheeler);

        ParkingSlot parkingSlot = parkingLot.lookForAvailableSlot(v1);
        if(parkingSlot == null){
            throw new RuntimeException("no slot for said vehicle");
        } else {
            parkingLot.bookSlot(parkingSlot, v1);
        }

        ParkingSlot parkingSlot2 = parkingLot.lookForAvailableSlot(v2);
        Ticket t2;
        if(parkingSlot2 == null){
            throw new RuntimeException("no slot for said vehicle");
        } else {
            t2 = parkingLot.bookSlot(parkingSlot2, v2);
        }

        ParkingSlot parkingSlot3 = parkingLot.lookForAvailableSlot(v3);
        if(parkingSlot3 == null){
            throw new RuntimeException("no slot for said vehicle");
        } else {
            parkingLot.bookSlot(parkingSlot3, v3);
        }

        t2.getParkingSlot().removeVehicle();

        ParkingSlot parkingSlot4 = parkingLot.lookForAvailableSlot(v4);
        if(parkingSlot4 == null){
            throw new RuntimeException("no slot for said vehicle");
        } else {
            parkingLot.bookSlot(parkingSlot2, v4);
        }




    }
}