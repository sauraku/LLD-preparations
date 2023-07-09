ParkingLot
-------------
- singleton: ParkingLot
- parkingFloors: ParkingFloor[]
------------------------
- ParkingLot()
+ getInstance(): ParkingLot
+ lookForAvailableSlot(Vehicle) : ParkingSlot
+ bookSlot(ParkingSlot, Vehicle): Ticket
+ checkout(Ticket): price: float



Vehicle
-------------
+ vehicleNo: string
+ vehicleType: VehicleType
-----------------------------




ParkingSlot
-----------------
+ name: String
+ slotType : VehicleType
+ isAvailable: boolean
- rate: float
- vehicle: Vehicle
---------------------------
+ addVehicle(Vehicle)
+ removeVehicle()
+ getTotalPrice(totalTime: float)


ParkingFloor
------------------
+ floorName: string
- parkingSlots: map<VehicleType, ParkingSlot[]>
-----------------------------------------------
+ getAvailableParkingSlot(Vehicle): ParkingSlot


Ticket
---------------------
+ vehicle: Vehicle
+ checkInTime: float 
+ parkingSlot: ParkingSlot
-----------------------------



