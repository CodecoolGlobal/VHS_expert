package com.codecool;
import java.util.Scanner;

public class Menu {

    public void display_art(){
        System.out.println("\\   \\ /   /   |   \\/   _____/   ____ ___  _________   ____________/  |_  ______ _____________   ____   ______ ____   _____/  |_  ______ /\\");
        System.out.println(" \\   Y   /    ~    \\_____  \\  _/ __ \\\\  \\/  /\\____ \\_/ __ \\_  __ \\   __\\/  ___/ \\____ \\_  __ \\_/ __ \\ /  ___// __ \\ /    \\   __\\/  ___/ \\/");
        System.out.println("  \\     /\\    Y    /        \\ \\  ___/ >    < |  |_> >  ___/|  | \\/|  |  \\___ \\  |  |_> >  | \\/\\  ___/ \\___ \\\\  ___/|   |  \\  |  \\___ \\  /\\");
        System.out.println("   \\___/  \\___|_  /_______  /  \\___  >__/\\_ \\|   __/ \\___  >__|   |__| /____  > |   __/|__|    \\___  >____  >\\___  >___|  /__| /____  > \\/");
        System.out.println("                \\/        \\/       \\/      \\/|__|        \\/                 \\/  |__|               \\/     \\/     \\/     \\/          \\/");
        System.out.println("                ____   ____.__    .___                       __");
        System.out.println("                \\   \\ /   /|__| __| _/____  ____     _______/  |_  ___________   ____");
        System.out.println("                 \\   Y   / |  |/ __ |/ __ \\/  _ \\   /  ___/\\   __\\/  _ \\_  __ \\_/ __ \\");
        System.out.println("                  \\     /  |  / /_/ \\  ___(  <_> )  \\___ \\  |  | (  <_> )  | \\/\\  ___/");
        System.out.println("                   \\___/   |__\\____ |\\___  >____/  /____  > |__|  \\____/|__|    \\___  >");
        System.out.println("                                   \\/    \\/             \\/                          \\/  ");
    }

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


    public void program_menu(RuleParser ruleParser, ESProvider exsys, FactParser fparser) throws Exception{
        int option = 0;
        int choice = 0;
        display_art();
        Thread.sleep(500);
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


