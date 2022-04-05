package fabricaDeCarros.model;

import fabricaDeCarros.view.*;

import javax.swing.*;
import java.util.ArrayList;

public class Factory {
    static ArrayList<Car> cars = new ArrayList<>();

    public static void createCar() {
        int carsQnt = Input.requestManyCarsToCreate();

        for( int i = 0; i < carsQnt; i++ ){
            Car newCar = new Car();

            String licensePlate = JOptionPane.showInputDialog(null, "Qual a placa do " + (i+1) + "o carro?").toLowerCase();
            while(verifyLicensePlateAlreadyExist(licensePlate)){
                JOptionPane.showMessageDialog(null, "Essa placa já existe");
                licensePlate = JOptionPane.showInputDialog(null, "Qual a placa do " + (i+1) + "o carro?");
            };
            newCar.setLicensePlate(licensePlate);

            String carModel = JOptionPane.showInputDialog(null, "Qual o modelo do " + (i+1) + "o carro?");
            newCar.setCarModel(carModel);

            String color = JOptionPane.showInputDialog(null, "Qual a cor do " + (i+1) + "o carro?");
            newCar.setCarColor(color);

            cars.add(newCar);
        }

        Output.displayCarsAddedToList(carsQnt);
    }

    public static void sellCar() {
        if(cars.isEmpty()) {
            Output.displayWarningCarsNotCreated();
            return;
        }

        String[] carOptionsMenu = new String[cars.size()];

        for(int i = 0; i < cars.size(); i++) {
            carOptionsMenu[i] = cars.get(i).getLicensePlate() + " | "
                    + cars.get(i).getCarModel() + " | "
                    + cars.get(i).getCarColor();
        }

        JComboBox<String> carsMenu = new JComboBox<>(carOptionsMenu);
        JOptionPane.showConfirmDialog(null, carsMenu, "Selecione o carro para ser excluido", JOptionPane.OK_CANCEL_OPTION);

        int carToSold = carsMenu.getSelectedIndex();
        cars.remove(carToSold);

        Output.displaySoldCar();
    }

    public static void showCarInfos(){
        if(cars.isEmpty()){
            Output.displayWarningCarsNotCreated();
            return;
        }

        String infos = "Modelo | Cor | Placa\n";
        for(Car car : cars) {
            infos += car.getCarModel() + " | " + car.getCarColor() + " | " + car.getLicensePlate() + "\n";
        }

        Output.displayCarInfos(infos);
    }

    private static boolean verifyLicensePlateAlreadyExist(String licensePlate){
        for(Car car : cars) {
            if(car.getLicensePlate().equals(licensePlate)) {
                return true;
            }
        }
        return false;
    }

}
