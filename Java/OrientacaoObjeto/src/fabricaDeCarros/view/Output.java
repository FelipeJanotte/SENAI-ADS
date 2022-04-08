package fabricaDeCarros.view;

import javax.swing.*;

public class Output {
    public static void displayFinishProgram() {
        JOptionPane.showMessageDialog(null, "O programa sera encerrado!");
    }

    public static void displayCarsAddedToList(int carsQuantity) {
        JOptionPane.showMessageDialog(null, "Foram adicionado(s) " + carsQuantity + " carro(s) na lista.");
    }

    public static void displaySoldCar() {
        JOptionPane.showMessageDialog(null, "Carro vendido!");
    }

    public static void displayCarInfos(String carInfos) {
        JOptionPane.showMessageDialog(null, carInfos);
    }

    public static void displayWarningCarsNotCreated() {
        JOptionPane.showMessageDialog(null, "Nenhum carro foi cadastrado!");
    }

    public static void displayLicensePlateExists(){
        JOptionPane.showMessageDialog(null, "Essa placa já existe");
    }
}
