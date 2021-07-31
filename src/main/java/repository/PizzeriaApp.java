package repository;

import controller.PizzeriaControl;

public class PizzeriaApp {
    public static void main(String[] args){

        PizzeriaControl pizzeriaControl = new PizzeriaControl();
        pizzeriaControl.startPizzeriaApp();
        pizzeriaControl.closePizzeriaApp();

    }
}
