public class Main {
    public static void main(String[] args) {
        TransportFactory carFactory = new CarFactory();
        Transport car = carFactory.createTransport("Фура", 10);
        car.info();

        TransportFactory shipFactory = new ShipFactory();
        Transport ship = shipFactory.createTransport("Танкер", 10000);
        ship.info();

        TransportFactory airplaneFactory = new AirplaneFactory();
        Transport airplane = airplaneFactory.createTransport("грузовой самолёт", 1000);
        airplane.info();

    }
}