public class Funcionario extends Usuario {
    String cpf;
    
  public Funcionario (String l, String s, String cpf) {
      super(l, s);
      this.cpf = cpf;
  }
  public String toString(){
      return" Classe Funcionario: " +login+ " cpf: " +cpf;
  }
}
