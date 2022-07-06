public class App {
    public static void main(String []args){
        Usuario u = new Usuario("admin", "123");
        System.out.println(u);
        System.out.println(u.autenticar("admin", "123"));

        Funcionario f = new Funcionario("Joao", "1234", "1121");
        System.out.println(f);
        System.out.println(f.autenticar("joao", "1234"));
    }
}
