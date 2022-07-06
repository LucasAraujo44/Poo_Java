

public class App   {
    public static void main(String[] args) throws Exception {
        Animal x = new Cachorro();
        System.out.println(x.som());
        Cachorro aux = (Cachorro)x;
        System.out.println(aux.metodoCachorro());
        System.out.println(((Cachorro)x).metodoCachorro());
    }
}
