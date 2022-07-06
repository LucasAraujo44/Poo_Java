
public class App {
   
public static void main(String[] args){
Conta [] contas = new Conta[3];
contas[0] = new Conta (100);
contas[1] = new Conta (200);
contas[2] = new Conta (20);

for(Conta c:contas){
    System.out.println(c.saldo);
}
}
}
