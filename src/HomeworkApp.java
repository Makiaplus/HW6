
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lenovo
 */
public class HomeworkApp {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
     public static void main(String[] args) throws FileNotFoundException {

        FileReader file = new FileReader("//home//tnk//NetBeansProjects//StudentHomework//input.txt");
        Scanner input = new Scanner(file);
        ArrayList<Student> sRecord = new ArrayList<>();
        ArrayList<Homework> hwRecord = new ArrayList<>();
        while (input.hasNext()) {
            String [] data = input.next().split(":");
           
            boolean same = false;
            for (Student s : sRecord) {
                if (s.isSame(data[0])) {
                    s.hRecord.add(new Homework(data[1], data[2]));
                    same = true;
                    break;
                }
            }
            if (!same) {
                sRecord.add(new Student(data[0], data[1], data[2]));
            }        

            boolean already = false;
            for (Homework h : hwRecord) {
                if (h.isAlready(data[1])) {
                    already = true;
                    break;
                }
            }
            if (!already) {
                hwRecord.add(new Homework(data[1]));
            }

        }
        System.out.print("          ");
        for (Homework h : hwRecord) {
            System.out.print(h);
        }
        System.out.println("");

        for (Student s : sRecord) {
            System.out.print(s + " ");
            for (Homework hw : hwRecord) {
                if(s.isSubmit(hw.getHomework())){
                    s.printSubmitScore(hw.getHomework());
                } else {
                    System.out.print(" " + hw.getScore() +" ");
                }
            }
            System.out.println("");
        }
    }
}