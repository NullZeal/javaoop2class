package Classes.constructorsAndSetters.package1;

public class Wearable {

    // member variables / fields/ attributes
    public String brand;
    public String type;

    // the constructor needs to be public
    // static Computer aComputer = new Computer(); //composition
    // static Computer bComputer = new Computer("Lenovo", "X1 Carbon Gen 10", )

    // no args constructor

    public Wearable() {
        this.brand = brand;
        this.type = type;
    }

    public Wearable(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }
}
