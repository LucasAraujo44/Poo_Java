public class Funcionario{
    int id;
    String nome;
    double salario;


    public Funcionario(int id, String nome, double salario){
    this.id = id;
    this.nome = nome;
    this.salario = salario;
    
    }
    public String toString(){
        return "Funcionario = id: "+id+", nome: "+nome+", salario: "+salario;
    }
}

