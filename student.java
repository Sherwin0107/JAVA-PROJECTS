package Project;

import java.util.Scanner;

public class student {



    int idNum;
    String name;
    String course;
    double grade;

    public student( int x, String y, String z, double c){
        this.idNum = x;
        this.name = y;
        this.course = z;
        this.grade = c;

    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("ID Number: "+ idNum);
        System.out.println("Course: "+ course);
        System.out.println("Grade: " + grade);
        System.out.println("==============================");
    }

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String y = sc.nextLine();
        System.out.print("Enter ID Number: ");
        int x = sc.nextInt();sc.nextLine();
        System.out.print("Enter Course: ");
        String z = sc.nextLine();
        System.out.print("Enter GWA: ");
        double c = sc.nextDouble();
        sc.nextLine();

        student std1 = new student(x,y, z,c);

        std1.display();
    }
}