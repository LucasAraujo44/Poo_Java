package lib.src;

public class Teste {
    
public static class Produt {
    private final char[] length = null;
    String id;
    int idade;
    double altura;
    int peso;

    public Produt(String id, int idade, double altura, int peso) {
    this.id= id;
    this.idade = idade;
    this.altura = altura;
    this.peso = peso;

    }
    
   public static void main (String[] args) {
    Produt[] prods = new Produt[3];
    prods [0] = new Produt("Homem", 40 , 1.8, 90);
    prods [1] = new Produt("Mulher", 22 , 1.4, 50);
    prods [2] = new Produt("Homem", 23 , 1.67, 85);
   
    for (Produt a : prods) {
        System.out.println(a.length);
     }
        

    }

} 

}
