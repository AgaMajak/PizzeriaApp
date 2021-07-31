package io;

import model.Order;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileManager {
    private static final String ORDERS_FILE_NAME = "Orders.csv";

    public static void exportOrderToFile(Order order) throws IOException {
        FileWriter fileWriter = new FileWriter(ORDERS_FILE_NAME, true);
        PrintWriter outputFile = new PrintWriter(fileWriter);
        outputFile.println(order.toString());
        outputFile.close();
    }

}
