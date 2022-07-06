package lib.src;

public class Produt {
    int id;
    String nome;
    double valorUnit;
    int qtd;

    public Produt(int id, String nome, double valor, int qtd) {
    this.id= id;
    this.nome = nome;
    this.valorUnit = valor;
    this.qtd = qtd;
    }
    public String toString(){
        return nome+": "+valorUnit;
    }

    public double valorTotal(){
        return valorUnit * qtd;
    }
    
   public static void main (String[] args) {
    Produt [] prods = new Produt[5];
    prods [0] = new Produt(1, "TV 50", 3000.70, 45);
    prods [1] = new Produt(2,"S20", 2499.70, 200);
    prods [2] = new Produt(3,"Sofa2l", 1900.70, 19);
    prods [3] = new Produt(4,"Cadeira", 99.70, 30);
    prods [4] = new Produt(5,"Hack", 1450.70, 5);
    
    double aux = 0;
    for (Produt p:prods) {
     aux += p.valorTotal();
     }
        System.out.println("Total: "+aux / prods.length);

    }

} 
 

