package fabricaDeCarros.model;

public class Car {
    // What we need to create a car? // O que precisamos para criar um carro?
    // * Identification. // Identificacao.
        // ? licecensePlate. // Placa do carro.
        // ? serialCode. // Código serial.
    // * Color.  // Cor.
    // * Model. // Modelo.

    private String carColor;
    private String carModel;
    private String serialCode;

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

    public void setSerialCode(String serialCode) {
        this.serialCode = serialCode.toLowerCase();
    }

    public String getSerialCode() {
        return serialCode;
    }

}
