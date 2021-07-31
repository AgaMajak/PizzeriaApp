package controller;

import io.AppPrinter;
import io.AppReader;
import io.FileManager;
import model.Order;

import java.io.IOException;

public class PizzeriaControl {
    private Order order;

    public void startPizzeriaApp() {
        OrderCreator orderCreator  = new OrderCreator();
        order = orderCreator.getOrder();
    }

    public void closePizzeriaApp(){
        AppPrinter.printResumeAndGoodbye(order);
        closeAppAndWriteDataToFile();
    }


    private void closeAppAndWriteDataToFile() {
        AppReader.closeScanner();
        try {
            FileManager.exportOrderToFile(order);
        } catch (IOException e) {
            AppPrinter.printText("Something went wrong, unable to process the file.");
        }
    }
}
