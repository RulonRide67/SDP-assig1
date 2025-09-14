class Car {
    private final int seats;
    private final String engine;
    private final boolean hasGPS;
    private final boolean hasTripComputer;
    private Car(int seats, String engine, boolean gps, boolean tripComp) {
        this.seats = seats; this.engine = engine;
        this.hasGPS = gps; this.hasTripComputer = tripComp;
    }
    public String toString() {return "Car { seats=" + seats + ", engine='" + engine +", GPS=" + hasGPS + ", tripComputer=" + hasTripComputer + " }";
    }
    static class Builder {
        private int seats;
        private String engine;
        private boolean hasGPS;
        private boolean hasTripComputer;
        public Builder setSeats(int seats) { this.seats = seats; return this; }
        public Builder setEngine(String engine) { this.engine = engine; return this; }
        public Builder setGPS(boolean gps) { this.hasGPS = gps; return this; }
        public Builder setTripComputer(boolean tripComp) { this.hasTripComputer = tripComp; return this; }

        public Car build() { return new Car(seats, engine, hasGPS, hasTripComputer); }
    }
}
class Director {
    public Car ConsSportsCar() {
        return new Car.Builder()
                .setSeats(2)
                .setEngine("V12")
                .setGPS(true)
                .setTripComputer(true)
                .build();
    }
}
public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .setSeats(4)
                .setEngine("V6")
                .setGPS(true)
                .setTripComputer(true)
                .build();

        Director director = new Director();
        Car sportsCar = director.ConsSportsCar();

        System.out.println(car);
        System.out.println(sportsCar);
    }
}


