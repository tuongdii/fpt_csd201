/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Student implements Comparable{
    String code, name;
    int mark;

    public Student(String code, String name, int mark) {
        this.code = code;
        this.name = name;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return code + ", " + name + ", " + mark;
    }
    
    @Override
    public int compareTo(Object o) {
        return code.compareTo(((Student)o).code);
    }
    public void update(){
        String newName;
        String newMarkStr;
        newName = Inputter.getString("New name, ENTER for bypassing: ", "Input invalid");
        if(newName.length()>0) this.name = newName;
        newMarkStr = Inputter.getString("New mark, ENETER for bypassing: ", "Input invalid");
        if(newMarkStr.length()>0) this.mark = Integer.parseInt(newMarkStr);
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
    
}
