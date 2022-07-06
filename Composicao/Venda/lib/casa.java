public class casa{
    private double valor;
    private Cliente imovel;

public casa( double v, Cliente imovel ){
    this.valor = v;
    this.imovel = imovel;
}

public String toString(){
    return "O Valor do imovel é de: R$"+ this.valor + "," + imovel.toString();
}

public static void main(String[] args) throws Exception{
    casa v = new casa(+ 120000,new Cliente("Lucas", "Reduto"));
    System.out.println(v);
    
    }
}