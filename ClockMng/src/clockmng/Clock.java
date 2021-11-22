
package clockmng;

import java.util.ArrayList;


public class Clock extends ArrayList{
    private String id;
    private String manufact;
    private int price;
    private int quarantee;

    public Clock() {
    }

    public Clock(String id) {
        this.id = id;
    }
    
    
    
    public Clock(String id, String manufact, int price, int quarantee) {
        this.id = id;
        this.manufact = manufact;
        this.price = price;
        this.quarantee = quarantee;
    }

    public String getId() {
        return id;
    }

    public String getManufact() {
        return manufact;
    }

    public int getPrice() {
        return price;
    }

    public int getQuarantee() {
        return quarantee;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setManufact(String manufact) {
        this.manufact = manufact;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuarantee(int quarantee) {
        this.quarantee = quarantee;
    }

    @Override
    public String toString() {
        return "Clock{" + "id=" + id + ", manufact=" + manufact + ", price=" + price + ", quarantee=" + quarantee + '}';
    }
    
    public void output(){
        System.out.printf("|%-5s|%-15s|%-4d|%-4d|\n"
                            ,id, manufact, price, quarantee);
    }
    @Override
    public boolean equals(Object that){
        return this.id.equals(((Clock)that).id);
    }
}
