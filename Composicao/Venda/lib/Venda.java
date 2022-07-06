public class Venda {
    private double valor;
    private Cliente cliente;

public Venda(int i, Cliente c){
    this.valor = i;
    this.cliente = c;
}
public String toString(){
    return "Valor: "+ this.valor + ", " + cliente.toString();
}
}