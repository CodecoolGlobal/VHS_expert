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
            String[] list = {"Exit Program", "Films by Language", "Films by rating", "All films", "Films by category", "Films by length"};
            display_menu(list);
            getInput(list);
            Scanner search = new Scanner(System.in);
            Scanner ans = new Scanner(System.in);
            option = search.nextInt();
            switch(option){
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println("\nWhat kind of language do you want to watch movie? 1.Hungarian 2.Foreign\n");
                    if(ans.nextInt() == 1){
                        System.out.println("\nI need a list from Attila\n");
                        break;
                    } else if(ans.nextInt() == 2){
                        System.out.println("\nI need a list from Attila\n");
                        break;
                    }
                    else{
                        System.out.println("\nWhy you can't choose from the choices?\n");
                        break;
                    }
                case 2:
                    System.out.println("\nWhat kind of rating movie do you want to watch? 1.High rating 2.Low rating\n");
                    if(ans.nextInt() == 1){
                        System.out.println("\nI need a list from Attila\n");
                        break;
                    } else if(ans.nextInt() == 2){
                        System.out.println("\nI need a list from Attila\n");
                        break;
                    }
                    else{
                        System.out.println("\nWhy you can't choose from the choices?\n");
                        break;
                    }
                case 3:
                    System.out.println("\nSee our movie library\n");
                    break;
                case 4:
                    System.out.println("\nWhat kind of category movie want to watch?\n");
                    if(ans.nextInt() == 1){
                        System.out.println("\nI need a list from Attila\n");
                        break;
                    } else if(ans.nextInt() == 2){
                        System.out.println("\nI need a list from Attila\n");
                        break;
                    }
                    else{
                        System.out.println("\nWhy you can't choose from the choices?\n");
                        break;
                    }
                case 5:
                    System.out.println("\nHow many time you want to lose with the movie? 1.Not so many 2.I have as much time as ocean\n");
                    if(ans.nextInt() == 1){
                        System.out.println("\nI need a list from Attila\n");
                        break;
                    } else if(ans.nextInt() == 2){
                        System.out.println("\nI need a list from Attila\n");
                        break;
                    }
                    else{
                        System.out.println("\nWhy you can't choose from the choices?\n");
                        break;
                    }
                default:
                    System.out.println("\nInvalid option! \n");
            }
        } while (option != 0);
    }

}


