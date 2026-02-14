package Project;

import java.util.Scanner;

public class attendanceTracker{

    int idNum;
    String StudentName;
    int attendedClass;
    int totalClass = 8;

    public attendanceTracker(String studentName, int idNum, int attendedClass, int totalClass){
        this.StudentName = studentName;
        this.idNum = idNum;
        this.totalClass = totalClass;
        this.attendedClass = attendedClass;
    }

    public void display(){

        double percentage =  ((double)attendedClass / totalClass) * 100;
        System.out.println("\n\n ==============================");
        System.out.println(StudentName);
        System.out.println(idNum);
        System.out.println(totalClass);
        System.out.println("Attended Class: " + attendedClass+"/"+totalClass + " ---> "+ percentage+ "%");
        System.out.println("==============================");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String studentName = sc.nextLine();
        System.out.print("Enter ID number: ");
        int idNum = sc.nextInt();sc.nextLine();
        System.out.print("Enter total number of your class: ");
        int totalClass = sc.nextInt();sc.nextLine();

        String[] total = new String[totalClass];

        for (int i = 0; i < total.length; i++) {
            System.out.print("Enter subject: ");
            total[i] = sc.nextLine();
        }

        System.out.println("--------------");
        for (String subs : total){
            System.out.println(subs);
        }

        System.out.print("Enter total class attended: ");
        int attendedClass = sc.nextInt();

        attendanceTracker obj = new attendanceTracker(studentName, idNum, attendedClass, totalClass);

        obj.display();
    }


}