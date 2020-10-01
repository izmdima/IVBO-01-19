
public class W1 {


    public static int calc(int a, int b) {

        if (a == 0 && b != 0)
            return 1;
        else if (a == 1 && b != 0)
            return b+1;
        else if (a > 1 && b == 0)
            return 0;
        else {
            return calc(a-1,b-1) + calc(a,b-1);
        }

    }


}
