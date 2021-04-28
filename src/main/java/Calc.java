package newPackage;

public class Calc {
    public static void main(String[] args) {

        System.out.println("Hello to your Final Exam Spring C 2021.");
        System.out.println("You got this!");

        System.out.println(Subtract(new int[]{1, 5, 3}));
    }

    /**
     * Returns first number in array minus all other numbers in array
     */
    public static int Subtract(int[] values){
        int first=values[0];
        int sub = 0;

        for (int i = 0; i < values.length; i++)
            sub += first - values[i];

        return sub;
    }
}
