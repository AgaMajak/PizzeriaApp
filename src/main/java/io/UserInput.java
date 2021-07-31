package io;

public class UserInput {

    public static String askUserForName() {
        AppPrinter.printText("What's your name?");
        return AppReader.getString();
    }

    public static String askUserAboutModifyingPizza() {
        AppPrinter.printText("Do you want to modify ingredients on your pizza? yes/no");
        return AppReader.getStringAndLowerCase();
    }

    public static String askUserAboutOrderingAnotherPizza() {
        AppPrinter.printText("Would you like to order another pizza? yes/no");
        return AppReader.getStringAndLowerCase();
    }

    public static String askUserWhatModificationsDoOnPizza(){
        AppPrinter.printText("Do you want to alter the ingredient or add the indgredient? " +
                "If you don't want to change your pizza please type \"done\". add/alter/done");
       return AppReader.getStringAndLowerCase();
    }

}
