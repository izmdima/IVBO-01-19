public class Erest {
        static int count;



        public static int calc(int n) {

            count = 0;
            if (n == 1)
                return 0;

            for (int i = 2; i < n; ++i){
                if (n % i == 0)
                    ++count;
            }
            if (count == 0)
                System.out.print(n + "\t");

            return calc(n-1);
        }
}
