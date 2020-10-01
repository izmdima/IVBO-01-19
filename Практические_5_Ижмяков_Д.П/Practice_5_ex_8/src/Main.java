import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String str = "101";

        Pal pal = new Pal();
        pal.calc(str);
        if (pal.flag)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
