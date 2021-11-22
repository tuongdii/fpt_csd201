/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backtrack_gen;

import java.util.Collection;

/**
 *
 * @author DELL
 */
public class IntMinMaxSet {
    private int minVal = 0;
    private int maxVal = 0;
    int curVal = minVal-1;
    public IntMinMaxSet (int min, int max){
        if(min > max){
            int t = min;
            min = max;
            max = t;
        }
        this.minVal = min;
        this.maxVal = max;
        curVal = minVal - 1;
    }
    public IntMinMaxSet(Collection collection){
        this.minVal = 0;
        this.maxVal = collection.size()-1;
        curVal = minVal -1 ;
    }
    public boolean hasNext(){
        return curVal + 1 < maxVal;
    }
    public int nextValue(){
        if(this==null) throw new RuntimeException("The set is empty!");
        if(this.isLastValue()) throw new RuntimeException("End of the set!");
        curVal++;
        return curVal;   
    }
    public boolean isLastValue(){
        return curVal == maxVal;
    }
    public void reset(){
        curVal = minVal - 1;
    }
}
