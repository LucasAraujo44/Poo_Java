public class Variavel {
    public int contador;
    public static int contador2 = 0;
    public void add(){
        this.contador +=1;
        contador2 +=1;
    }
    public void print (){
        System.out.println("contador: "+contador);
        System.out.println("contador2: "+contador2);

    }
}
