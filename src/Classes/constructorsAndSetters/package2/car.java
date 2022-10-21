package Classes.constructorsAndSetters.package2;

public class car {

    private String _carName;
    private String _carPlateNumber;

    public car(String _carName) {
        this._carName = _carName;
    }

    public car(String _carName, String _carPlateNumber) {
        this._carName = _carName;
        this._carPlateNumber = _carPlateNumber;
    }

    public String get_carName() {
        return _carName;
    }

    public void set_carName(String _carName) {
        this._carName = _carName;
    }

    public String get_carPlateNumber() {
        return _carPlateNumber;
    }

    public void set_carPlateNumber(String _carPlateNumber) {
        this._carPlateNumber = _carPlateNumber;
    }

}

// package Classes.newJavaProject.pack1;

// public class car {
// private String brand;
// public String model;

// public car(String brand, String model) {
// this.model = model;
// this.brand = brand;
// }

// public String getModel() {
// return model;
// }

// public void setModel(String model) {
// this.model = model;
// }

// public car() {
// this.model = "Default Model";
// this.brand = "Default Brand";
// }

// public car(String brand) {
// this.brand = brand;
// }

// public String getBrand() {
// return brand;
// }

// public void setBrand(String brand) {
// this.brand = brand;
// }

// }
