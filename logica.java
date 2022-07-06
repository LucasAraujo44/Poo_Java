public class logica{
    public static void main (String[] args){
    int anterior = 0;
    int proximo = 1;
        System.out.println(anterior);
        
while (proximo < 5) {
     System.out.println(proximo);
     proximo = proximo + anterior;
      anterior = proximo - anterior;
        }
    }
}
