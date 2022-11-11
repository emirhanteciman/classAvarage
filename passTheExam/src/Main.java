import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math, physics, turkish, chemistry, music;
        double avarage;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your math grade: ");
        math = input.nextInt();
        if ((math) < 0 || math > 100)
            System.out.println("İnvalid grade. Please enter again");
        System.out.println("Please enter your physics grade ");
        physics = input.nextInt();
        if ((physics) < 0 || physics > 100)
            System.out.println("İnvalid grade. Please enter again");
        System.out.println("Please enter your turkish grade ");
        turkish = input.nextInt();
        if ((turkish) < 0 || turkish > 100)
            System.out.println("İnvalid grade. Please enter again");
        System.out.println("Please enter your chemistry grade ");
        chemistry = input.nextInt();
        if ((chemistry) < 0 || chemistry > 100)
            System.out.println("İnvalid grade. Please enter again");
        System.out.println("Please enter your music grade ");
        music = input.nextInt();
        if ((music) < 0 || music > 100)
            System.out.println("İnvalid grade. Please enter again");
        avarage = (math + physics + turkish + chemistry + music) / 5;
        System.out.println(avarage);

        if (avarage >= 55) {
            System.out.println("Congrulations pass the class :) :) :) ");
        } else if (avarage < 55) {
            System.out.println("Fail. Try again ): ): ):");
        }

    }
}