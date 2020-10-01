import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();      // нули
        int b = scanner.nextInt();      // единицы

        W1 w1 = new W1();
        System.out.println(w1.calc(a,b));




    }
}
