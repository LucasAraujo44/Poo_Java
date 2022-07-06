package src;

public class Array2D {
    public static void main (String[] args) {
        Produto_Array [] prods = new Produto_Array[5];
        prods [0] = new Produto_Array(1, "TV 50", 3000.70, 45);
        prods [1] = new Produto_Array(2,"S20", 2499.70, 200);
        prods [3] = new Produto_Array(3,"Sofa2l", 1900.70, 19);
        prods [4] = new Produto_Array(4,"Cadeira", 99.70, 30);
        prods [5] = new Produto_Array(5,"Hack", 1450.70, 5);
        
        for (Produto_Array p : prods) {
         System.out.println(p);
    
        }
    
    } 
     } 
  
