package casaV3;

import casaV3.controle.Controladora;

public class Principal {

    public static void main(String[] args) {
        Controladora controladora = new Controladora();

        controladora.exibeMenu();
    }
}
