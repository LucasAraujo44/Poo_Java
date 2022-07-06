public class ArrayInt {

    public static void main (String[] arg) {
        int[] a = {12, 34, 54, 89} ;
    for( int i = 0; i <4; i++){
        System.out.println("i: "+i+ "a"+a[i]+" ");
    
     }
     System.out.println("");
     for( int i = 0; i <a.length; i++){
        System.out.println("i: "+i+ "="+a[i]+" ");
    
     }
     System.out.println("");
     for(int x :a){
         System.out.print(x +" ");
     }
    }
}