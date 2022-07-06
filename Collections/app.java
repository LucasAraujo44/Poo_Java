import java.util.ArrayList;
import java.util.List;

public class app{
    public static void main(String[] args) throws Exception{
        List<Integer>lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        System.out.println(lista);
        for (Integer i : lista){
            System.out.println(i);
        }
    }
}