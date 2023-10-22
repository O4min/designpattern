package creational.factorymethod.example3;

public enum VehicleFactoryMethod {

    CAR {
        @Override
        public Vehicle create() {
            return new Car();
        }
    },
    SCOOTER {
        @Override

        public Vehicle create() {
            return new Scooter();
        }
    },
    BICYCLE {
        @Override
        public Vehicle create() {
            return new Bicycle();
        }
    };

    public abstract Vehicle create();

}
