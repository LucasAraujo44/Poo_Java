public class Cliente {
    private String nome;
    private String celular;

    public Cliente(String nome, String celular){
        this.nome = nome;
        this.celular = celular;
    }
    public String toString(){
        return"Nome do proprietário: " + nome +", Bairro: " + celular;

    }
}