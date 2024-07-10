class WhiteBoard {
    String board = "Gurjan";
    String dim = "15*4";
    double price = 10000;
    Marker marker;
    Duster duster;

    void displayBoard() {
        System.out.println("White Board: " + this.board + ", Dimensions: " + this.dim + ", Price: " + this.price + " rs");
    }

    void addMarker() {
        marker = new Marker();
    }

    void addDuster() {
        duster = new Duster();
    }
}

class Marker {
    String brand = "Camlin";
    String type = "White Board Marker";
    String color = "BLACK";
    double price = 40;

    void displayMarker() {
        System.out.println("Marker: " + this.brand + " " + this.type + ", Color: " + this.color + ", Price: " + this.price + " rs.");
    }
}

class Duster {
    String brand = "Polo";
    double price = 150;
    String material = "Plastic";

    void displayDuster() {
        System.out.println("Duster: " + this.brand + ", Material: " + this.material + ", Price: " + this.price + " rs.");
    }
}

 class WhiteBordDriver {
    public static void main(String[] args) {
        WhiteBoard obj = new WhiteBoard();
        obj.displayBoard();
        obj.addMarker();
        obj.marker.displayMarker();
        obj.addDuster();
        obj.duster.displayDuster();
    }
}