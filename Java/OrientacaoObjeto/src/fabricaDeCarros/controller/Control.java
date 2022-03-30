package fabricaDeCarros.controller;

import fabricaDeCarros.model.Car;
import fabricaDeCarros.model.Fabric;
import fabricaDeCarros.view.*;

public class Control {
    public void displayMenu() {
        int option = 0;

        do{
            option = Input.requestOption();
            switch (option) {
                case 0: {
                    // Create car
                    Fabric.createCar();
                    break;
                }
                case 1: {
                    // Sell a car
                    Fabric.sellCar();
                    break;
                }
                case 2: {
                    // Show car infos
                    Fabric.showCarInfos();
                    break;
                }
            }
        } while(option != 3);


        Output.displayFinishProgram();
        System.exit(0);
    };
}
