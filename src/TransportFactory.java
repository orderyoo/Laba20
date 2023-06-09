public abstract class TransportFactory {
    public abstract Transport createTransport(String type, int cargoWeight_tonn);
}
class CarFactory extends TransportFactory{
    @Override
    public Transport createTransport(String type, int cargoWeight_tonn) {
        return new Car(type, cargoWeight_tonn);
    }
}
class ShipFactory extends TransportFactory{
    @Override
    public Transport createTransport(String type, int cargoWeight_tonn) {
        return new Ship(type, cargoWeight_tonn);
    }
}
class AirplaneFactory extends TransportFactory{
    @Override
    public Transport createTransport(String type, int cargoWeight_tonn) {
        return new Airplane(type, cargoWeight_tonn);
    }
}