/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lenovo
 */
public class Homework {
    
    private String nameOfHomework;
    private String score = "-";
    
    public Homework(String name, String score){
        this.nameOfHomework = name;
        this.score = score;
    }
    public Homework(String name){
       nameOfHomework = name;
    }

    public boolean isAlready(String hwName){
        return this.nameOfHomework.equals(hwName);
    }
    public void setScore(String score){
        this.score = score;
    }
    public String getHomework(){
        return this.nameOfHomework;
    }
    public String getScore(){
        return this.score;
    }
    @Override
    public String toString(){
        System.out.print(this.nameOfHomework+" ");
        return "";
    }
}

