/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clockmng;

import util.Inputter;
import java.util.LinkedList;


public class ClockList extends LinkedList<Clock>{
    
    public void addClock(){
        String id = Inputter.getString("Enter clock id: ", "Input invalid!");
        String manufact = Inputter.getString("Enter manufacturer: ", "Input invalid!");
        int price = Inputter.getPostiveAnInteger("Enter price: ", "Input invalid!");
        int quarantee = Inputter.getPostiveAnInteger("Enter quarantee: ", "Input invalid!");
        Clock clk = new Clock(id, manufact, price, quarantee);
        if(this.add(clk)==true)
            System.out.println("Added Successfully.");
        else
            System.out.println("Added failed!");
    }
    
    private int search (String id){
        return this.indexOf(new Clock(id));
    }
    
    public void removeClock(){
        String id;
        id = Inputter.getString("Enter the clock id you want to remove: ", "Input invalid!");
        int pos = search(id);
        if(pos < 0)
            System.out.println("Not foun!");
        else{
            this.remove();
            System.out.println("Remove successfully!");
        }
    }
    public void updateClock(){
        String id;
        id = Inputter.getString("Enter the clock id you want to update: ", "Input Invalid!");
        int pos = search(id);
        if(pos<0)
            System.out.println("Not found!");
        else{
            String nId = Inputter.getString("Enter new id: ", "Input invalid!");
            String manufact = Inputter.getString("Enter new manufacturer: ", "Input invalid!");
            int price = Inputter.getPostiveAnInteger("Enter new price: ", "Input invalid!");
            int quarantee = Inputter.getPostiveAnInteger("Enter new quarantee: ", "Input invalid!");
            this.get(pos).setId(nId);
            this.get(pos).setManufact(manufact);
            this.get(pos).setPrice(price);
            this.get(pos).setQuarantee(quarantee);
            System.out.println("Update successfully!");
        }
                
    }
    public void display(){
        for (Clock clk : this) {
            clk.output();
        }
    }
    public void printPrice(){
        int price1, price2;
        System.out.println("Input price range: ");
        price1 = Inputter.getPostiveAnInteger("Price 1: ", "Input invalid!");
        price2 = Inputter.getPostiveAnInteger("Price 2: ", "Input invalid!");
        if(price1 > price2){
            int tmp = price1;
            price1 = price2;
            price2 = tmp;
        }
        for (Clock clk : this) {
            int price = clk.getPrice();
            if(price >= price1 && price <= price2)
                clk.output();
        }
    }
}
