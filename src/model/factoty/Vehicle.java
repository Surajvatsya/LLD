package model.factoty;

public abstract class Vehicle {

        private final String registrationNo;
        private String colour;
        private VehicleType vehicleType;

        public Vehicle(String colour, String registrationNo, VehicleType vehicleType) {
            this.colour = colour;
            this.registrationNo = registrationNo;
            this.vehicleType = vehicleType;
        }

        public String getRegistrationNo() {
            return registrationNo;
        }

        public String getColour() {
            return colour;
        }

        public void setColour(String colour) {
            this.colour = colour;
        }

        public VehicleType getVehicleType() {
            return vehicleType;
        }

        public void setVehicleType(VehicleType vehicleType) {
            this.vehicleType = vehicleType;
        }
}
