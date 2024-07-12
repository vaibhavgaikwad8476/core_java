class FishTank {
  String dimensions;
  String material;
  String shape;
  double capacity;
  Fish fish;
  Water water;
  OxygenPump pump;
  Stone stone;
  Light light;

  FishTank(String dimensions, String material, String shape, double capacity) {
    this.dimensions = dimensions;
    this.material = material;
    this.shape = shape;
    this.capacity = capacity;
  }

  void displayFishTankDetails() {
    System.out.println();
    System.out.println("** Fish Tank Details **");
    System.out.println("Dimensions of Fish Tank : " + dimensions);
    System.out.println("Material for Fish Tank : " + material);
    System.out.println("Shape of Fish Tank : " + shape);
    System.out.println("Capacity of Fish Tank : " + capacity + " Liters");
    System.out.println();
  }

  void addFish() {
    if (water == null) {
      System.out.println("Please add water first OR Fish will die");
    } else {
      fish = new Fish("Shark", "black", 50);
    }
  }

  void addWater() {
    water = new Water("Salt Water", 7, 8);
  }

  void addOxygenPump() {
    pump = new OxygenPump("Bajaj", 500, 5, 230);
  }

  void addStones() {
    stone = new Stone("Multi-Color", 3, "Oval", 300, 170);
  }

  void addLights() {
    light = new Light("Philips", "Yellow", 100, 5);
  }
}

class Water {
  String type_of_water;
  double ph_value;
  double quantity;

  Water(String type_of_water, double ph_value, double quantity) {
    this.type_of_water = type_of_water;
    this.ph_value = ph_value;
    this.quantity = quantity;
  }

  void displayWaterDetails() {
    System.out.println();
    System.out.println("** Water Details **");
    System.out.println("Type of Water: " + type_of_water);
    System.out.println("PH Value: " + ph_value);
    System.out.println("Quantity: " + quantity);
    System.out.println();
  }
}

class Fish {
  String species;
  String color;
  double price;
  FishFood food;

  Fish(String species, String color, double price) {
    this.species = species;
    this.color = color;
    this.price = price;
  }

  void displayFishDetails() {
    System.out.println();
    System.out.println("** Fish Details **");
    System.out.println("Species of Fish : " + species);
    System.out.println("Color of Fish : " + color);
    System.out.println("Price of Fish : " + price);
    System.out.println();
  }

  void addFood() {
    food = new FishFood("Gokul", 100, 250);
  }
}

class FishFood {
  String brand;
  double price;
  double quantity;

  FishFood(String brand, double price, double quantity) {
    this.brand = brand;
    this.price = price;
    this.quantity = quantity;
  }

  void displayFishFoodDetails() {
    System.out.println();
    System.out.println("** Fish Food Details **");
    System.out.println("Brand name of fish food : " + brand);
    System.out.println("Price of fish food : " + price);
    System.out.println("Quantity of fish food : " + quantity);
    System.out.println();
  }
}

class OxygenPump {
  String brand;
  double price;
  double capacity;
  double voltage;

  OxygenPump(String brand, double price, double capacity, double voltage) {
    this.brand = brand;
    this.price = price;
    this.capacity = capacity;
    this.voltage = voltage;
  }

  void displayOxygenPumpDetails() {
    System.out.println();
    System.out.println("** Oxygen Pump Details **");
    System.out.println("Brand name of the Oxygen Pump : " + brand);
    System.out.println("Price of oxygen pump : " + price);
    System.out.println("Capacity of the Oxygen Pump : " + capacity);
    System.out.println("Voltage of the Oxygen Pump : " + voltage);
    System.out.println();
  }
}

class Light {
  String brand;
  String color;
  double voltage;
  double price;

  Light(String brand, String color, double voltage, double price) {
    this.brand = brand;
    this.color = color;
    this.voltage = voltage;
    this.price = price;
  }

  void displayLightDetails() {
    System.out.println();
    System.out.println("** Light Details **");
    System.out.println("Light Brand Name : " + brand);
    System.out.println("Light Color : " + color);
    System.out.println("Light Voltage : " + voltage);
    System.out.println("Light Price : " + price);
    System.out.println();
  }
}

class Stone {
  String color;
  double weight;
  String shape;
  double quantity;
  double price;

  Stone(
    String color,
    double weight,
    String shape,
    double quantity,
    double price
  ) {
    this.color = color;
    this.weight = weight;
    this.shape = shape;
    this.quantity = quantity;
    this.price = price;
  }

  void displayStoneDetails() {
    System.out.println();
    System.out.println("** Stone Details **");
    System.out.println("Stone color : " + color);
    System.out.println("Stone Weight : " + weight);
    System.out.println("Stone Shape : " + shape);
    System.out.println("Stone Quantity : " + quantity);
    System.out.println("Stone Price : " + price);
    System.out.println();
  }
}

public class FishDriver {

  public static void main(String[] args) {
    FishTank obj = new FishTank("5X4X2", "Glass", "Rectangle", 10);
    obj.displayFishTankDetails();
    obj.addWater();
    obj.water.displayWaterDetails();
    obj.addFish();
    obj.fish.displayFishDetails();
    obj.fish.addFood();
    obj.fish.food.displayFishFoodDetails();
    obj.addOxygenPump();
    obj.pump.displayOxygenPumpDetails();
    obj.addStones();
    obj.stone.displayStoneDetails();
    obj.addLights();
    obj.light.displayLightDetails();
  }
}