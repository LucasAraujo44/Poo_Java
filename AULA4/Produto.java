public class Produto{
    int id;
    String nome;
    double valor;

    public Produto(int id, String nome, double valor){
    this.id = id;
    this.nome = nome;
    this.valor = valor;
    
    }
    public String toString(){
        return "Produtos = id: "+id+", nome: "+nome+", valor: "+valor;
        
    }
    public static void main(String[] args) throws Exception {
        Produto a = new Produto(1, "Lucas", 1200.0);
        Produto b = new Produto(2, "André", 1300.0);
        Produto c = new Produto(3, "Paulo", 1500.0);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

     }
}