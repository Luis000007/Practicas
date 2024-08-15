package Java.Intermedio.Practicas.Encapsulación;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int a = read.nextInt();

        Pupil pupil =  new Pupil();
        pupil.setAge(a);
    }
}

class Pupil {

    private int age;

    //complete setter method
    public void  setAge(int a){
        this.age = a;

        if (a >= 7) {
            System.out.println("Welcome");
        } else {
            System.out.println("Sorry");
        }

    }

    public int getAge(){
        return age;
    }
}