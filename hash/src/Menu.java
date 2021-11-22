
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Menu extends ArrayList<String>{
    int getUserChoice(){
        for (int i = 0; i < this.size(); i++) {
            System.out.println("" + (i+1) + "-" + this.get(i));
        } 
        return Inputter.getPostiveAnInteger("Choose operation: ", "Invalid");
    }
}
