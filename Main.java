public class Main {
    public static void main(String[] args) {
        // Builder usage
        Vehicle lexusSpec = new Vehicle.Builder()
                .setName("Lexus")
                .setColor("Black")
                .setModel("RX 350")
                .setYear(2023)
                .setPrice(75000)
                .build();

        Vehicle cherySpec = new Vehicle.Builder()
                .setName("Chery")
                .setColor("White")
                .setModel("Tiggo 8 Pro")
                .setYear(2022)
                .setPrice(20000)
                .build();

        System.out.println(lexusSpec);
        System.out.println(cherySpec);

        System.out.println("----- FACTORY PATTERN -----");

        // Factory usage
        VehicleFactory lexusFactory = new LexusFactory();
        Car lexus = lexusFactory.createCar();
        Engine lexusEngine = lexusFactory.createEngine();
        lexus.drive();
        lexusEngine.start();

        System.out.println("-----");

        VehicleFactory cheryFactory = new CheryFactory();
        Car chery = cheryFactory.createCar();
        Engine cheryEngine = cheryFactory.createEngine();
        chery.drive();
        cheryEngine.start();
    }
}
