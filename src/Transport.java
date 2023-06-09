public abstract class Transport {
    private String type;
    private int cargoWeight_tonn;
    Transport(String type, int cargoWeight_tonn){
        this.type = type;
        this.cargoWeight_tonn = cargoWeight_tonn;
    }
    public int getCargoWeight_tonn() {
        return cargoWeight_tonn;
    }
    public String getType() {
        return type;
    }
    public void info(){
        System.out.println("тип: " + this.type + "\n" + "Грузоподъёмность: " + this.cargoWeight_tonn);
    }
}
class Car extends Transport{
    Car(String type, int cargoWeight_tonn) {
        super(type, cargoWeight_tonn);
    }
    @Override
    public int getCargoWeight_tonn() {
        return super.getCargoWeight_tonn();
    }
    @Override
    public String getType() {
        return super.getType();
    }
}
class Ship extends Transport{
    Ship(String type, int cargoWeight_tonn) {
        super(type, cargoWeight_tonn);
    }
    @Override
    public int getCargoWeight_tonn() {
        return super.getCargoWeight_tonn();
    }
    @Override
    public String getType() {
        return super.getType();
    }
}
class Airplane extends Transport{
    Airplane(String type, int cargoWeight_tonn) {
        super(type, cargoWeight_tonn);
    }
    @Override
    public int getCargoWeight_tonn() {
        return super.getCargoWeight_tonn();
    }
    @Override
    public String getType() {
        return super.getType();
    }
}