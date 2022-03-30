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
                    Factory.createCar();
                    break;
                }
                case 1: {
                    // Sell a car
                    Factory.sellCar();
                    break;
                }
                case 2: {
                    // Show car infos
                    Factory.showCarInfos();
                    break;
                }
            }
        } while(option != 3);


        Output.displayFinishProgram();
        System.exit(0);
    };
}
