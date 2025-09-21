public class CheryFactory extends VehicleFactory {
    @Override
    public Car createCar() {
        return new Chery();
    }

    @Override
    public Engine createEngine() {
        return new CheryEngine();
    }
}
