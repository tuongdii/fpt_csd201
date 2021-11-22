
package clockmng;

import util.Menu;


public class ClockManager {

    public static void main(String[] args) {
        ClockList list = new ClockList();
        int choice;
        Menu menu = new Menu("Welcome to Clock Management - @ 2021 by SE150159 Võ Thị Tường Duy");
        menu.addNewOption("1. Add a new food.");
        menu.addNewOption("2. Remove the food.");
        menu.addNewOption("3. Update the food.");
        menu.addNewOption("4. List all clocks.");
        menu.addNewOption("5. List all clocks in a range.");
        menu.addNewOption("6. Quit");
        do{
            menu.printMenu();
            choice = menu.getChoice();
            switch(choice){
                case 1:
                    list.addClock();
                    break;
                case 2:
                    list.removeClock();
                    break;
                case 3:
                    list.updateClock();
                    break;
                case 4:
                    list.display();
                    break;
                case 5:
                    list.printPrice();
                    break;
                case 6:
                    System.out.println("You have exited the program!");
                    break;
            }
        }while(choice<=5);
    }
}
   