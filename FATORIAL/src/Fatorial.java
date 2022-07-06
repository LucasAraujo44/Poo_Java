package src;

public class Fatorial {
    public static int recursivo(int n){
        if(n <= 1){
            return 1;
        } else {
            return n * recursivo(n-1);
        }   
    }

	public static int loop(int n) {
        int fat = 1;
        while(n >= 1){
            fat = fat * n;
            n = n-1;
        }
        return fat;
    }
}

