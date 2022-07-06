public class Calc{
    public double media (int[] a){
        int soma = 0;
        for(int i: a) {
            soma += i;

        }
        return soma / (double) a.length; // pegar a soma e d dividir os arrays
    }
    public static double staticMedia(int[] a){
        int soma = 0;
        for(int i: a){ 
            soma += i;
        }
        return soma / (double) a.length;
    }
}