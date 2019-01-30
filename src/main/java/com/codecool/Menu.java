package com.codecool;
import java.util.Scanner;

public class Menu {

    public void display_menu(String[] list) {
        int i;
        System.out.print("\n\n\n");
        for (i = 0; i < list.length; i++) {
            System.out.printf("%s. %s \n", i, list[i]);
        }
    }
    public void getInput(String[] list){
        int lastNumber = list.length-1;
        System.out.printf("\nChoose an option between 1 and %s, or enter 0 to exit: ", lastNumber);
    }

    public void program_menu() {
        int option = 0;
        do{
            String[] list = {"Exit Program", "Test", "Test", "Test", "Test"};
            display_menu(list);
            getInput(list);
            Scanner search = new Scanner(System.in);
            option = search.nextInt();
            switch(option){
                case 0:
                    System.exit(0);
                case 1:

                    break;
                case 2:
                    System.out.println("\nNot implemented yet, please choose another option \n");
                    break;
                case 3:
                    System.out.println("\nNot implemented yet, please choose another option \n");
                    break;
                case 4:
                    System.out.println("\nNot implemented yet, please choose another option \n");
                case 5:
                    System.out.println("\nNot implemented yet, please choose another option \n");
                default:
                    System.out.println("\nInvalid option! \n");
            }
        } while (option != 0);
    }

}


