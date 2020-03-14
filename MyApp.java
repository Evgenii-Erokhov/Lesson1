package lesson1;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Привет");
        System.out.println(result(10,4,4,2));
        System.out.println(result(9.2354, 12.654));
        count(5);
        System.out.println(countMinus(-2));
        name("Михаил");
        year(2000);
    }

    public static void variables(String[] args) {
        byte a = -15;
        int b = 576513;
        long c = 4123156465L;
        float d = -614.45f;
        double e = 35.8;
        char f = '&';
    }

    public static int result(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    public static boolean result(double a, double b){
        return ((a + b) >= 10) && ((a + b) <= 20);
    }

    public static void count(int a) {
        if (a < 0){
            System.out.println("Число отрицательное");
        }else{
            System.out.println("Число положительное");
        }
    }

    public static boolean countMinus(int a) {
        return a < 0;
    }

    public static void name(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static void year(int a) {
        if (((a%4) == 0) && ((a%100) != 0) || (((a%400) == 0) && ((a%4) == 0))) {
            System.out.println(a + " год - високосный");
        }
    }
}