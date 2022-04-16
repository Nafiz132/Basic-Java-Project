package student.management;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher sabuz= new Teacher(1,"Sabuz Ahmed",1000);
        Teacher arif= new Teacher(2,"Arif",2000);
        Teacher jowel= new Teacher(3,"Mazhar",4000);
        Teacher reza = new Teacher(4,"Rezaul Karim",3500);

        List<Teacher> teacherList = new ArrayList<>();

        teacherList.add(sabuz);
        teacherList.add(arif);
        teacherList.add(jowel);
        teacherList.add(reza);

        Student namir= new Student(1," Ashikur Rahman ",8);
        Student araf = new Student(2,"Al Araf",7);
        Student rafin = new Student(3,"Nasimul Alom",10);
        Student rony= new Student(4,"Rony", 12);

        List<Student> studentList = new ArrayList<>();

        studentList.add(namir);
        studentList.add(araf);
        studentList.add(rafin);
        studentList.add(rony);

        School ghmi= new School(teacherList,studentList);
        //System.out.println("Gulesta Hafiz Memorial Institute's Total earning is "+ghmi.getTotalMoneyEarned());

        namir.updateFeesPaid(2500);
        araf.updateFeesPaid(1000);
        rafin.updateFeesPaid(2000);
        rony.updateFeesPaid(5000);

        System.out.println("Gulesta Hafiz Memorial Institute's Total earning is "+ghmi.getTotalMoneyEarned()+"\n");


        System.out.println("      ***For Teacher Payment ***   \n");

        sabuz.receivedSalary(sabuz.getSalary());
        System.out.println("GHMI has spent for "+sabuz.getName()+" about "+sabuz.getSalary()+" and remaining balance for GHMI is "+ ghmi.getTotalMoneyEarned());
        arif.receivedSalary(arif.getSalary());
        jowel.receivedSalary(jowel.getSalary());
        reza.receivedSalary(reza.getSalary());

        //System.out.println("GHMI has spent in teacher's salary ");
        System.out.println(rony);

        jowel.receivedSalary(jowel.getSalary());

        System.out.println(jowel);

    }
}
