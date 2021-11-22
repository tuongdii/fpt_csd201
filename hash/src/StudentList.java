
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class StudentList extends Hashtable<String, Student>{
    public StudentList(){
        super();
    }
    public boolean loadFromFile(String filename){
        try{
            FileInputStream fi = new FileInputStream(filename);
            InputStreamReader isr = new InputStreamReader(fi, "UTF8");
            BufferedReader bf = new BufferedReader(isr);
            String line;
            while((line = bf.readLine())!=null){
                line = line.trim();
                String[] ar = line.split("[,]");
                if(ar.length==3){
                    Student st = new Student(ar[0], ar[1], Integer.parseInt(ar[2]));
                    this.put(st.code, st);
                }
            }
            bf.close();
            isr.close();
            fi.close();
            return true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
    return false;    
    }
    
    public boolean saveToFile(String filename){
        try {
            FileOutputStream fo = new FileOutputStream(filename);
            OutputStreamWriter osw = new OutputStreamWriter(fo, "UTF8");
            PrintWriter pw = new PrintWriter(osw);
            Iterator<String> it = this.keySet().iterator();
            while(it.hasNext()){
                String key = it.next();
                Student st = this.get(key);
                pw.println(st);
            }
            pw.close();
            osw.close();
            fo.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public Student search(String code){
        return this.get(code);
    }
    public void addStudent(){
        String code, name;
        int mark;
        System.out.println("Enter data of new student: ");
        boolean cont = true;
        do{
            code = Inputter.getString("Code: ", "Invalid!");
            cont = search(code)!=null;
            if(cont)System.out.println("Code is duplicated!");
        }
        while(cont);
        name = Inputter.getString("Name: ", "Invalid!");
        mark = Inputter.getPostiveAnInteger("Mark: ", "Invalid!");
        this.put(code, new Student(code, name, mark));
        System.out.println("New student " + code + "has been added.");
    }
    
    public void searchStudent(){
        String code;
        if(this.isEmpty()){
            System.out.println("Empty list!");
            return;
        }
        code = Inputter.getString("Enter student code for searching: ", "Invalid!");
        Student st = this.search(code);
        if(st==null) System.out.println("This code doesn't exits!");
        else System.out.println(st);
    }
    
    public void removeStudent(){
        String code;
        if(this.isEmpty()){
            System.out.println("Empty list!");
            return;
        }
        code = Inputter.getString("Enter student code for removing: ", "invalid!");
        Student st = this.search(code);
        if(st==null) System.out.println("This code doesn't exits!");
        else{
            remove(code);
            System.out.println("The student " + code + " has been removed.");
        }
    }
    public void updateStudent(){
        String code;
        if(this.isEmpty()){
            System.out.println("Empty list!");
            return;
        }
        code = Inputter.getString("Enter student code for updating: ", "invalid!");
        Student st = this.search(code);
        if(st==null) System.out.println("This code doesn't exits!");
        else st.update();
    }
    public void print(){
        if(this.isEmpty()){
            System.out.println("Empty list!");
            return;
        }
        ArrayList<Student> list = new ArrayList();
        list.addAll(this.values());
        Collections.sort(list);
        for (Student student : list) {
            System.out.println(student);
        }
    }
}