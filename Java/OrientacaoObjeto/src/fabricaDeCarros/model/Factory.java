package fabricaDeCarros.model;

import java.util.ArrayList;

public class Factory {
    private static ArrayList<Car> cars = new ArrayList<>();

    public static void createCar(String model, String serialCode, String color) {
            Car newCar = new Car();

            newCar.setSerialCode(serialCode);
            newCar.setCarModel(model);
            newCar.setCarColor(color);

            cars.add(newCar);
    }

    public static void sellCar(int carToSell) {
        cars.remove(carToSell);
    }

    public static String showCarInfos(){
        String infos = "Modelo | Cor | Código Serial\n";

        for(Car car : cars) {
            infos += car.getCarModel() + " | " + car.getCarColor() + " | " + car.getSerialCode() + "\n";
        }

        return infos;
    }

    public static boolean verifySerialCodeAlreadyExist(String serialCode){
        for(Car car : cars) {
            if(car.getSerialCode().equals(serialCode)) {
                return true;
            }
        }
        return false;
    }

    public static String[] createOptionsMenu() {
        String[] carOptionsMenu = new String[cars.size()];

        for(int i = 0; i < cars.size(); i++) {
            carOptionsMenu[i] = cars.get(i).getSerialCode() + " | "
                    + cars.get(i).getCarModel() + " | "
                    + cars.get(i).getCarColor();
        }

        return carOptionsMenu;
    }

    public static boolean verifyCarsIsEmpty(){
        return cars.isEmpty();
    }
}
