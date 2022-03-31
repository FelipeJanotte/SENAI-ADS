package fabricaDeCarros.model;

public class Car {
    // What we need to create a car? // O que precisamos para criar um carro?
    // * Identification. // Identificacao.
        // ? licecensePlate. // Placa do carro
    // * Color.  // Cor.
    // * Model. // Modelo.

    private String carColor;
    private String carModel;
    private String licensePlate;

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarColor(){
        return carColor;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel.toLowerCase();
    }

    public String getCarModel() {
        return carModel;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate.toLowerCase();
    }

    public String getLicensePlate() {
        return licensePlate;
    }

}
