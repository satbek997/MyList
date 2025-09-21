public class LexusFactory extends VehicleFactory {
    @Override
    public Car createCar() {
        return new Lexus();
    }

    @Override
    public Engine createEngine() {
        return new LexusEngine();
    }
}
