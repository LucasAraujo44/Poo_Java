public class Selvagens   {
    public void imprimir (String a ){
        System.out.println("Animal selvagem: " + a);
}
    public void imprimir (int b ){
        System.out.println("Qual a quantidade em kg que esse animal se alimenta por dia : " + b+ " Kg");
}
public static void main (String [] args){
    Selvagens s = new Selvagens ();
    s.imprimir("Tigre");
    s.imprimir(10);

}
}
