public class Jogo {
    public static int golsdoJogo;// variavel global
    public int bolanoGol;// bola que entram no gol

    public Jogo gol(){ // partida
        this.bolanoGol++;
        Jogo.golsdoJogo++;
        return this;
    }
    public static double mediaGols(int Jogo){
        return golsdoJogo/ Jogo; // não pode colocar "this"
     }
    public static void main (String[] args) {
        Jogo t1 = new Jogo();//time 1
        t1.gol().gol().gol();

        Jogo t2 = new Jogo();// time 2
        t2.gol().gol();
 
        System.out.println("Gols time A: "+t1.bolanoGol);// print de gols time 1
        System.out.println("Gols time B: "+t2.bolanoGol); // print de gols time 2
        System.out.println("A média de gols dessa partida foi: "+Jogo.golsdoJogo);// media de gols por partida
        System.out.println(Jogo.mediaGols(2));// atributos static
    } 
}