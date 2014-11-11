/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lenovo
 */
import java.util.ArrayList;

public class Student {


    private String id;
    ArrayList<Homework> hRecord = new ArrayList<>();


    public Student(String id) {
        this.id = id;
    }

    public Student(String id, String hw, String score) {
        this.id = id;
        hRecord.add(new Homework(hw, score));
    }


    public boolean isSame(String id) {
        return this.id.equals(id);
    }

    public boolean isSubmit(String hwName) {
        for (Homework h : hRecord) {
            if (h.getHomework().equals(hwName)) {
                return true;
            }
        }
        return false;
    }

    public void printSubmitScore(String hwName) {
        for (Homework h : hRecord) {
            if (h.getHomework().equals(hwName)) {
                System.out.printf(" %2d ",Integer.parseInt(h.getScore()));
                break;
            }
        }
    }

    @Override
    public String toString() {

        System.out.print(this.id);
        return "";
    }
}