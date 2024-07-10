class Car {
    String brand;
    String model;
    String type;
    double mil;
    int seatingCap;
    double price;
    Engine engine;

    Car(String brand, String model, String type, double mil, int seatingCap, double price, String etype, double bhp, int noPiston, int gears) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.mil = mil;
        this.seatingCap = seatingCap;
        this.price = price;
        this.engine = new Engine(etype, bhp, noPiston, gears);
        System.out.println("Car obj Created");
    }

    void displayCar() {
        System.out.println("***Car Details***");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        System.out.println("Mileage: " + mil);
        System.out.println("Seating Capacity: " + seatingCap);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

class Engine {
    String etype;
    double bhp;
    int noPiston;
    int gears;

    Engine(String etype, double bhp, int noPiston, int gears) {
        this.etype = etype;
        this.bhp = bhp;
        this.noPiston = noPiston;
        this.gears = gears;
    }

    void displayEngine() {
        System.out.println("***Engine Details***");
        System.out.println("Type: " + etype);
        System.out.println("BHP: " + bhp);
        System.out.println("Number of Pistons: " + noPiston);
        System.out.println("Number of Gears: " + gears);
    }
}

public class CarDriver {
    public static void main(String[] args) {
        Car obj = new Car("Tata", "Nexon", "HatchBack", 17, 5, 850000, "CI", 300, 4, 5);
        obj.displayCar();
        obj.engine.displayEngine();
    }
}