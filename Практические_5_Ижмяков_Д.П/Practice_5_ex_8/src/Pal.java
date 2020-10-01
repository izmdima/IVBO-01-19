public class Pal {
        public static boolean flag = true;

    public static int calc(String str) {
        if (str.length() == 1 ||  str.length() == 0)
            return 0;
        if (str.charAt(0) != str.charAt(str.length()-1))
            flag = false;


        return calc(str.substring(1,str.length()-1));
    }
}
