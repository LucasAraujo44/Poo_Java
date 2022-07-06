public class App {
    public static void main(String[] args) throws Exception {
        int [] values = {4, 8, 12, 3};

        Calc a = new Calc();
        System.out.println(a.media(values));

        System.out.println(Calc.staticMedia(values));

    }
}
