package fabricaDeCarros.controller;

import fabricaDeCarros.model.Factory;
import fabricaDeCarros.view.*;

public class Control {
    public void displayMenu() {
        int option = 0;

        do{
            option = Input.requestOption();
            switch (option) {
                case 0: {
                    // Create car
                    int carsQnt = Input.requestManyCarsToCreate();

                    if(carsQnt == -1){
                        Output.displayOperationCancelled("Fabricacao");
                    } else {
                        for(int i = 0; i < carsQnt; i++) {
                            String model = Input.requestCarDescription("modelo", (i + 1));
                            String color = Input.requestCarDescription("cor", (i + 1));
                            String serialCode = Input.requestCarDescription("código serial", (i + 1));
                            while(Factory.verifySerialCodeAlreadyExist(serialCode)){
                                Output.displaySerialCodeExist();
                                serialCode = Input.requestCarDescription("código serial", (i + 1));
                            }

                            Factory.createCar(model, serialCode, color);
                        }
                        Output.displayCarsAddedToList(carsQnt);
                    }

                    break;
                }
                case 1: {
                    // Sell a car
                    if(Factory.verifyCarsIsEmpty()){
                        Output.displayWarningCarsNotCreated();
                    } else {
                        String[] carOptionsMenu = Factory.createOptionsMenu();
                        int carToSell = Input.requestCarToSell(carOptionsMenu);

                        if(carToSell == -1) {
                            Output.displayOperationCancelled("Venda");
                        } else {
                            Factory.sellCar(carToSell);
                            Output.displaySoldCar();
                        }
                    }
                    break;
                }
                case 2: {
                    // Show car infos
                    if(Factory.verifyCarsIsEmpty()) {
                        Output.displayWarningCarsNotCreated();
                    } else {
                        String infos = Factory.showCarInfos();
                        Output.displayCarInfos(infos);
                    }
                    break;
                }
            }
        } while(option != 3);


        Output.displayFinishProgram();
        System.exit(0);
    };
}
