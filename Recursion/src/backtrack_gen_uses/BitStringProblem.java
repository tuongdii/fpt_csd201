/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backtrack_gen_uses;

import backtrack_gen.BackTrackGenerator;
import backtrack_gen.Configuration;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class BitStringProblem {
    int nBit;
    ArrayList<Configuration> solutions;
    boolean solved = false;
    public BitStringProblem(int nBit){
        this.nBit = nBit;
        solutions = new ArrayList();
    }
    private boolean isAccepted(Configuration conf){
        return true;
    }
    public void solve(){
        solved = false;
        BackTrackGenerator gen = new BackTrackGenerator();
        for (int i = 0; i < nBit; i++) {
            gen.addDomain(0, 1);
        }
        gen.init();;
        Configuration suggestion = gen.getFirstConfig();
        while(suggestion!=null){
            if(isAccepted(suggestion)) solutions.add(suggestion);
            suggestion = gen.nextConfiguration();
        }
        solved = true;
    }
    public void printSolutions(){
        if(!solved) System.out.println("The problem is not solved yet!");
        else if(solutions.isEmpty()) System.out.println("No solution!");
        else{
            System.out.println("SOLUTION: "+ this.nBit + " bit strings");
            for (Configuration sol : solutions) {
                System.out.println(sol);
            }
            System.out.println(solutions.size() + " solutions.");
        }
    }
    public static void main(String[] args) {
        BitStringProblem prob = new BitStringProblem(5);
        prob.solve();
        prob.printSolutions();
    }
}
