package com.codecool;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public void display_menu(String[] list) {
        int i;

        for (i = 0; i < list.length; i++) {
            System.out.printf("%s. %s \n", i, list[i]);
        }
    }
    public void getInput(String[] list){
        int lastNumber = list.length-2;
        System.out.printf("\nChoose an option between 0 and %s, or enter 7 to exit: ", lastNumber);
    }


    public void program_menu(RuleParser ruleParser, ESProvider exsys, FactParser fparser) {
        int option = 0;
        int choice = 0;
        do{
            String[] list = {"Recommend a movie", "All movies", "Movies by language", "Movies by rating",  "Movies by category", "Movies by length", "Live action or animated", "Exit Program"};
            display_menu(list);
            getInput(list);
            Scanner search = new Scanner(System.in);
            option = search.nextInt();

            switch(option){
                case 7:
                    System.exit(0);
                case 2:
                    System.out.println("\nShould the movie be available in multiple languages? \n1.English \n2.Multilingual\n");

                    choice = search.nextInt();
                    System.out.println();
                    if(choice == 1){
                        exsys.listByCriteria(fparser.getFactRepository().getFacts(), (x) -> !(x.isMultilang()));
                        break;
                    } else if(choice == 2){
                        exsys.listByCriteria(fparser.getFactRepository().getFacts(), (x) -> x.isMultilang());
                        break;
                    }
                    else{
                        System.out.println("\nThat's not a valid option\n");
                        break;
                    }
                case 3:
                    System.out.println("\nWould you like to watch a high rated movie? \n1.High rated \n2.Low rated\n");
                    choice = search.nextInt();
                    if(choice == 1){
                        exsys.listByCriteria(fparser.getFactRepository().getFacts(), (x) -> x.isHighRated());
                        break;
                    } else if(choice == 2){
                        exsys.listByCriteria(fparser.getFactRepository().getFacts(), (x) -> !(x.isHighRated()));
                        break;
                    }
                    else{
                        System.out.println("\nThat's not a valid option\n");
                        break;
                    }
                case 1:
                    for(Fact fact : fparser.getFactRepository().getFacts()) {
                        System.out.println(fact.toString());
                    }
                    break;
                case 4:
                    System.out.println("\nWould you like to see a family friendly movie? \n1.Yes\n2.No\n");
                    choice = search.nextInt();
                    if(choice == 1){
                        exsys.listByCriteria(fparser.getFactRepository().getFacts(), (x) -> x.isFamilyFriendy());
                        break;
                    } else if(choice == 2){
                        exsys.listByCriteria(fparser.getFactRepository().getFacts(), (x) -> !(x.isFamilyFriendy()));
                        break;
                    }
                    else{
                        System.out.println("\nThat's not a valid option\n");
                        break;
                    }
                case 5:
                    System.out.println("\nDo you have the time for a longer movie? \n1.Yes \n2.No\n");
                    choice = search.nextInt();
                    if(choice == 1){
                        exsys.listByCriteria(fparser.getFactRepository().getFacts(), (x) -> x.isLongMovie());
                        break;
                    } else if(choice == 2){
                        exsys.listByCriteria(fparser.getFactRepository().getFacts(), (x) -> !(x.isLongMovie()));
                        break;
                    }
                    else{
                        System.out.println("\nThat's not a valid option\n");
                        break;
                    }
                case 0:
                    ruleParser.getRulerepo().getAllAnswers();
                    System.out.println();
                    exsys.collectAnswers(fparser.getFactRepository().getFacts(), ruleParser.getRulerepo().getQuestions());
                    break;
                case 6:
                    System.out.println("\nWould you like to see an animated or a live-action movie? \n1.Live-action \n2.Animated\n");
                    choice = search.nextInt();
                    if(choice == 1){
                        exsys.listByCriteria(fparser.getFactRepository().getFacts(), (x) -> !(x.isAnimation()));
                        break;
                    } else if(choice == 2){
                        exsys.listByCriteria(fparser.getFactRepository().getFacts(), (x) -> x.isAnimation());
                        break;
                    }
                    else{
                        System.out.println("\nThat's not a valid option\n");
                        break;
                    }

                default:
                    System.out.println("\nInvalid option! \n");
            }
        } while (option != 7);
    }

}


