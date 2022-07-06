public class Teste{
    public void imprimir (int a ){
        System.out.println("Imprimir Int(a): " + a);
    }
    public void imprimir (int a, int b ){
        System.out.println("Imprimir Int(a, b): " + a +","+ b);
    }
    public void imprimir (String c ){
        System.out.println("Imprimir String (c): " + c);
}
public static void main (String [] args){
    Teste t = new Teste ();
    t.imprimir("Ok");
    t.imprimir(12);
    t.imprimir(12,3);
}

}