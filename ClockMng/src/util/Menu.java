
package util;

import util.Inputter;
import java.util.ArrayList;


public class Menu {
    private String menuTitle;
    private ArrayList<String> optionList = new ArrayList();
    
    public Menu(String menuTitle) {
        this.menuTitle = menuTitle;
    }
        
    public void addNewOption(String newOption) {
        for (String string : optionList) {
            if(string.contains(newOption)){
                System.out.println("Can not add this option!");
                return;
            }
        }
        optionList.add(newOption);       
    }

    public void printMenu() {
        if (optionList.isEmpty()) {
            System.out.println("There is no item in the menu");
            return;
        }
        System.out.println(menuTitle);
        for (String x : optionList)
            System.out.println(x);  
    }
    

    public int getChoice() {
        int maxOption = optionList.size();
        String inputMsg = "Choose [1.." + maxOption + "]: ";
        String errorMsg = "You are required to choose the option 1.." + maxOption; 
        return Inputter.getAnInteger(inputMsg, errorMsg, 1, maxOption);
    }
    
}
