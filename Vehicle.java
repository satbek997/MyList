public class Vehicle {
    private final String name;
    private final String color;
    private final int year;
    private final int price;
    private final String model;

    private Vehicle(String name, String color, int year, int price, String model) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.price = price;
        this.model = model;
    }

    public static class Builder {
        private String name;
        private String color;
        private int year;
        private int price;
        private String model;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setYear(int year) {
            this.year = year;
            return this;
        }

        public Builder setPrice(int price) {
            this.price = price;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(name, color, year, price, model);
        }
    }

    @Override
    public String toString() {
        return "Vehicle: " + name + " | Model: " + model +
                " | Color: " + color + " | Year: " + year +
                " | Price: " + price;
    }
}
