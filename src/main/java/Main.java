package mainPackage;
import newPackage.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello to your Final Exam Spring C 2020.");
        System.out.println("You got this!");

        Calc some = new Calc();
        System.out.println("Subtracting stuff: " + some.Subtract(new int[]{1, 5, 3}));
    }

}
