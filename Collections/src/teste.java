package src;

import java.util.ArrayList;
import java.util.List;

public class teste {
    public static void main(String[] args) throws Exception {
        List<Carro> lista = new ArrayList<Carro>();

        lista.add(new Carro("Ferrari"));
        lista.add(new Carro("Mercedes"));
        lista.add(new Carro("Jaguar"));
        lista.add(new Carro("Bmw"));


        System.out.println(lista);

        for (Carro tipo: lista){
            System.out.println(tipo);
        }
    }
}
