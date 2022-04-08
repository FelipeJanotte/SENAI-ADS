package fabricaDeCarros.model;

import fabricaDeCarros.view.*;

import java.util.ArrayList;

public class Factory {
    static ArrayList<Car> cars = new ArrayList<>();

    public static void createCar() {
        int carsQnt = Input.requestManyCarsToCreate();

        for( int i = 0; i < carsQnt; i++ ){
            Car newCar = new Car();

            String licensePlate = Input.requestLicensePlate((i+1));
            while(verifyLicensePlateAlreadyExist(licensePlate)){
                Output.displayLicensePlateExists();
                licensePlate = Input.requestLicensePlate((i+1));
            };
            newCar.setLicensePlate(licensePlate);

            String carModel = Input.requestCarDescription("modelo", (i+1));
            newCar.setCarModel(carModel);

            String color = Input.requestCarDescription("cor", (i+1));
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

        int carToSell = Input.requestCarToSell(carOptionsMenu);
        cars.remove(carToSell);

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
