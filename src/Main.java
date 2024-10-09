public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        String ex2 = main.laSecuriteDuMusee(18);
        System.out.println(ex2);
    }

    public String laSecuriteDuMusee(int age) {
        final int MIN_AGE = 18;
        if (age >= MIN_AGE) return "Can enter.";
        return "Can not enter.";
    }
}